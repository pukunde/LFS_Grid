package com.NFK.version1.iOS.component;

import java.util.List;

import com.NFK.support.LFSUtilsIOS;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class PatternComponent extends QAFWebComponent{
	
	public PatternComponent(String locator) {
		super(locator);
	}
	

	@FindBy(locator = "NFK.pattern.patternfield.img")
	private List<QAFWebElement> NFKPatternPatterniconImg;
	
	@FindBy(locator = "NFKios.pattern.statictext")
	private List<QAFWebElement> NFKiosPatternStaticTextCmp;

	
	public List<QAFWebElement> getNFKPatternPatterniconImg() {
		return NFKPatternPatterniconImg;
	}

	public List<QAFWebElement> getNFKiosPatternStaticTextCmp() {
		return NFKiosPatternStaticTextCmp;
	}
}
