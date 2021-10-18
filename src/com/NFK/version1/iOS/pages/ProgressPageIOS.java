package com.NFK.version1.iOS.pages;

import org.testng.Assert;
import org.testng.AssertJUnit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.component.PatternComponent;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.testng.report.Report;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.ios.IOSDriver;

public class ProgressPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFKios.logbook.totalpattern.lbl")
	private QAFWebElement NFKiosLogbookTotalpatternLbl;
	@FindBy(locator = "NFKios.pattern.lowcount.lbl")
	private QAFWebElement NFKiosPatternLowcountLbl;
	@FindBy(locator = "NFKios.pattern.highcount.lbl")
	private QAFWebElement NFKiosPatternHighcountLbl;
	@FindBy(locator = "NFKios.pattern.patternlist.comp")
	private List<PatternComponent> NFKiosPatternPatternComponentList;

	//Pattern
	@FindBy(locator="NFKios.homepage.myprogress.btn")
	private QAFWebElement NFKiosHomepageMyprogressBtn;
	@FindBy(locator="NFKios.homepage.myprogress.range.7day.btn")
    private QAFWebElement NFKiosMyprogressRange7dayBtn;
	@FindBy(locator="NFKios.homepage.myprogress.range.14day.btn")
    private QAFWebElement NFKiosMyprogressRange14dayBtn;
	@FindBy(locator="NFKios.homepage.myprogress.range.30day.btn")
    private QAFWebElement NFKiosMyprogressRange30dayBtn;
	@FindBy(locator="NFKios.homepage.myprogress.range.60day.btn")
    private QAFWebElement NFKiosMyprogressRange60dayBtn;
	@FindBy(locator="NFKios.homepage.myprogress.range.90day.btn")
    private QAFWebElement NFKiosMyprogressRange90dayBtn;
	@FindBy(locator="NFKios.progresspage.rangeday.lbl")
    private QAFWebElement NFKiosProgresspageRangedayLbl;
	@FindBy(locator="NFKios.progresspage.compare.lbl")
    private QAFWebElement NFKiosProgresspageCompareLbl;
	@FindBy(locator="NFKios.progresspage.switch.btn")
	private QAFWebElement NFKiosProgresspageSwitchBtn;
	@FindBy(locator="NFKios.progresspage.glucose.avg.lbl")
	private QAFWebElement NFKiosProgresspagGlucoseAvgLbl;
	@FindBy(locator="NFKios.progresspage.glucose.avg.value")
    private QAFWebElement NFKiosProgresspageGlucoseAvgValue;
	@FindBy(locator="NFKios.progresspage.gmi.lbl")
	private QAFWebElement NFKiosProgresspageGmiLbl;
	@FindBy(locator="NFKios.progresspage.gmi.value")
	private QAFWebElement NFKiosProgresspageGmiValue;
	@FindBy(locator="NFKios.progresspage.low.lbl")
    private QAFWebElement NFKiosProgresspageLowLbl;
	@FindBy(locator="NFKios.progresspage.inrange.lbl")
	private QAFWebElement NFKiosProgresspageInrangeLbl;
	@FindBy(locator="NFKios.progresspage.high.lbl")
	private QAFWebElement NFKiosProgresspageHighlbl;
	@FindBy(locator="NFKios.progresspage.low.value")
    private QAFWebElement NFKiosProgresspageLowValue;
	@FindBy(locator="NFKios.progresspage.inrange.value")
	private QAFWebElement NFKiosProgresspageInrangeValue;
	@FindBy(locator="NFKios.progresspage.high.value")
	private QAFWebElement NFKiosProgresspageHighValue;
	@FindBy(locator="NFKios.progresspage.chartview")
    private QAFWebElement NFKiosProgresspageChartview;
	@FindBy(locator="NFKios.progresspage.carasouel")
	private QAFWebElement NFKiosProgresspageCarasouel;
	
	@FindBy(locator="NFKios.progresspage.compr.avg.lbl")
	private QAFWebElement NFKiosProgresspageComprAvgLbl;
	@FindBy(locator="NFKios.progresspage.compr.gmi.title")
	private QAFWebElement NFKiosProgresspageComprGmiTitle;
	@FindBy(locator="NFKios.progresspage.compr.low.lbl")
	private QAFWebElement NFKiosProgresspageComprLowLbl;
	@FindBy(locator="NFKios.progresspage.compr.inrange.lbl")
	private QAFWebElement NFKiosProgresspageComprInrangeLbl;
	@FindBy(locator="NFKios.progresspage.compr.high.lbl")
	private QAFWebElement NFKiosProgresspageComprHighLbl;
	@FindBy(locator="NFKios.progresspage.compr.pre.avg.val")
	private QAFWebElement NFKiosProgresspageComprPreAvgVal;
	@FindBy(locator="NFKios.progresspage.compr.curr.avg.val")
	private QAFWebElement NFKiosProgresspageComprCurrAvgVal;
	@FindBy(locator="NFKios.progresspage.compr.pre.gmi.val")
	private QAFWebElement NFKiosProgresspageComprPreGmiVal;
	@FindBy(locator="NFKios.progresspage.compr.curr.gmi.val")
	private QAFWebElement NFKiosProgresspageComprCurrGmiVal;
	@FindBy(locator="NFKios.progresspage.compr.low.pre.val")
	private QAFWebElement NFKiosProgresspageComprLowPreVal;
	@FindBy(locator="NFKios.progresspage.compr.inrange.pre.val")
	private QAFWebElement NFKiosProgresspageComprInrangePreVal;
	@FindBy(locator="NFKios.progresspage.compr.high.pre.val")
	private QAFWebElement NFKiosProgresspageComprHighPreVal;
	@FindBy(locator="NFKios.progresspage.compr.low.curr.val")
	private QAFWebElement NFKiosProgresspageComprLowCurrVal;
	@FindBy(locator="NFKios.progresspage.compr.inrange.curr.val")
	private QAFWebElement NFKiosProgresspageComprInrangeCurrVal;
	@FindBy(locator="NFKios.progresspage.compr.high.curr.val")
	private QAFWebElement NFKiosProgresspageComprHighCurrVal;
	@FindBy(locator="NFKios.progresspage.compr.pre.chart")
	private QAFWebElement NFKiosProgresspageComprPreChart;
	@FindBy(locator="NFKios.progresspage.compr.curr.chart")
	private QAFWebElement NFKiosProgresspageComprCurrChart;
	@FindBy(locator="NFKios.progresspage.compr.pie.chartdate.pre")
	private QAFWebElement NFKiosProgresspageComprPieChartdatePre;
	
	@FindBy(locator="NFKios.progresspage.low.info.icon")
	private QAFWebElement NFKiosProgresspageLowInfoIcon;
	@FindBy(locator="NFKios.progresspage.agp.info.icon")
	private QAFWebElement NFKiosProgresspageAgpInfoIcon;
	@FindBy(locator="NFKios.progresspage.slideup.close.btn")
	private QAFWebElement NFKiosProgresspageSlideupCloseBtn;
	@FindBy(locator="NFKios.progresspage.slideup.txt")
	private QAFWebElement NFKiosProgresspageSlideupTxt;
	@FindBy(locator="NFKios.progresspage.slideup.title")
	private QAFWebElement NFKiosProgresspageSlideupTitle;
	
	//Low Events loc
	@FindBy(locator="NFKios.progresspage.low.chart")
	private QAFWebElement NFKiosProgresspageLowChart;
	@FindBy(locator="NFKios.progresspage.low.event.lbl")
	private QAFWebElement NFKiosProgresspageLowEventLbl;
	@FindBy(locator="NFKios.progresspage.low.avg.lbl")
	private QAFWebElement NFKiosProgresspageLowAvgLbl;
	@FindBy(locator="NFKios.progresspage.low.event.count")
	private QAFWebElement NFKiosProgresspageLowEventCount;
	@FindBy(locator="NFKios.progresspage.low.avg.duration")
	private QAFWebElement NFKiosProgresspageLowAvgDuration;
	@FindBy(locator="NFKios.progresspage.low.title")
	private QAFWebElement NFKiosProgresspageLowTitle;
	@FindBy(locator="NFKios.progresspage.low.lowest.value")
	private QAFWebElement NFKiosProgresspageLowLowestValue;
	@FindBy(locator="NFKios.progresspage.low.most.events")
	private QAFWebElement NFKiosProgresspageLowMosEvents;
	@FindBy(locator="NFKios.progresspage.low.start.hr")
	private QAFWebElement NFKiosProgresspageLowStartHr;
	@FindBy(locator="NFKios.progresspage.low.end.hr")
	private QAFWebElement NFKiosProgresspageLowEndHr;
	@FindBy(locator="NFKios.progresspage.low.title.sc")
	private QAFWebElement NFKiosProgresspageLowTitleSc;
	@FindBy(locator="NFKios.progresspage.low.bck.btn")
	private QAFWebElement NFKiosProgresspageLowBckBtn;
	@FindBy(locator="NFKios.progresspage.low.sub.title")
	private QAFWebElement NFKiosProgresspageLowSubTitle;
	@FindBy(locator="NFKios.progresspage.low.event.cell")
	private QAFWebElement NFKiosProgresspageLowEventCell;
    @FindBy(locator="NFKios.progresspage.low.events.glucose")
    private List<QAFWebElement> NFKiosProgresspageLowEventsGlucose;
	
    //AGP
    @FindBy(locator="NFKios.progresspage.agp.title")
    private QAFWebElement NFKiosProgresspageAgpTitle;
    @FindBy(locator="NFKios.progresspage.glucoseprofile.title")
    private List<QAFWebElement> NFKiosProgresspageGlucoseprofileTitle;
    @FindBy(locator="NFKios.progresspage.glucose.desc")
    private List<QAFWebElement> NFKiosProgresspageGlucoseDesc;
    @FindBy(locator="NFKios.progresspage.view.agpreport")
    private QAFWebElement NFKiosProgresspageViewAgpReport;
    @FindBy(locator="NFKios.progresspage.pdf.close.btn")
    private QAFWebElement NFKiosProgresspagePdfCloseBtn;
    
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	//AGP
	public QAFWebElement getNFKiosProgresspagePdfCloseBtn() {
		return NFKiosProgresspagePdfCloseBtn;
	}
	public QAFWebElement getNFKiosProgresspageAgpTitle() {
		return NFKiosProgresspageAgpTitle;
	}
	public List<QAFWebElement> getNFKiosProgresspageGlucoseprofileTitle()
	{
		return NFKiosProgresspageGlucoseprofileTitle;
	}	
	public List<QAFWebElement> getNFKiosProgresspageGlucoseDesc()
	{
		return NFKiosProgresspageGlucoseDesc;
	}
	public QAFWebElement getNFKiosProgresspageViewAgpReport() {
		return NFKiosProgresspageViewAgpReport;
	}
	//Low event
	public List<QAFWebElement> getNFKiosProgresspageLowEventsGlucose() {
		return NFKiosProgresspageLowEventsGlucose;
	}
	public QAFWebElement getNFKiosProgresspageLowChart(){
		return NFKiosProgresspageLowChart;
	}
	public QAFWebElement getNFKiosProgresspageLowEventLbl(){
		return NFKiosProgresspageLowEventLbl;
	}
	public QAFWebElement getNFKiosProgresspageLowAvgLbl(){
		return NFKiosProgresspageLowAvgLbl;
	}
	public QAFWebElement getNFKiosProgresspageLowEventCount(){
		return NFKiosProgresspageLowEventCount;
	}
	public QAFWebElement getNFKiosProgresspageLowAvgDuration(){
		return NFKiosProgresspageLowAvgDuration;
	}
	public QAFWebElement getNFKiosProgresspageLowTitle(){
		return NFKiosProgresspageLowTitle;
	}
	public QAFWebElement getNFKiosProgresspageLowLowestValue(){
		return NFKiosProgresspageLowLowestValue;
	}
	public QAFWebElement getNFKiosProgresspageLowMosEvents(){
		return NFKiosProgresspageLowMosEvents;
	}
	public QAFWebElement getNFKiosProgresspageLowStartHr(){
		return NFKiosProgresspageLowStartHr;
	}
	public QAFWebElement getNFKiosProgresspageLowEndHr(){
		return NFKiosProgresspageLowEndHr;
	}
	public QAFWebElement getNFKiosProgresspageLowTitleSc(){
		return NFKiosProgresspageLowTitleSc;
	}
	public QAFWebElement getNFKiosProgresspageLowBckBtn() {
		return NFKiosProgresspageLowBckBtn;
	}
	public QAFWebElement getNFKiosProgresspageLowSubTitle() {
		return NFKiosProgresspageLowSubTitle;
	}
	public QAFWebElement getNFKiosProgresspageLowEventCell() {
		return NFKiosProgresspageLowEventCell;
	}
	
	
	public QAFWebElement getNFKiosProgresspageLowInfoIcon() {
		return NFKiosProgresspageLowInfoIcon;
	}
	public QAFWebElement getNFKiosProgresspageSlideupTxt() {
		return NFKiosProgresspageSlideupTxt;
	}
	public QAFWebElement getNFKiosProgresspageSlideupTitle() {
		return NFKiosProgresspageSlideupTitle;
	}
	public QAFWebElement getNFKiosProgresspageAgpInfoIcon() {
		return NFKiosProgresspageAgpInfoIcon; 
	}
	public QAFWebElement getNFKiosProgresspageSlideupCloseBtn() {
		return NFKiosProgresspageSlideupCloseBtn; 
	}
	public QAFWebElement getNFKiosProgresspageComprPreChart() {
		return NFKiosProgresspageComprPreChart;
	}
	public QAFWebElement getNFKiosProgresspageComprPieChartdatePre() {
		return NFKiosProgresspageComprPieChartdatePre;
	}
	public QAFWebElement getNFKiosProgresspageComprCurrChart() {
		return NFKiosProgresspageComprCurrChart;
	}
	public QAFWebElement getNFKiosProgresspageComprAvgLbl() {
		return NFKiosProgresspageComprAvgLbl;
	}
	public QAFWebElement getNFKiosProgresspageComprGmiTitle() {
		return NFKiosProgresspageComprGmiTitle;
	}
	public QAFWebElement getNFKiosProgresspageComprLowLbl() {
		return NFKiosProgresspageComprLowLbl;
	}
	public QAFWebElement getNFKiosProgresspageComprInrangeLbl() {
		return NFKiosProgresspageComprInrangeLbl;
	}
	public QAFWebElement getNFKiosProgresspageComprHighLbl() {
		return NFKiosProgresspageComprHighLbl;
	}
	public QAFWebElement getNFKiosProgresspageComprPreAvgVal() {
		return NFKiosProgresspageComprPreAvgVal;
	}
	public QAFWebElement getNFKiosProgresspageComprCurrAvgVal() {
		return NFKiosProgresspageComprCurrAvgVal;
	}
	public QAFWebElement getNFKiosProgresspageComprPreGmiVal() {
		return NFKiosProgresspageComprPreGmiVal;
	}
	public QAFWebElement getNFKiosProgresspageComprCurrGmiVal() {
		return NFKiosProgresspageComprCurrGmiVal;
	}
	public QAFWebElement getNFKiosProgresspageComprLowPreVal() {
		return NFKiosProgresspageComprLowPreVal;
	}
	public QAFWebElement getNFKiosProgresspageComprInrangePreVal() {
		return NFKiosProgresspageComprInrangePreVal;
	}
	public QAFWebElement getNFKiosProgresspageComprHighPreVal() {
		return NFKiosProgresspageComprHighPreVal;
	}
	public QAFWebElement getNFKiosProgresspageComprLowCurrVal() {
		return NFKiosProgresspageComprLowCurrVal;
	}
    public QAFWebElement  getNFKiosProgresspageComprInrangeCurrVal() {
    	return NFKiosProgresspageComprInrangeCurrVal;
    }
	public QAFWebElement getNFKiosProgresspageComprHighCurrVal() {
		return NFKiosProgresspageComprHighCurrVal;
	}
    
	public QAFWebElement getNFKiosHomepageMyprogressBtn() {
		return NFKiosHomepageMyprogressBtn;
	}
	public QAFWebElement getNFKiosProgresspageCarasouel() {
		return NFKiosProgresspageCarasouel;
	}
	public QAFWebElement getNFKiosMyprogressRange7dayBtn() {
		return NFKiosMyprogressRange7dayBtn;
	}
	public QAFWebElement getNFKiosMyprogressRange14dayBtn() {
		return NFKiosMyprogressRange14dayBtn;
	}
	public QAFWebElement getNFKiosMyprogressRange30dayBtn() {
		return NFKiosMyprogressRange30dayBtn;
	}
	public QAFWebElement getNFKiosMyprogressRange60dayBtn() {
		return NFKiosMyprogressRange60dayBtn;
	}
	public QAFWebElement getNFKiosMyprogressRange90dayBtn() {
		return NFKiosMyprogressRange90dayBtn;
	}
	public QAFWebElement getNFKiosProgresspageRangedayLbl() {
		return NFKiosProgresspageRangedayLbl;
	}
	public QAFWebElement getNFKiosProgresspageCompareLbl() {
		return NFKiosProgresspageCompareLbl;
	}
	public QAFWebElement getNFKiosProgresspageSwitchBtn() {
		return NFKiosProgresspageSwitchBtn;
	}
	public QAFWebElement getNFKiosProgresspagGlucoseAvgLbl() {
		return NFKiosProgresspagGlucoseAvgLbl;
	}
	public QAFWebElement getNFKiosProgresspageGlucoseAvgValue() {
		return NFKiosProgresspageGlucoseAvgValue;
	}
	public QAFWebElement getNFKiosProgresspageGmiLbl() {
		return NFKiosProgresspageGmiLbl;
	}
	public QAFWebElement getNFKiosProgresspageGmiValue() {
		return NFKiosProgresspageGmiValue;
	}
	public QAFWebElement getNFKiosProgresspageLowLbl() {
		return NFKiosProgresspageLowLbl;
	}
	public QAFWebElement getNFKiosProgresspageInrangeLbl() {
		return NFKiosProgresspageInrangeLbl;
	}
	public QAFWebElement getNFKiosProgresspageHighlbl() {
		return NFKiosProgresspageHighlbl;
	}
	public QAFWebElement getNFKiosProgresspageLowValue() {
		return NFKiosProgresspageLowValue;
	}
	public QAFWebElement getNFKiosProgresspageInrangeValue() {
		return NFKiosProgresspageInrangeValue;
	}
	public QAFWebElement getNFKiosProgresspageHighValue() {
		return NFKiosProgresspageHighValue;
	}
	public QAFWebElement getNFKiosProgresspageChartview() {
		return NFKiosProgresspageChartview;
	}
	
	public QAFWebElement getNFKiosProgresspageStaticText(String text) {
		return LFSUtilsIOS.getElement("NFKios.progresspage.static.lbl", text);
	}
	public QAFWebElement getNFKiosProgresspageLowTotalEventCountGrph(String text1)
	{
		return LFSUtilsIOS.getElement("NFKios.progresspage.low.total.event.count.grph", text1);
	}
	public List<PatternComponent> getNFKiosPatternPatternComponentList() {
		return NFKiosPatternPatternComponentList;
	}

	public QAFWebElement getNFKiosLogbookTotalpatternLbl() {
		return NFKiosLogbookTotalpatternLbl;
	}

	public QAFWebElement getNFKiosPatternLowcountLbl() {
		return NFKiosPatternLowcountLbl;
	}

	public QAFWebElement getNFKiosPatternHighcountLbl() {
		return NFKiosPatternHighcountLbl;
	}

	private IOSDriver iosDriver = (IOSDriver) driver.getUnderLayingDriver();

	public void verifyNoOFPatternCount(String low, String high) {
		int total = Integer.parseInt(low) + Integer.parseInt(high);
		WebDriverTestCase.verifyTrue(
				getNFKiosLogbookTotalpatternLbl().getText().contains(total + ""),
				"Count is incorrect",
				"Total " + getNFKiosLogbookTotalpatternLbl().getText());
		WebDriverTestCase.verifyTrue(getNFKiosPatternLowcountLbl().getText().contains(low),
				"Count is incorrect", "Count " + getNFKiosPatternLowcountLbl().getText());
		WebDriverTestCase.verifyTrue(getNFKiosPatternHighcountLbl().getText().contains(high),
				"Count is incorrect", "Count " + getNFKiosPatternHighcountLbl().getText());

	}

	public void verifyBlankPatternPage() {
		WebDriverTestCase.verifyTrue(
				getNFKiosLogbookTotalpatternLbl().getText().contains(0 + ""),
				"Pettern present",
				"Pattern screen is blank " + getNFKiosLogbookTotalpatternLbl().getText());
	}
	public void verfyPatternDetail() {
		getNFKiosLogbookTotalpatternLbl().waitForPresent();
		for (int i = 0; i < getNFKiosPatternPatternComponentList().size(); i++) {
			PatternComponent ptrn = getNFKiosPatternPatternComponentList().get(i);
			if (i == 0) {
				WebDriverTestCase.verifyTrue(
						ptrn.getNFKiosPatternStaticTextCmp().get(0).getText().contains(
								LFSUtilsIOS.getPropString("readingsHigh.bg1"))
								&& ptrn.getNFKiosPatternStaticTextCmp().get(1).getText()
										.contains(LFSUtilsIOS
												.getPropString("readingsHigh.bg2"))
								&& ptrn.getNFKiosPatternStaticTextCmp().get(2).getText()
										.contains(LFSUtilsIOS
												.getPropString("readingsHigh.bg3")),
						"Pettern High value are incorrect",
						"Pattern High value are correct");

			}
			if (i == 1) {
				WebDriverTestCase.verifyTrue(
						ptrn.getNFKiosPatternStaticTextCmp().get(0).getText().contains(
								LFSUtilsIOS.getPropString("readingsLow.bg1"))
								&& ptrn.getNFKiosPatternStaticTextCmp().get(1).getText()
										.contains(LFSUtilsIOS
												.getPropString("readingsLow.bg2")),
						"Pettern Low value are incorrect",
						"Pattern Low value are correct");

			}
		}
	}
	
	//Method to click on generated pattern using number from the list
	
	public void clickOnPatternFromList( String numb) {
		getNFKiosPatternPatternComponentList().get(Integer.parseInt(numb)-1).click();
	}

	public void clickProgressBar() {
		getNFKiosHomepageMyprogressBtn().isPresent();
		getNFKiosHomepageMyprogressBtn().click();
		Reporter.log("User has clicked on Progress button");
		getNFKiosProgresspageStaticText(LFSUtilsIOS.getPropString("my.pogress.title")).assertPresent("My progress");;
	}

	public void verifyProgressScreen() {
		getNFKiosProgresspageRangedayLbl().assertPresent("Select range day title");
		getNFKiosMyprogressRange7dayBtn().isEnabled();
		getNFKiosMyprogressRange14dayBtn().assertPresent("14 day button");
		getNFKiosMyprogressRange30dayBtn().assertPresent("30 day button");
		getNFKiosMyprogressRange60dayBtn().assertPresent("60 day button");
		getNFKiosMyprogressRange90dayBtn().assertPresent("90 day button");
		getNFKiosProgresspageCompareLbl().assertPresent("Compare with previous period lbl");
		getNFKiosProgresspageSwitchBtn().getText().equals("OFF");
		
	}

	public void verifyAverage(String opt) {
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMM dd");
		LocalDateTime myDateObj=LocalDateTime.now().minusDays(6);
		String formattedDate = myFormatObj.format(myDateObj);
		switch(opt) {
		case "7":
		 getNFKiosMyprogressRange7dayBtn().isEnabled();
		 verifyAvgGMI(opt);
		 break;
		case "14":
			getNFKiosMyprogressRange14dayBtn().click();
			getNFKiosMyprogressRange14dayBtn().isEnabled();
			verifyAvgGMI(opt);
			break;
		case "30":
			getNFKiosMyprogressRange30dayBtn().click();
			getNFKiosMyprogressRange30dayBtn().isEnabled();
			verifyAvgGMI(opt);
			break;
		case "60":
			getNFKiosMyprogressRange60dayBtn().click();
			getNFKiosMyprogressRange60dayBtn().isEnabled();
			verifyAvgGMI(opt);
			break;
		case "90":
			getNFKiosMyprogressRange90dayBtn().click();
			getNFKiosMyprogressRange90dayBtn().isEnabled();
			verifyAvgGMI(opt);
			break;
		}	   
	}

	private void verifyAvgGMI(String opt) {
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMM dd");
		int i=Integer.parseInt(opt);  
		LocalDateTime myDateObj=LocalDateTime.now().minusDays(i-1);
		String formattedDate = myFormatObj.format(myDateObj);
		System.out.println("Get 7 days before Date"+formattedDate);
		getNFKiosProgresspagGlucoseAvgLbl().isPresent();
		getNFKiosProgresspageGmiLbl().isPresent();
		String datecheck=formattedDate.concat("toToday");
		if(opt.equals("7")) {
			LFSUtilsIOS.waitforLoad();
			getNFKiosProgresspageRangedayLbl().assertPresent(getNFKiosProgresspageRangedayLbl().getText());
			
			Assert.assertEquals(getNFKiosProgresspageGlucoseAvgValue().getText(),
					LFSUtilsIOS.getPropString("my.progress.avg.value").concat(" mg/dL"));
			Assert.assertTrue(getNFKiosProgresspageGmiValue().getText().equals("--%"));
			Assert.assertEquals(getNFKiosProgresspageLowValue().getText(),LFSUtilsIOS.getPropString("my.progress.low.per"));
			Assert.assertEquals(getNFKiosProgresspageInrangeValue().getText(),LFSUtilsIOS.getPropString("my.progress.inrange.per"));
			Assert.assertEquals(getNFKiosProgresspageHighValue().getText(),LFSUtilsIOS.getPropString("my.progress.high.per"));
				getNFKiosProgresspageStaticText(datecheck).isPresent();
		}
		else
		{
			LFSUtilsIOS.waitforLoad();
			Assert.assertEquals(getNFKiosProgresspageGlucoseAvgValue().getText(),
					LFSUtilsIOS.getPropString("my.progress.avg.value").concat(" mg/dL"));
			getNFKiosProgresspageRangedayLbl().assertPresent(getNFKiosProgresspageRangedayLbl().getText());

		Assert.assertEquals(getNFKiosProgresspageGmiValue().getText(),
				LFSUtilsIOS.getPropString("my.progress.gmi.value").concat("%"));
		Assert.assertEquals(getNFKiosProgresspageLowValue().getText(),LFSUtilsIOS.getPropString("my.progress.low.per"));
		Assert.assertEquals(getNFKiosProgresspageInrangeValue().getText(),LFSUtilsIOS.
				getPropString("my.progress.inrange.per"));
		Assert.assertEquals(getNFKiosProgresspageHighValue().getText(),LFSUtilsIOS.getPropString("my.progress.high.per"));
		getNFKiosProgresspageStaticText(datecheck).isPresent();
		
	
		}
	}

	public void compareData(String opt) {
		clickProgressBar();
		clickCompareBtn();
		verifyChartDate(opt);
		verifyLabels();
		comapreAverage();
	}

	
	private void verifyChartDate(String days) {
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMM dd");
		int i=Integer.parseInt(days);  
		LocalDateTime myDateObj=LocalDateTime.now().minusDays(i-1);
		String formattedDate1 = myFormatObj.format(myDateObj);
		LocalDateTime mydateobj2=LocalDateTime.now().minusDays(14);
		String formateDate2= myFormatObj.format(mydateobj2);
		String currdate=formattedDate1.concat("toToday");
		getNFKiosProgresspageStaticText(currdate).isPresent();
	  getNFKiosProgresspageStaticText(formateDate2).isPresent();
	}
	
	private void clickCompareBtn() {
		getNFKiosProgresspageSwitchBtn().isPresent();
		getNFKiosProgresspageSwitchBtn().click();
		Reporter.logWithScreenShot("Clicked on Switch for Compare",MessageTypes.Pass);
	}
	private void comapreAverage() {
		//Avg check
		Assert.assertEquals(getNFKiosProgresspageComprCurrAvgVal().getText(),
				LFSUtilsIOS.getPropString("my.progress.avg.value").concat(" mg/dL"));	
		Assert.assertEquals(getNFKiosProgresspageComprPreAvgVal().getText(),LFSUtilsIOS.getPropString("my.progress.avg.value").concat(" mg/dL"));
		//Gmi 
		Assert.assertTrue(getNFKiosProgresspageComprCurrGmiVal().getText().equals("--%"));
		Assert.assertTrue(getNFKiosProgresspageComprPreGmiVal().getText().equals("--%"));
		//Percent values
		Assert.assertEquals(getNFKiosProgresspageComprLowPreVal().getText(),LFSUtilsIOS.getPropString("my.progress.low.per"));
		Assert.assertEquals(getNFKiosProgresspageComprLowCurrVal().getText(),LFSUtilsIOS.getPropString("my.progress.low.per"));
		Assert.assertEquals(getNFKiosProgresspageComprInrangePreVal().getText(),LFSUtilsIOS.
				getPropString("my.progress.inrange.per"));
		Assert.assertEquals(getNFKiosProgresspageComprInrangeCurrVal().getText(),LFSUtilsIOS.
				getPropString("my.progress.inrange.per"));
		LFSUtilsIOS.swipeWithCoordinates(300, 800, 443, 500, 50);
		Assert.assertEquals(getNFKiosProgresspageComprHighPreVal().getText(),LFSUtilsIOS.getPropString("my.progress.high.per"));
		Assert.assertEquals(getNFKiosProgresspageComprHighCurrVal().getText(),LFSUtilsIOS.getPropString("my.progress.high.per"));
	 Reporter.logWithScreenShot("User has Compared the Average value and GMI",MessageTypes.Pass);
	}

	private void verifyLabels() {
		getNFKiosProgresspageComprAvgLbl().assertPresent("Average label");
		getNFKiosProgresspageComprGmiTitle().assertPresent("GMI label");
		getNFKiosProgresspageComprLowLbl().assertPresent("Low label");
		getNFKiosProgresspageComprInrangeLbl().assertPresent("In range label");
		LFSUtilsIOS.swipeWithCoordinates(300, 800, 443, 500, 50);
		getNFKiosProgresspageComprHighLbl().assertPresent("High label");
		
	}
	public void noDataProgressScreen() {
		getNFKiosMyprogressRange7dayBtn().isEnabled();
		getNFKiosProgresspageSwitchBtn().assertDisabled("Compare Switch button disabled");
		getNFKiosProgresspageStaticText(LFSUtilsIOS.getPropString("my.progress.data.txt")).assertPresent("Data available for 0 of 7 days");
		getNFKiosProgresspageStaticText(LFSUtilsIOS.getPropString("my.progress.msg.nodata")).assertPresent("No data alert message");;
		getNFKiosProgresspageStaticText(LFSUtilsIOS.getPropString("my.progress.low.lbl")).assertPresent("Low data label");
		getNFKiosProgresspageLowInfoIcon().isPresent();
		getNFKiosProgresspageStaticText(LFSUtilsIOS.getPropString("my.progress.low.nodata.txt")).assertPresent("No Low data message");
		getNFKiosProgresspageStaticText(LFSUtilsIOS.getPropString("my.progress.agp.txt")).assertPresent("AGP text");
		getNFKiosProgresspageAgpInfoIcon().isPresent();
	    getNFKiosProgresspageStaticText(LFSUtilsIOS.getPropString("my.progress.agp.nodata.txt")).assertPresent("No data AGP message");
	    getNFKiosProgresspageLowInfoIcon().click();
	    getNFKiosProgresspageSlideupTxt().assertPresent("Slideup text for Low");
	    getNFKiosProgresspageSlideupCloseBtn().click();
	     //check AGP info by clicking on i icon
	    getNFKiosProgresspageAgpInfoIcon().click();
	    getNFKiosProgresspageSlideupTxt().assertPresent("Text of AGP");
	    getNFKiosProgresspageSlideupCloseBtn().click();
	    Reporter.logWithScreenShot("User has verified the My Progress Screen when No CGM Data is present",MessageTypes.Pass);

	}
	public void textNoData() {
	     //click on 14 day and check message
		getNFKiosMyprogressRange14dayBtn().click();
		getNFKiosProgresspageStaticText(LFSUtilsIOS.getPropString("my.progress.data.14.txt")).assertPresent("Data text for 14 days");
		//check for 30
		getNFKiosMyprogressRange30dayBtn().click();
		getNFKiosProgresspageStaticText(LFSUtilsIOS.getPropString("my.progress.data.30.txt")).assertPresent("Data text for 30 days");
		//check for 60
		getNFKiosMyprogressRange60dayBtn().click();
		getNFKiosProgresspageStaticText(LFSUtilsIOS.getPropString("my.progress.data.60.txt")).
		assertPresent("Data text for 60 days");
		//checl for 90
		getNFKiosMyprogressRange90dayBtn().click();
		getNFKiosProgresspageStaticText(LFSUtilsIOS.getPropString("my.progress.data.90.txt")).
		assertPresent("Data text for 90 days");
		
	}
	  //Verify Low Events
	public void verifyLowEvents() {
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
		String time =iosDriver.getDeviceTime();
		Reporter.logWithScreenShot("Get device timee of iOS"+time,MessageTypes.Pass);
	    getNFKiosProgresspageStaticText("12 AM").assertPresent("12 AM text");
	    getNFKiosProgresspageStaticText("6 AM").assertPresent("6 AM text");
	    getNFKiosProgresspageStaticText("12 PM").assertPresent("12 PM text");
	    getNFKiosProgresspageStaticText("6 PM").assertPresent("6 PM text");
	   Assert.assertEquals(getNFKiosProgresspageLowEventLbl().getText(),LFSUtilsIOS.getPropString("my.progress.total.event.txt"));
	   Assert.assertTrue(getNFKiosProgresspageLowEventCount().getText().equals("7")); 
		Assert.assertEquals(getNFKiosProgresspageLowAvgLbl().getText(),LFSUtilsIOS.getPropString("my.progress.avg.lbl"));
	   Assert.assertTrue(getNFKiosProgresspageLowAvgDuration().getText().equals("15m"));
	   Assert.assertEquals(getNFKiosProgresspageLowTitle().getText(),LFSUtilsIOS.getPropString("my.progress.lowest.reading.txt"));
	   Assert.assertTrue(getNFKiosProgresspageLowLowestValue().getText().equals("56 mg/dL"));
	   Assert.assertEquals(getNFKiosProgresspageLowMosEvents().getText(),LFSUtilsIOS.getPropString("my.progress.most.events"));
	   System.out.println("Start hrss "+getNFKiosProgresspageLowStartHr().getText());
	   System.out.println("END hrss "+getNFKiosProgresspageLowEndHr().getText());
	   Reporter.logWithScreenShot("Verified the Low Events",MessageTypes.Pass);
	}
	public void verifyNoOfLowEvents() {
		getNFKiosProgresspageLowTotalEventCountGrph("7").isPresent();
		getNFKiosProgresspageLowTotalEventCountGrph("7").click();
       getNFKiosProgresspageLowTitleSc().assertPresent("Title of Screen");
       getNFKiosProgresspageLowSubTitle().assertPresent("No. of Total Low Events");
       getNFKiosProgresspageLowEventsGlucose().listIterator().hasNext();//verify the no. of events
        //verify the value and time of events.....
           //to do incorrect time is displayed
       Reporter.logWithScreenShot("Verified the Low Events dispalyed on Low Glucose Events",MessageTypes.Pass);
	}
	public void verifyAGPsection() {
		getNFKiosMyprogressRange14dayBtn().click();
		LFSUtilsIOS.waitforLoad();
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
		LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
		getNFKiosProgresspageAgpTitle().isDisplayed();
		System.out.println("Print the AGP title---"+LFSUtilsIOS.getPropString("my.progress.agp.txt"));
		Assert.assertEquals(getNFKiosProgresspageAgpTitle().getText(),
				LFSUtilsIOS.getPropString("my.progress.agp.txt"));
		Assert.assertEquals(getNFKiosProgresspageGlucoseprofileTitle().get(0).getText(),
				LFSUtilsIOS.getPropString("my.progress.glucose.profile"));
		Assert.assertEquals(getNFKiosProgresspageGlucoseprofileTitle().get(1).getText(),
				LFSUtilsIOS.getPropString("my.progress.daily.glucose.profile"));
		Assert.assertEquals(getNFKiosProgresspageGlucoseDesc().get(0).getText(),
				LFSUtilsIOS.getPropString("my.progress.glucose.desc"));
		Assert.assertEquals(getNFKiosProgresspageGlucoseDesc().get(1).getText(),LFSUtilsIOS.getPropString("my.progress.daily.glucose.desc"));
	   getNFKiosProgresspageViewAgpReport().assertPresent("View Full AGP Report");
	   getNFKiosProgresspageStaticText(LFSUtilsIOS.getPropString("my.progress.disclaimer.AGP.txt")).assertPresent("Disclaimer AGP text");
	}
	public void verifyGlucoseProfile() {
		getNFKiosProgresspageGlucoseprofileTitle().get(0).click();
		getNFKiosProgresspageStaticText(LFSUtilsIOS.getPropString("my.progress.agp.txt")).assertPresent("AGP title");
		getNFKiosProgresspagePdfCloseBtn().isPresent();
		Reporter.logWithScreenShot("AGP Report for 14 Days",MessageTypes.Pass);
		getNFKiosProgresspagePdfCloseBtn().click();
	}
	public void verifyDailyGlucoseProfile() {
		getNFKiosProgresspageGlucoseprofileTitle().get(1).click();
		getNFKiosProgresspageStaticText(LFSUtilsIOS.getPropString("my.progress.daily.glucose.profile")).
		assertPresent("my.progress.daily.glucose.profile");
		getNFKiosProgresspagePdfCloseBtn().isPresent();
		Reporter.logWithScreenShot("Daily Glucose Profile Report",MessageTypes.Pass);
		getNFKiosProgresspagePdfCloseBtn().click();

	}
	public void verifyViewFullAGpReport() {
		getNFKiosProgresspageViewAgpReport().isPresent();
		getNFKiosProgresspageViewAgpReport().click();
		getNFKiosProgresspageStaticText(LFSUtilsIOS.getPropString("my.progress.agp.report")).
		assertPresent("Full AGP Report");
		Reporter.logWithScreenShot("Full AGP Report",MessageTypes.Pass);
		getNFKiosProgresspagePdfCloseBtn().click();
	}
	

}
