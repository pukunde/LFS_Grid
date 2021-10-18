package com.NFK.version1.listener;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.LogFactoryImpl;
import org.openqa.selenium.remote.DriverCommand;

import com.qmetry.qaf.automation.core.QAFListenerAdapter;
import com.qmetry.qaf.automation.ui.webdriver.CommandTracker;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;



public class IosLocatorCompatibilityListener extends QAFListenerAdapter {
	private final Log logger = LogFactoryImpl.getLog(IosLocatorCompatibilityListener.class);

	@Override
	public void beforeCommand(QAFExtendedWebDriver driver, CommandTracker commandTracker) {
		if (commandTracker.getCommand().equalsIgnoreCase(DriverCommand.FIND_ELEMENT)
				|| commandTracker.getCommand().equalsIgnoreCase(DriverCommand.FIND_ELEMENTS)
				|| commandTracker.getCommand().equalsIgnoreCase(DriverCommand.FIND_CHILD_ELEMENT)
				|| commandTracker.getCommand().equalsIgnoreCase(DriverCommand.FIND_CHILD_ELEMENTS)) {

			String version = driver.getCapabilities().getVersion();
				if (is9OrBelow(version)) {
					ensureIos9Compatibility(commandTracker.getParameters());
				} else {
					ensureIos11Compatibility(commandTracker.getParameters());
				}
			
		}
	}

	private boolean is9OrBelow(String ver) {
		return Integer.parseInt(ver.substring(0, 1)) <= 9;
	}

	private void ensureIos9Compatibility(Map<String, Object> parameters) {
		String loc = (String) parameters.get("value");

		boolean migrated = false;
		for (IosElementType elementType : IosElementType.values()) {
			if (loc.contains(elementType.toXCUIElement())) {
				loc = loc.replaceAll(elementType.toXCUIElement(), elementType.name());
				migrated = true;
			}
		}
		if (migrated) {
			logger.info(
					"[IOS9 compatibility] Migrating locator from [" + parameters.get("value") + "] to [" + loc + "]");
			parameters.put("value", "loc");
		}
	}

	private void ensureIos11Compatibility(Map<String, Object> parameters) {
		String loc = (String) parameters.get("value");
		boolean migrated = false;

		for (IosElementType elementType : IosElementType.values()) {
			if (loc.contains(elementType.name())) {
				loc = loc.replaceAll(elementType.name(), elementType.toXCUIElement());
				migrated = true;
			}
		}
		if (migrated) {
			logger.info(
					"[IOS9 compatibility] Migrating locator from [" + parameters.get("value") + "] to [" + loc + "]");
			parameters.put("value", "loc");
		}
	}

	private enum IosElementType {

		UIApplication,

		UIAActionSheet("XCUIElementTypeSheet"),

		UIAActivityIndicator,

		UIAAlert,

		UIAButton,

		UIACollectionCell("XCUIElementTypeCell"),

		UIACollectionView,

		UIAEditingMenu("XCUIElementTypeMenu"),

		UIAElement("XCUIElementTypeAny"),

		UIAImage,

		UIAKey,

		UIAKeyboard,

		UIALink,

		UIAMapView("XCUIElementTypeMap"),

		UIANavigationBar,

		UIAPageIndicator,

		UIAPicker,

		UIAPickerWheel,

		UIAPopover,

		UIAProgressIndicator,

		UIAScrollView,

		UIASearchBar("XCUIElementTypeSearchField"),

		UIASecureTextField,

		UIASegmentedControl,

		UIASlider,

		UIAStaticText,

		UIAStatusBar,

		UIASwitch,

		UIATabBar,

		// XCUIElementTypeTableRow
		UIATableCell("XCUIElementTypeTableColumn"),

		UIATableGroup("XCUIElementTypeOther"),

		UIATableView("XCUIElementTypeTable"),

		UIATextField,

		UIATextView,

		UIAToolbar,

		UIAWebView,

		UIAWindow;
		private String xCUIElement;

		IosElementType(String xCUIElement) {
			this.xCUIElement = xCUIElement;
		}

		IosElementType() {
			this.xCUIElement = name().replace("UIA", "XCUIElementType");
		}

		public String toXCUIElement() {
			return xCUIElement;
		}
	}
}