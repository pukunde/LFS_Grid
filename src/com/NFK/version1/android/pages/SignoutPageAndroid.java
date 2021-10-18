package com.NFK.version1.android.pages;

import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;


public class SignoutPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFK.homepage.menu.icon")
	private QAFWebElement NFKHomepageMenuIcon;
	@FindBy(locator = "NFK.hamburgermenu.account.btn")
	private QAFWebElement NFKHamburgermenuAccountBtn;
	@FindBy(locator = "NFK.accountpage.signout.btn")
	private QAFWebElement NFKAcconutpageSignoutBtn;

	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}

	public QAFWebElement getNFKHomepageMenuIcon() {
		return NFKHomepageMenuIcon;
	}

	public QAFWebElement getNFKHamburgermenuAccountBtn() {
		return NFKHamburgermenuAccountBtn;
	}

	public QAFWebElement getNFKAcconutpageSignoutBtn() {
		return NFKAcconutpageSignoutBtn;
	}

	// Signing out
	public void signOut() {

		getNFKHomepageMenuIcon().click();
		if (getNFKHamburgermenuAccountBtn().isPresent()) {			
			Reporter.logWithScreenShot(getNFKHamburgermenuAccountBtn().getText() + " option present",
					MessageTypes.Pass);

			if (getNFKHamburgermenuAccountBtn().getText().equalsIgnoreCase("Account")) {
				getNFKHamburgermenuAccountBtn().waitForPresent();
				getNFKHamburgermenuAccountBtn().click();
				getNFKAcconutpageSignoutBtn().isPresent();
				Reporter.logWithScreenShot("Clicking on Signout button", MessageTypes.Pass);
				getNFKAcconutpageSignoutBtn().click();
			}
		}
	}
}
