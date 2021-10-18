package com.NFK.version1.android.pages;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.testng.Assert;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.NFK.support.LFSUtilsAndroid;
import com.NFK.version1.android.component.PatternComponent;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.WebDriverTestCase;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;



public class ProgressPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage> {

	@FindBy(locator = "NFK.logbook.totalpattern.lbl")
	private QAFWebElement NFKLogbookTotalpatternLbl;
	@FindBy(locator = "NFK.pattern.lowcount.lbl")
	private QAFWebElement NFKPatternLowcountLbl;
	@FindBy(locator = "NFK.pattern.highcount.lbl")
	private QAFWebElement NFKPatternHighcountLbl;
	@FindBy(locator = "NFK.pattern.patternlist.comp")
	private List<PatternComponent> NFKPatternPatternComponentList;
	
	//NFK Progress page
	@FindBy(locator = "NFK.homepage.progress.tab")
	private QAFWebElement NFKhomepageProgresstab;
    @FindBy(locator = "NFK.progresspage.rangedays.radio.btn")
	private QAFWebElement NFKProgresspageRangedaysRadioBtn;
	@FindBy(locator = "NFK.progresspage.compare.lbl")
	private QAFWebElement NFKProgresspageCompareLbl;
	@FindBy(locator = "NFK.progresspage.switch.btn")
	private QAFWebElement NFKProgresspageSwitchBtn;
	@FindBy(locator = "NFK.progresspage.availableday.lbl")
	private QAFWebElement NFKProgresspageAvailabledayLbl;
	@FindBy(locator = "NFK.progresspage.avergaes.lbl")
	private List<QAFWebElement> NFKProgresspageAvergaesLbl;
	@FindBy(locator = "NFK.progresspage.averages.value")
	private List<QAFWebElement> NFKProgresspageAveragesValue;
	@FindBy(locator = "NFK.progresspage.piechart")
	private QAFWebElement NFKProgresspagePiechart;
	@FindBy(locator = "NFK.progresspage.dateon.piechart")
	private QAFWebElement NFKProgresspageDateonPiechart;
	@FindBy(locator="NFK.progresspage.dateon.comp.piechart")
	private List<QAFWebElement> NFKProgresspageDateonCompPiechart;
	@FindBy(locator = "NFK.progresspage.low.lbl")
	private QAFWebElement NFKProgresspageLowLbl;
	@FindBy(locator="NFK.progresspage.low.vlue")
	private QAFWebElement NFKProgresspageLowVlue;
	@FindBy(locator = "NFK.progresspage.inrange.lbl")
	private QAFWebElement NFKProgresspageInrangeLbl;
	@FindBy(locator="NFK.progresspage.inrange.value")
	private QAFWebElement NFKProgresspageInrangeValue;
	@FindBy(locator = "NFK.progresspage.high.value")
	private QAFWebElement NFKProgresspageHighValue;
	@FindBy(locator = "NFK.progresspage.legendinfo.lbl")
	private QAFWebElement NFKProgresspageLegendinfoLbl;
	@FindBy(locator="NFK.progresspage.title.lbl")
	private QAFWebElement NFKProgresspageTitleLbl;
	@FindBy(locator="NFK.progresspage.buttons.list")
	private List<QAFWebElement> NFKProgresspageButtonsList;
	@FindBy(locator="NFK.progresspage.carousel.dot")
	private List<QAFWebElement> NFKProgresspageCarouselDot;
    @FindBy(locator="NFK.progresspage.high.lbl")
    private QAFWebElement NFKProgresspageHighLbl;
	@FindBy(locator="NFK.progresspage.compr.glucose.lbl")
	private QAFWebElement NFKProgresspageComprGlucoseLbl;
	@FindBy(locator="NFK.progresspage.compr.pre.avg.val")
	private QAFWebElement NFKProgresspageComprPreAvgVal;
	@FindBy(locator="NFK.progresspage.compr.curr.avg.val")
	private QAFWebElement NFKProgresspageComprCurrAvgVal;
	@FindBy(locator="NFK.progresspage.compr.gmi.lbl")
	private QAFWebElement NFKProgresspageComprGmiLbl;
	@FindBy(locator="NFK.progresspage.compr.pre.gmi.val")
	private QAFWebElement NFKProgresspageComprPreGmiVal;
	@FindBy(locator="NFK.progresspage.compr.curr.gmi.val")
	private QAFWebElement NFKProgresspageComprCurrGmiVal;
	@FindBy(locator="NFK.progresspage.compr.low.pre.val")
	private QAFWebElement NFKProgresspageComprLowPreVal;
	@FindBy(locator="NFK.progresspage.compr.inrange.pre.val")
	private QAFWebElement NFKProgresspageComprInrangePreVal;
	@FindBy(locator="NFK.progresspage.compr.high.pre.val")
	private QAFWebElement NFKProgresspageComprHighPreVal;
	@FindBy(locator="NFK.progresspage.compr.low.curr.val")
	private QAFWebElement NFKProgresspageComprLowCurrVal;
	@FindBy(locator="NFK.progresspage.compr.inrange.curr.val")
	private QAFWebElement NFKProgresspageComprInrangeCurrVal;
	@FindBy(locator="NFK.progresspage.compr.high.curr.val")
	private QAFWebElement NFKProgresspageComprHighCurrVal;
	@FindBy(locator="NFK.progresspage.no.sensordata.txt")
	private QAFWebElement NFKProgresspageNoSensordataTxt;
	@FindBy(locator="NFK.progresspage.info.icon")
	private List<QAFWebElement> NFKProgresspageInfoIcon;
	@FindBy(locator="NFK.progresspage.descp.nodata.txt")
	private List<QAFWebElement> NFKProgresspageDescpNodataTxt;
	@FindBy(locator="NFK.progresspage.slideup.close.btn")
	private QAFWebElement NFKProgresspageSlideupCloseBtn;
	@FindBy(locator="NFK.progresspage.low.slideup.txt")
	private QAFWebElement NFKProgresspageLowSlideupTxt;
	@FindBy(locator="NFK.progresspage.agp.slideup.txt")
	private QAFWebElement NFKProgresspageAgpSlideupTxt;
	@FindBy(locator="NFK.progresspage.lowagp.title.lbl")
	private List<QAFWebElement> NFKProgresspageLowagpTitleLbl;
	@FindBy(locator="NFK.progresspage.low.chart")
	private QAFWebElement NFKProgresspageLowChart;
	@FindBy(locator="NFK.progresspage.low.txt.lbl")
	private List<QAFWebElement> NFKProgresspageLowTxtLbl;
	@FindBy(locator="NFK.progresspage.low.events.value")
	private List<QAFWebElement> NFKProgresspageLowEventsValue;
	@FindBy(locator="NFK.progresspage.view.agp.report")
	private QAFWebElement NFKProgresspageViewAgpReport;
	@FindBy(locator="NFK.progresspage.card.title")
	private List<QAFWebElement> NFKProgresspageCardTitle;
	@FindBy(locator="NFK.progresspage.card.description")
	private List<QAFWebElement> NFKProgresspageCardDescription;
	@FindBy(locator="NFK.progresspage.title.report")
	private QAFWebElement NFKProgresspageTitleReport;
	@FindBy(locator="NFK.progresspage.close.btn.report")
	 private QAFWebElement NFKProgresspageCloseBtnReport;
	 
	public List<QAFWebElement> getNFKProgresspageDateonCompPiechart(){
		return NFKProgresspageDateonCompPiechart;
	}
	public QAFWebElement getNFKProgresspageViewAgpReport() {
		return NFKProgresspageViewAgpReport;
	}
	public QAFWebElement getNFKProgresspageCloseBtnReport() {
		return NFKProgresspageCloseBtnReport;
	}
	public QAFWebElement getNFKProgresspageTitleReport() {
		return NFKProgresspageTitleReport;
	}
	public List<QAFWebElement> getNFKProgresspageCardDescription(){
		return NFKProgresspageCardDescription;
	}
	public List<QAFWebElement> getNFKProgresspageCardTitle() {
		return NFKProgresspageCardTitle;
	}
	public QAFWebElement getNFKProgresspageLowChart() {
		return NFKProgresspageLowChart;
	}
	public List<QAFWebElement> getNFKProgresspageLowTxtLbl() {
		return NFKProgresspageLowTxtLbl;
	}
	public List<QAFWebElement> getNFKProgresspageLowEventsValue() {
		return NFKProgresspageLowEventsValue;
	}
	public List<QAFWebElement> getNFKProgresspageLowagpTitleLbl() {
		return NFKProgresspageLowagpTitleLbl;
	}
	public List<QAFWebElement> getNFKProgresspageInfoIcon(){
		return NFKProgresspageInfoIcon;
	}
	public List<QAFWebElement> getNFKProgresspageDescpNodataTxt(){
		return NFKProgresspageDescpNodataTxt;
	}
	public QAFWebElement getNFKProgresspageSlideupCloseBtn() {
		return NFKProgresspageSlideupCloseBtn;
	}
	public QAFWebElement getNFKProgresspageLowSlideupTxt() {
		return NFKProgresspageLowSlideupTxt;
	}
	public QAFWebElement getNFKProgresspageAgpSlideupTxt() {
		return NFKProgresspageAgpSlideupTxt;
	}
	public QAFWebElement getNFKProgresspageNoSensordataTxt() {
		return NFKProgresspageNoSensordataTxt;
	}
	public QAFWebElement getNFKProgresspageHighLbl() {
		return NFKProgresspageHighLbl;
	}
	public QAFWebElement getNFKProgresspageComprGlucoseLbl() {
		return NFKProgresspageComprGlucoseLbl;
	}
	public QAFWebElement getNFKProgresspageComprPreAvgVal() {
		return NFKProgresspageComprPreAvgVal;
	}
	public QAFWebElement getNFKProgresspageComprCurrAvgVal() {
		return NFKProgresspageComprCurrAvgVal;
	}
	public QAFWebElement getNFKProgresspageComprGmiLbl() {
		return NFKProgresspageComprGmiLbl;
	}
	public QAFWebElement getNFKProgresspageComprPreGmiVal() {
		return NFKProgresspageComprPreGmiVal;
	}
	public QAFWebElement getNFKProgresspageComprCurrGmiVal() {
		return NFKProgresspageComprCurrGmiVal;
	}
	public QAFWebElement getNFKProgresspageComprLowPreVal() {
		return NFKProgresspageComprLowPreVal;
	}
	public QAFWebElement getNFKProgresspageComprInrangePreVal() {
		return NFKProgresspageComprInrangePreVal;
	}
	public QAFWebElement getNFKProgresspageComprHighPreVal() {
		return NFKProgresspageComprHighPreVal;
	}
	public QAFWebElement getNFKProgresspageComprLowCurrVal() {
		return NFKProgresspageComprLowCurrVal;
	}
	public QAFWebElement getNFKProgresspageComprInrangeCurrVal() {
		return NFKProgresspageComprInrangeCurrVal;
	}
	public QAFWebElement getNFKProgresspageComprHighCurrVal() {
		return NFKProgresspageComprHighCurrVal;
	}

	public QAFWebElement getNFKProgresstabStaticText(String Text) {
		return LFSUtilsAndroid.getElement("NFK.progresstab.static.text",Text);
	}
	public List<QAFWebElement> getNFKProgresspageButtonsList(){
		return NFKProgresspageButtonsList;
	}
	public List<QAFWebElement> getNFKProgresspageCarouselDot(){
		return NFKProgresspageCarouselDot;
	}
	public QAFWebElement getNFKhomepageProgresstab() {
		return NFKhomepageProgresstab;
	}

	public QAFWebElement getNFKProgresspageRangedaysRadioBtn() {
		return NFKProgresspageRangedaysRadioBtn;
	}
	public QAFWebElement getNFKProgresspageCompareLbl() {
		return NFKProgresspageCompareLbl;
	}
	public QAFWebElement getNFKProgresspageLowVlue() {
		return NFKProgresspageLowVlue;
	}
	public QAFWebElement getNFKProgresspageSwitchBtn() {
		return NFKProgresspageSwitchBtn;
	}
	public QAFWebElement getNFKProgresspageAvailabledayLbl() {
		return NFKProgresspageAvailabledayLbl;
	}
	public List<QAFWebElement> getNFKProgresspageAvergaesLbl() {
		return NFKProgresspageAvergaesLbl;
	}
	public List<QAFWebElement> getNFKProgresspageAveragesValue() {
		return NFKProgresspageAveragesValue;
	}
	public QAFWebElement getNFKProgresspagePiechart() {
		return NFKProgresspagePiechart;
	}
	public QAFWebElement getNFKProgresspageInrangeValue() {
		return NFKProgresspageInrangeValue;
	}
	public QAFWebElement getNFKProgresspageDateonPiechart() {
		return NFKProgresspageDateonPiechart;
	}
	public QAFWebElement getNFKProgresspageLowLbl() {
		return NFKProgresspageLowLbl;
	}
	public QAFWebElement getNFKProgresspageInrangeLbl() {
		return NFKProgresspageInrangeLbl;
	}
	public QAFWebElement getNFKProgresspageHighValue() {
		return NFKProgresspageHighValue;
	}
	public QAFWebElement getNFKProgresspageLegendinfoLbl() {
		return NFKProgresspageLegendinfoLbl;
	}
	public QAFWebElement getNFKProgresspageTitleLbl() {
		return NFKProgresspageTitleLbl; 
	}
	
	@Override
	protected void openPage(PageLocator pageLocator, Object... args) {
	}
	
	
	public List<PatternComponent> getNFKPatternPatternComponentList() {
		return NFKPatternPatternComponentList;
	}
	
	public QAFWebElement getNFKLogbookTotalpatternLbl() {
		return NFKLogbookTotalpatternLbl;
	}

	public QAFWebElement getNFKPatternLowcountLbl() {
		return NFKPatternLowcountLbl;
	}

	public QAFWebElement getNFKPatternHighcountLbl() {
		return NFKPatternHighcountLbl;
	}
	
	
	public void verifyNoOFPatternCount(String low, String high) {
		int total = Integer.parseInt(low) + Integer.parseInt(high);
		WebDriverTestCase.verifyTrue(
				getNFKLogbookTotalpatternLbl().getText().contains(total + ""),
				"Count is incorrect",
				"Total " + getNFKLogbookTotalpatternLbl().getText());
		WebDriverTestCase.verifyTrue(getNFKPatternLowcountLbl().getText().contains(low),
				"Count is incorrect", "Count " + getNFKPatternLowcountLbl().getText());
		WebDriverTestCase.verifyTrue(getNFKPatternHighcountLbl().getText().contains(high),
				"Count is incorrect", "Count " + getNFKPatternHighcountLbl().getText());

	}

	public void verifyBlankPatternPage() {
		WebDriverTestCase.verifyTrue(
				getNFKLogbookTotalpatternLbl().getText().contains(0 + ""),
				"Pettern present",
				"Pattern screen is blank " + getNFKLogbookTotalpatternLbl().getText());
	}
	public void verfyPatternDetail() {
		getNFKLogbookTotalpatternLbl().waitForPresent();
		for (int i = 0; i < getNFKPatternPatternComponentList().size(); i++) {
			PatternComponent ptrn = getNFKPatternPatternComponentList().get(i);
			if (i==0) {
				WebDriverTestCase.verifyTrue(
						ptrn.getNFKPatternBgbubblelValueLbl().get(0).getText().contains(
								LFSUtilsAndroid.getPropString("readingsHigh.bg1"))
								&& ptrn.getNFKPatternBgbubblelValueLbl().get(1).getText()
										.contains(LFSUtilsAndroid
												.getPropString("readingsHigh.bg2"))
								&& ptrn.getNFKPatternBgbubblelValueLbl().get(2).getText()
										.contains(LFSUtilsAndroid
												.getPropString("readingsHigh.bg3")),
						"Pettern High value are incorrect", "Pattern High value are correct");

			}
			if (i==1) {
				WebDriverTestCase.verifyTrue(
						ptrn.getNFKPatternBgbubblelValueLbl().get(0).getText().contains(
								LFSUtilsAndroid.getPropString("readingsLow.bg1"))
								&& ptrn.getNFKPatternBgbubblelValueLbl().get(1).getText()
										.contains(LFSUtilsAndroid
												.getPropString("readingsLow.bg2")),
						"Pettern Low value are incorrect", "Pattern Low value are correct");

			}
		}
	}
	
	// Method to click on generated pattern using number from the list

	public void clickOnPatternFromList(String numb) {
		getNFKPatternPatternComponentList().get(Integer.parseInt(numb) - 1).click();
	}
		
	public void clickProgressBar() {
		getNFKhomepageProgresstab().waitForPresent();
		getNFKhomepageProgresstab().click();
		LFSUtilsAndroid.waitforLoad();
		LFSUtilsAndroid.pause(30000);
		Reporter.logWithScreenShot("Progress Page",MessageTypes.Pass);
	   waitForPageToLoad();
	   
	
	}
	public void verifyMyProgress() {
		Assert.assertEquals(			
		getNFKProgresspageTitleLbl().getText(),LFSUtilsAndroid.getPropString("my.pogress.title"));
		Assert.assertEquals(getNFKProgresspageButtonsList().get(1).getText(),LFSUtilsAndroid.getPropString("range.timeFrame14"));
		Assert.assertEquals(getNFKProgresspageButtonsList().get(2).getText(),LFSUtilsAndroid.getPropString("range.timeFrame30"));
		Assert.assertEquals(getNFKProgresspageButtonsList().get(3).getText(),LFSUtilsAndroid.getPropString("range.timeFrame60"));
		Assert.assertEquals(getNFKProgresspageButtonsList().get(4).getText(),LFSUtilsAndroid.getPropString("range.timeFrame90"));
		Assert.assertEquals(getNFKProgresspageCompareLbl().getText(),LFSUtilsAndroid.getPropString("my.progress.compare.lbl"));
	getNFKProgresspageSwitchBtn().getText().equals("OFF");
	//Assert.assertEquals(getNFKProgresspageAvailabledayLbl().getText(),LFSUtilsAndroid.getPropString("my.progress.availble.data.lbl"));
	
	
	}
	public void verifyAverage(String opt) 
		{
		LFSUtilsAndroid.waitforLoad();
			switch(opt) {
			case "7":	
				getNFKProgresspageButtonsList().get(0).click();
				getNFKProgresspageButtonsList().get(0).isEnabled();
				verifyAvgGMI(opt);
				break;
			case "14":		
				getNFKProgresspageButtonsList().get(1).click();
				getNFKProgresspageButtonsList().get(1).isEnabled();
				verifyAvgGMI(opt);
				break;
			case "30":	
				getNFKProgresspageButtonsList().get(2).click();
				getNFKProgresspageButtonsList().get(2).isEnabled();
				verifyAvgGMI(opt);
				break;
			case "60":
				getNFKProgresspageButtonsList().get(3).click();
				getNFKProgresspageButtonsList().get(3).isEnabled();
				verifyAvgGMI(opt);
				break;
			case "90":
				getNFKProgresspageButtonsList().get(4).click();
				getNFKProgresspageButtonsList().get(4).isEnabled();
				verifyAvgGMI(opt);
				break;

	     }
		}
	
	public void verifyAvgGMI(String opt) {
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMM d");
		int i=Integer.parseInt(opt);  
		LocalDateTime myDateObj=LocalDateTime.now().minusDays(i-1);
		String formattedDate = myFormatObj.format(myDateObj);
		System.out.println("Get 7 days before Date"+formattedDate);
		getNFKProgresspageAvergaesLbl().get(0).getText().equals(LFSUtilsAndroid.getPropString("glucose.avg.lbl"));//get average	
		getNFKProgresspageAvergaesLbl().get(1).getText().equals(LFSUtilsAndroid.getPropString("gmi.lbl"));//get GMI				
		String datecheck=formattedDate.concat("toToday");
		if(i==7) {
		
		getNFKProgresspagePiechart().isPresent();
		Assert.assertEquals(getNFKProgresspageDateonPiechart().getText().replaceAll("\n|\\t", ""), datecheck);
		Assert.assertEquals(getNFKProgresspageAveragesValue().get(0).getText(),LFSUtilsAndroid.getPropString("my.progress.avg.value"));
		Assert.assertTrue(getNFKProgresspageAveragesValue().get(1).getText().equals("--"));		     //7 days no GMI 
		Assert.assertEquals(getNFKProgresspageLowVlue().getText(), 
				LFSUtilsAndroid.getPropString("my.progress.low.per"));//% of LOW
		Assert.assertEquals(getNFKProgresspageInrangeValue().getText(),LFSUtilsAndroid.getPropString("my.progress.inrange.per"));//% of inrange
		Assert.assertEquals(getNFKProgresspageHighValue().getText(),LFSUtilsAndroid.getPropString("my.progress.high.per"));//% of High 
		}
		else
		{	
			getNFKProgresspagePiechart().isPresent();
			Assert.assertEquals(getNFKProgresspageDateonPiechart().
					getText().replaceAll("\n|\\t", ""),datecheck);
			Assert.assertEquals(getNFKProgresspageAveragesValue().get(0).getText(),LFSUtilsAndroid.getPropString("my.progress.avg.value"));
			Assert.assertEquals(getNFKProgresspageAveragesValue().get(1).getText(),LFSUtilsAndroid.getPropString("my.progress.gmi.value"));
			Assert.assertEquals(getNFKProgresspageLowVlue().getText(), LFSUtilsAndroid.getPropString("my.progress.low.per"));//% of LOW
			Assert.assertEquals(getNFKProgresspageInrangeValue().getText(),LFSUtilsAndroid.getPropString("my.progress.inrange.per"));//% of inrange
			Assert.assertEquals(getNFKProgresspageHighValue().getText(),LFSUtilsAndroid.getPropString("my.progress.high.per"));//% of High		

		}

	}
	public void compareData(String opt) {
	  clickProgressBar();
	  clickComparebtn();
	verifyChartDate(opt);
			verifyLabels();
			compareAverage();	
	}
	
	private void verifyChartDate(String days) {
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MMM d");
		int i=Integer.parseInt(days);  
		LocalDateTime myDateObj=LocalDateTime.now().minusDays(6);
		//String formattedDate1 = myFormatObj.format(myDateObj);
		LocalDateTime mydateobj2=LocalDateTime.now().minusDays(7);
		LocalDateTime mydate14days=LocalDateTime.now().minusDays(13);
		String formateDatesev= myFormatObj.format(mydateobj2);
		String formateDatefou=myFormatObj.format(mydate14days);
		String currdate=myFormatObj.format(myDateObj).concat("toToday");
		System.out.println("Get the date of comaparision");
		Reporter.logWithScreenShot("Formated date 14days    "+formateDatefou.concat("to").concat(formateDatesev));

		Reporter.logWithScreenShot("Current date  "+currdate);
		Reporter.logWithScreenShot("Get the date last 14 days " +getNFKProgresspageDateonCompPiechart().get(0).getText());
		Reporter.logWithScreenShot("Get date till today "+getNFKProgresspageDateonCompPiechart().get(1).getText());
		
		System.out.println("formattedDate 14 "+formateDatefou.concat("to").concat(formateDatesev));
		System.out.println("currdate "+currdate);//Jun 25toToday
		String date=formateDatefou.concat("to").concat(formateDatesev);
		Assert.assertEquals(getNFKProgresspageDateonCompPiechart().get(0).getText().replaceAll("\\n",""),
				date);
		Assert.assertEquals(getNFKProgresspageDateonCompPiechart().get(1).getText().replaceAll("\\n",""), currdate);
		LFSUtilsAndroid.waitforLoad();
		
	}
	private void compareAverage() {
	Assert.assertEquals(getNFKProgresspageComprCurrAvgVal().getText(),LFSUtilsAndroid.getPropString("my.progress.avg.value"));
	Assert.assertEquals(getNFKProgresspageComprCurrAvgVal().getText(),
			LFSUtilsAndroid.getPropString("my.progress.avg.value"));	
	Assert.assertEquals(getNFKProgresspageComprPreAvgVal().getText(),LFSUtilsAndroid.getPropString("my.progress.avg.value"));
	//Gmi 
	Assert.assertTrue(getNFKProgresspageComprCurrGmiVal().getText().equals("--%"));
	Assert.assertTrue(getNFKProgresspageComprPreGmiVal().getText().equals("--%"));
	//Percent values
	Assert.assertEquals(getNFKProgresspageComprLowPreVal().getText(),LFSUtilsAndroid.getPropString("my.progress.low.per"));
	Assert.assertEquals(getNFKProgresspageComprLowCurrVal().getText(),LFSUtilsAndroid.getPropString("my.progress.low.per"));
	Assert.assertEquals(getNFKProgresspageComprInrangePreVal().getText(),LFSUtilsAndroid.
			getPropString("my.progress.inrange.per"));
	Assert.assertEquals(getNFKProgresspageComprInrangeCurrVal().getText(),LFSUtilsAndroid.
			getPropString("my.progress.inrange.per"));
	LFSUtilsAndroid.swipeWithCoordinates(300, 800, 443, 500, 50);
	Assert.assertEquals(getNFKProgresspageComprHighPreVal().getText(),LFSUtilsAndroid.getPropString("my.progress.high.per"));
	Assert.assertEquals(getNFKProgresspageComprHighCurrVal().getText(),LFSUtilsAndroid.getPropString("my.progress.high.per"));
 Reporter.logWithScreenShot("User has Compared the Average value and GMI",MessageTypes.Pass);
	
	}
	private void verifyLabels() {
		getNFKProgresspageComprGlucoseLbl().assertPresent("Glucose Average label");
		getNFKProgresspageComprGmiLbl().assertPresent("GMI label");
		getNFKProgresspageLowLbl().assertPresent("Low label");
		getNFKProgresspageInrangeLbl().assertPresent("Inrange label");
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
		getNFKProgresspageHighLbl().assertPresent("High label");
		
	}
	private void clickComparebtn() {
		getNFKProgresspageSwitchBtn().waitForPresent(200);
		getNFKProgresspageSwitchBtn().isDisplayed();
		getNFKProgresspageSwitchBtn().click();
		LFSUtilsAndroid.pause(1000);
	}
	public void noDataProgressScreen() {
		getNFKProgresspageButtonsList().get(0).isEnabled();
		getNFKProgresspageSwitchBtn().assertDisabled("Switch button is Disabled");
	Assert.assertEquals(getNFKProgresspageAvailabledayLbl().getText(),LFSUtilsAndroid.getPropString("my.progress.data.txt"));
	Assert.assertEquals(getNFKProgresspageNoSensordataTxt().getText(),LFSUtilsAndroid.getPropString("my.progress.msg.nodata") );
	Assert.assertEquals(getNFKProgresspageLowagpTitleLbl().get(0).getText(),LFSUtilsAndroid.getPropString("my.progress.low.lbl"));
	Assert.assertEquals(getNFKProgresspageDescpNodataTxt().get(0).getText(),LFSUtilsAndroid.getPropString("my.progress.low.nodata.txt"));
	Assert.assertEquals(getNFKProgresspageLowagpTitleLbl().get(1).getText(),LFSUtilsAndroid.getPropString("my.progress.agp.txt"));
	Assert.assertEquals(getNFKProgresspageDescpNodataTxt().get(1).getText(),LFSUtilsAndroid.getPropString("my.progress.agp.nodata.txt"));
	getNFKProgresspageInfoIcon().get(0).isPresent();
	getNFKProgresspageInfoIcon().get(0).click();
	getNFKProgresspageLowSlideupTxt().assertPresent("Low text on Slideup");
	getNFKProgresspageSlideupCloseBtn().click();
	getNFKProgresspageInfoIcon().get(1).isPresent();
	getNFKProgresspageInfoIcon().get(1).click();
	getNFKProgresspageLowSlideupTxt().assertPresent("AGP text Slideup");
	getNFKProgresspageSlideupCloseBtn().click();
	Reporter.logWithScreenShot("User has verified the My Progress Screen when No CGM Data is present",MessageTypes.Pass);
	}
	
	public void textNoData() {
		getNFKProgresspageButtonsList().get(1).click();
		Assert.assertEquals(getNFKProgresspageAvailabledayLbl().getText(),LFSUtilsAndroid.getPropString("my.progress.data.14.txt"));
		getNFKProgresspageButtonsList().get(2).click();
		Assert.assertEquals(getNFKProgresspageAvailabledayLbl().getText(),LFSUtilsAndroid.getPropString("my.progress.data.30.txt"));
		getNFKProgresspageButtonsList().get(3).click();
		Assert.assertEquals(getNFKProgresspageAvailabledayLbl().getText(),
				LFSUtilsAndroid.getPropString("my.progress.data.60.txt"));
		getNFKProgresspageButtonsList().get(4).click();
		getNFKProgresspageAvailabledayLbl().assertPresent("90 days Text");
		
	}
	public void verifyLowEvents() {
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
	    System.out.println("Get the chart date "+getNFKProgresspageLowChart().getText());
	    
	}
	public void verifyAGPsection() {
		waitForPageToLoad();
		getNFKProgresspageButtonsList().get(1).click();
		getNFKProgresspageButtonsList().get(1).isEnabled();
		LFSUtilsAndroid.waitforLoad();
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
		LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
		
	 Assert.assertEquals(getNFKProgresspageCardTitle().get(1).getText(),
			 LFSUtilsAndroid.getPropString("my.progress.glucose.profile"));
	 Assert.assertEquals(getNFKProgresspageCardDescription().get(1).getText(),
			 LFSUtilsAndroid.getPropString("my.progress.glucose.desc"));
	 Assert.assertEquals(getNFKProgresspageCardTitle().get(2).getText(), 
			 LFSUtilsAndroid.getPropString("my.progress.daily.glucose.profile"));

	 Assert.assertEquals(getNFKProgresspageCardDescription().get(2).getText(),
LFSUtilsAndroid.getPropString("my.progress.daily.glucose.desc"));
	 LFSUtilsAndroid.waitforLoad();
	getNFKProgresstabStaticText(LFSUtilsAndroid.getPropString("my.progress.disclaimer.AGP.txt")).assertPresent("Disclaimer of AGP");
	Reporter.logWithScreenShot("Verified the AGP report Section",MessageTypes.Pass);
	}
	
	public void verifyGlucoseProfile() {
		LFSUtilsAndroid.waitforLoad();
		getNFKProgresspageCardTitle().get(1).click();
		LFSUtilsAndroid.pause(5000);
       Reporter.logWithScreenShot("Glucose Profile Report ",MessageTypes.Pass);
        getNFKProgresspageCloseBtnReport().isPresent();
        getNFKProgresspageCloseBtnReport().click();
		
	}
	public void verifyDailyGlucoseProfile() {
		LFSUtilsAndroid.waitforLoad();
		getNFKProgresspageCardTitle().get(2).click();
		LFSUtilsAndroid.pause(5000);
        Assert.assertEquals(getNFKProgresspageTitleReport().getText(),LFSUtilsAndroid.getPropString("my.progress.daily.glucose.profile"));
       Reporter.logWithScreenShot("Daily glucose profile Report",MessageTypes.Pass);
        getNFKProgresspageCloseBtnReport().isPresent();
        getNFKProgresspageCloseBtnReport().click();	
		
	}
	public void verifyViewFullAGpReport() {
		LFSUtilsAndroid.waitforLoad();
		LFSUtilsAndroid.clickWithText("View full AGP Report");
		LFSUtilsAndroid.pause(5000);
        Assert.assertEquals(getNFKProgresspageTitleReport().getText(),LFSUtilsAndroid.getPropString("my.progress.agp.report"));
       Reporter.logWithScreenShot("Full AGP Report",MessageTypes.Pass);
        getNFKProgresspageCloseBtnReport().isPresent();
        getNFKProgresspageCloseBtnReport().click();	
	}
	
}


