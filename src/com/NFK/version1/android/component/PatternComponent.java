package com.NFK.version1.android.component;

import java.util.List;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class PatternComponent extends QAFWebComponent{
	
	public PatternComponent(String locator) {
		super(locator);
	}
	
	@FindBy(locator = "NFK.pattern.patterndescription.lbl")
	private QAFWebElement NFKPatternPatterndescriptionLbl;
	@FindBy(locator = "NFK.pattern.bgbubble.value.lbl")
	private List<QAFWebElement> NFKPatternBgbubblelValueLbl;
	@FindBy(locator = "NFK.pattern.patternfield.img")
	private QAFWebElement NFKPatternPatterniconImg;


	
	
	public List<QAFWebElement> getNFKPatternBgbubblelValueLbl() {
		return NFKPatternBgbubblelValueLbl;
	}
	public QAFWebElement getNFKPatternPatterndescriptionLbl() {
		return NFKPatternPatterndescriptionLbl;
	}
	
	public QAFWebElement getNFKPatternPatterniconImg() {
		return NFKPatternPatterniconImg;
	}

}
