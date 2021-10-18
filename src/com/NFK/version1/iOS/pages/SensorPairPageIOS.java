package com.NFK.version1.iOS.pages;

import com.NFK.support.LFSUtilsIOS;
import com.NFK.version1.iOS.beans.SensorPairBean;
import com.NFK.version1.iOS.beans.UserDetailBeans;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

public class SensorPairPageIOS extends WebDriverBaseTestPage<WebDriverTestPage> {



	@FindBy(locator="NFKios.sensorpairpage.title")
	private QAFWebElement NFKiosSensorpairpageTitle;
	@FindBy(locator="NFKios.sensorpairpage.sensor.skip.btn")
	private QAFWebElement NFKiosSensorpairpageSensorSkipBtn;
	@FindBy(locator="NFKios.sensorpairpage.code.all.field")
	private QAFWebElement NFKiosSensorpairpageCodeAllField;
	@FindBy(locator="NFKios.sensorpairpage.code.first.field")
	private QAFWebElement NFKiosSensorpairpageCodeFirstField;
	@FindBy(locator="NFKios.sensorpairpage.code.second.field")
	private QAFWebElement NFKiosSensorpairpageCodeSecondField;
	@FindBy(locator="NFKios.sensorpairpage.code.third.field")
	private QAFWebElement NFKiosSensorpairpageCodeThirdField;
	@FindBy(locator="NFKios.sensorpairpage.code.fourth.field")
	private QAFWebElement  NFKiosSensorpairpageCodeFourthField;
	@FindBy(locator="NFKios.sensorpairpage.code.fifth.field")
	private QAFWebElement NFKiosSensorpairpageCodeFifthField;
	@FindBy(locator="NFKios.sensorpairpage.code.sixth.field")
	private QAFWebElement NFKiosSensorpairpageCodeSixthField;
	@FindBy(locator="NFKios.sensorpairpage.code.seventh.field")
	private QAFWebElement NFKiosSensorpairpageCodeSeventhField;
	@FindBy(locator="NFKios.sensorpairpage.next.button")
	private QAFWebElement NFKiosSensorpairpageNextButton;
	@FindBy(locator="NFKios.sensorpairpage.applysensor.title")
	private QAFWebElement NFKiosSensorpairpageApplysensorTitle;
	@FindBy(locator="NFKios.sensorpairpage.applysensor.next.button")
	private QAFWebElement NFKiosSensorpairpageApplysensorNextButton;
	@FindBy(locator="NFKios.sensorpairpage.applysensor.back.button")
	private QAFWebElement NFKiosSensorpairpageApplysensorBackButton;
	@FindBy(locator="NFKios.sensorpairpage.applysensor.rightabdomen.btn")
	private QAFWebElement NFKiosSensorpairpageApplysensorRightabdomenBtn;
	@FindBy(locator="NFKios.sensorpairpage.applysensor.leftabdomen.btn")
	private QAFWebElement NFKiosSensorpairpageApplysensorLeftabdomenBtn;
	@FindBy(locator="NFKios.sensorpairpage.applysensor.leftarm.btn")
	private QAFWebElement NFKiosSensorpairpageApplysensorLeftarmBtn;
	@FindBy(locator="NFKios.sensorpairpage.applysensor.rightarm.btn")
	private QAFWebElement NFKiosSensorpairpageApplysensorRightarmBtn;
	@FindBy(locator="NFKios.sensorpairpage.applysensor.howtoapply.btn")
	private QAFWebElement NFKiosSensorpairpageApplysensorHowtoapplyBtn;
	@FindBy(locator="NFKios.sensorpairpage.applysensor.footer.lbl")
	private QAFWebElement NFKiosSensorpairpageApplysensorFooterLbl;

	@FindBy(locator="NFKios.apply.sensor.back.btn")
	private QAFWebElement NFKiosApplysensorbackbtn;
	public QAFWebElement getNFKiosApplysensorbackbtn() {
		return NFKiosApplysensorbackbtn;
	}

	@FindBy(locator="NFKios.apply.sensor.title")
	private QAFWebElement NFKiosApplysensorTitle;
	public QAFWebElement getNFKiosApplysensorTitle() {
		return NFKiosApplysensorTitle;
	}
	
	@FindBy(locator="NFKios.apply.sensor.text1")
	private QAFWebElement NFKiosApplysensorText1;
	public QAFWebElement getNFKiosApplysensorText1() {
		return NFKiosApplysensorText1;
	}
	
	@FindBy(locator="NFKios.apply.sensor.how.to.apply.sensor.link")
	private QAFWebElement NFKiosApplysensorHowtoapplysensorlink;
	public QAFWebElement getNFKiosApplysensorHowtoapplysensorlink() {
		return NFKiosApplysensorHowtoapplysensorlink;
	}
	
	@FindBy(locator="NFKios.apply.sensor.text2")
	private QAFWebElement NFKiosApplysensorText2;
	public QAFWebElement getNFKiosApplysensorText2() {
		return NFKiosApplysensorText2;
	}
	
	@FindBy(locator="NFKios.how.to.apply.sensor.scrn.back.btn")
	private QAFWebElement NFKioshowtoapplysenorbackbtn;
	public QAFWebElement getNFKioshowtoapplysenorbackbtn() {
		return NFKioshowtoapplysenorbackbtn;
	}
	
	@FindBy(locator="NFKios.how.to.apply.sensor.title")
	private QAFWebElement NFKioshowtoapplysensorTitle;
	public QAFWebElement getNFKioshowtoapplysensorTitle() {
		return NFKioshowtoapplysensorTitle;
	}
	
	@FindBy(locator="NFKios.how.to.apply.sensor.pair.btn")
	private QAFWebElement NFKioshowtoapplysensorpairbtn;
	public QAFWebElement getNFKioshowtoapplysensorpairbtn() {
		return NFKioshowtoapplysensorpairbtn;
	}
	
	@FindBy(locator="NFKios.how.to.apply.sensor.helpful.tips.link")
	private QAFWebElement NFKioshowtoapplysensorhelpfultiplink;
	public QAFWebElement getNFKioshowtoapplysensorhelpfultiplink() {
		return NFKioshowtoapplysensorhelpfultiplink;
	}
	
	@FindBy(locator="NFKios.how.to.apply.sensor.helpful.tips.title")
	private QAFWebElement NFKioshowtoapplysensorhelpfultiplinktitle;
	public QAFWebElement getNFKioshowtoapplysensorhelpfultiplinktitle() {
		return NFKioshowtoapplysensorhelpfultiplinktitle;
	}
	
	@FindBy(locator="NFKios.how.to.apply.sensor.helpful.tips.screen.X.btn")
	private QAFWebElement NFKioshowtoapplysensorhelpfultiplinkXbtn;
	public QAFWebElement getNFKioshowtoapplysensorhelpfultiplinkXbtn() {
		return NFKioshowtoapplysensorhelpfultiplinkXbtn;
	}
	
	@FindBy(locator="NFKios.how.to.apply.sensor.left.buttock.btn")
	private QAFWebElement NFKiosSensorpairpageApplysensorleftButtockBtn;
	public QAFWebElement getNFKiosSensorpairpageApplysensorleftButtockBtn() {
		return NFKiosSensorpairpageApplysensorleftButtockBtn;
	}
	
	@FindBy(locator="NFKios.how.to.apply.sensor.right.buttock.btn")
	private QAFWebElement NFKiosSensorpairpageApplysensorrightButtockBtn;
	public QAFWebElement getNFKiosSensorpairpageApplysensorrightButtockBtn() {
		return NFKiosSensorpairpageApplysensorrightButtockBtn;
	}
	
	public QAFWebElement getNFKiosSensorpairpageTitle() {
		return NFKiosSensorpairpageTitle;
	}

	public QAFWebElement getNFKiosSensorpairpageSensorSkipBtn() {
		return NFKiosSensorpairpageSensorSkipBtn;
	}
	public QAFWebElement getNFKiosSensorpairpageCodeAllField() {
		return NFKiosSensorpairpageCodeAllField;
	}
	public QAFWebElement getNFKiosSensorpairpageCodeFirstField() {
		return  NFKiosSensorpairpageCodeFirstField;
	}
	public QAFWebElement getNFKiosSensorpairpageCodeSecondField() {
		return  NFKiosSensorpairpageCodeSecondField;
	}
	public QAFWebElement getNFKiosSensorpairpageCodeThirdField() {
		return  NFKiosSensorpairpageCodeThirdField;
	}
	public QAFWebElement getNFKiosSensorpairpageCodeFourthField() {
		return NFKiosSensorpairpageCodeFourthField;
	}
	public QAFWebElement getNFKiosSensorpairpageCodeFifthField() {
		return NFKiosSensorpairpageCodeFifthField;
	}
	public QAFWebElement getNFKiosSensorpairpageCodeSixthField() {
		return NFKiosSensorpairpageCodeSixthField;
	}
	public QAFWebElement getNFKiosSensorpairpageCodeSeventhField() {
		return  NFKiosSensorpairpageCodeSeventhField;
	}
	public QAFWebElement getNFKiosSensorpairpageNextButton() {
		return NFKiosSensorpairpageNextButton;
		
	}
	public QAFWebElement getNFKiosSensorpairpageApplysensorTitle() {
		return NFKiosSensorpairpageApplysensorTitle;
	}
	public QAFWebElement getNFKiosSensorpairpageApplysensorNextButton() {
		return NFKiosSensorpairpageApplysensorNextButton;
	}
	public QAFWebElement getNFKiosSensorpairpageApplysensorBackButton() {
		return  NFKiosSensorpairpageApplysensorBackButton;
	}
	public QAFWebElement getNFKiosSensorpairpageApplysensorRightabdomenBtn() {
		return NFKiosSensorpairpageApplysensorRightabdomenBtn;
	}
	public QAFWebElement getNFKiosSensorpairpageApplysensorLeftabdomenBtn() {
		return  NFKiosSensorpairpageApplysensorLeftabdomenBtn;
	}
	public QAFWebElement getNFKiosSensorpairpageApplysensorLeftarmBtn() {
		return NFKiosSensorpairpageApplysensorLeftarmBtn;
	}
	public QAFWebElement getNFKiosSensorpairpageApplysensorRightarmBtn() {
		return NFKiosSensorpairpageApplysensorRightarmBtn;
	}
	public QAFWebElement getNFKiosSensorpairpageApplysensorHowtoapplyBtn() {
		return NFKiosSensorpairpageApplysensorHowtoapplyBtn;
	}
	
	public QAFWebElement getNFKiosSensorpairpageApplysensorFooterLbl() {
		return NFKiosSensorpairpageApplysensorFooterLbl;
	}
	

	public void enterSensorcode(Object sensordata) {
		
		SensorPairBean sensorBean = new SensorPairBean();
		if(sensordata instanceof String) {

			sensorBean.fillFromConfig((String) sensordata);
		} else {
			sensorBean.fillData(sensordata);
		} 
	  getNFKiosSensorpairpageTitle().isDisplayed();
	  getNFKiosSensorpairpageCodeAllField().click();
	  getNFKiosSensorpairpageCodeFirstField().sendKeys(sensorBean.getSensorcodefirst());
	  getNFKiosSensorpairpageCodeSecondField().sendKeys(sensorBean.getSensorcodesecond());
	  getNFKiosSensorpairpageCodeThirdField().sendKeys(sensorBean.getSesorcodethird());
	  getNFKiosSensorpairpageCodeFourthField().sendKeys(sensorBean.getSensorcodefourth());
	  getNFKiosSensorpairpageCodeFifthField().sendKeys(sensorBean.getSesnorcodefifth());
	  getNFKiosSensorpairpageCodeSixthField().sendKeys(sensorBean.getSensorcodesixth());
	  getNFKiosSensorpairpageCodeSeventhField().sendKeys(sensorBean.getSesorcodeseventh());
	  Reporter.logWithScreenShot("Sensor code is entered ",MessageTypes.Pass);	
      getNFKiosSensorpairpageNextButton().waitForEnabled();
      getNFKiosSensorpairpageNextButton().click();
	}
	
	@Override
	protected void openPage(PageLocator locator, Object... args) {	
	}

	public void selectBodyLocation(String location) {
		getNFKiosSensorpairpageApplysensorTitle().waitForPresent();
		getNFKiosSensorpairpageApplysensorTitle().isPresent();
		switch(location) {
		case "LEFTABDOMEN":
		  getNFKiosSensorpairpageApplysensorLeftabdomenBtn().waitForPresent();
		  getNFKiosSensorpairpageApplysensorLeftabdomenBtn().click();
		break;
		
		case "RIGHTABDOMEN":			
		 getNFKiosSensorpairpageApplysensorRightabdomenBtn().waitForPresent();
		 getNFKiosSensorpairpageApplysensorRightabdomenBtn().click();
		break;
		
		case "LEFTARM":
		 getNFKiosSensorpairpageApplysensorLeftarmBtn().waitForPresent();
		 getNFKiosSensorpairpageApplysensorLeftarmBtn().click();
		break;
		
		case "RIGHTARM":
		 getNFKiosSensorpairpageApplysensorRightarmBtn().waitForPresent();
		 getNFKiosSensorpairpageApplysensorRightarmBtn().click();
		break;
		}
		Reporter.logWithScreenShot("selected the body location ", MessageTypes.Pass);
		getNFKiosSensorpairpageApplysensorNextButton().waitForEnabled();
		getNFKiosSensorpairpageApplysensorNextButton().click();
	}

	public void connectingToSensor() {
		HomePageIOS homebtn= new HomePageIOS();
		try {
			//wait until sensor connects
			Thread.sleep(120000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		homebtn.getNFKiosHomepageHomeBtn().waitForVisible(1000);
	
	}
	public void enterSensorcode() {

		    try {
		    	
		    	getNFKiosSensorpairpageTitle().isDisplayed();
		    	getNFKiosSensorpairpageCodeAllField().assertPresent("codefield");
		    	getNFKiosSensorpairpageCodeAllField().clear();
		    	getNFKiosSensorpairpageCodeAllField().click();
		    	LFSUtilsIOS.waitforLoad();
		    	//LFSUtilsIOS.hideKeyboard();
				LFSUtilsIOS.pause(2000);
				getNFKiosSensorpairpageCodeAllField().sendKeys("123456789"); 
				if(getNFKiosSensorpairpageNextButton().isEnabled())
		    		getNFKiosSensorpairpageNextButton().click();
		    	else
		    	{
		    		getNFKiosSensorpairpageNextButton().waitForEnabled(200);
		    		getNFKiosSensorpairpageNextButton().click();
		    	}
		    	Reporter.logWithScreenShot("Sensor code is entered ", MessageTypes.Pass);
		    }
		   catch (Exception e) {
			Reporter.logWithScreenShot("Unable to enter the Sensor code ", MessageTypes.Fail);
		}		
	}


				public void verifyapplysensor() 
				{
		    	getNFKiosApplysensorbackbtn().isPresent();
		    	getNFKiosApplysensorTitle().isDisplayed();
		    	getNFKiosApplysensorText1().isPresent();
		    	getNFKiosSensorpairpageApplysensorRightabdomenBtn().assertPresent("RightAbdomen");
		    	getNFKiosSensorpairpageApplysensorLeftabdomenBtn().assertPresent("leftAbdomen");
		    	getNFKiosSensorpairpageApplysensorRightarmBtn().assertPresent("rightarm");
		    	getNFKiosSensorpairpageApplysensorLeftarmBtn().assertPresent("Leftarm");;
		    	getNFKiosApplysensorHowtoapplysensorlink().assertPresent("");
		    	getNFKiosApplysensorText2().assertPresent();
		    	LFSUtilsIOS.waitforLoad();
		    	Reporter.logWithScreenShot("Sensor code is entered ", MessageTypes.Pass);
		    }
		   	
		public void verifyapplysensor2to6yrold() 
		{
	    	System.out.println("Verifying Apply sensor screen");
	    	getNFKiosApplysensorbackbtn().isPresent();
	    	getNFKiosApplysensorTitle().isDisplayed();
	    	getNFKiosApplysensorText1().isPresent();
	    	getNFKiosSensorpairpageApplysensorrightButtockBtn().assertPresent("Rightbuttock");
	    	getNFKiosSensorpairpageApplysensorleftButtockBtn().assertPresent("leftbuttock");
	    	getNFKiosApplysensorHowtoapplysensorlink().assertPresent("");
	    	getNFKiosApplysensorText2().assertPresent();
	    	LFSUtilsIOS.waitforLoad();
	    	Reporter.logWithScreenShot("Sensor code is entered ", MessageTypes.Pass);
	    }
		
		
		public void verifyhowtoapplysensorlink() 
		{
	    	getNFKiosApplysensorHowtoapplysensorlink().click();
	    	getNFKioshowtoapplysenorbackbtn().isPresent();
	    	getNFKioshowtoapplysensorTitle().isDisplayed();
	    	getNFKioshowtoapplysensorpairbtn().isPresent();
	    	Reporter.logWithScreenShot("How to apply senor screen with images1", MessageTypes.Pass);
	    	LFSUtilsIOS.scrollDown();
	    	Reporter.logWithScreenShot("How to apply senor screen with images2", MessageTypes.Pass);
	    	getNFKioshowtoapplysensorhelpfultiplink().isPresent();
	    	LFSUtilsIOS.waitforLoad();
	    }
		public void verifyhelpfultipslink() 
		{
	    	MoremenuPageIOS more=new MoremenuPageIOS();
	    	getNFKioshowtoapplysensorhelpfultiplink().click();
	    	Reporter.logWithScreenShot("HelpFul tips screen", MessageTypes.Pass);
	    	getNFKioshowtoapplysensorhelpfultiplinktitle().isPresent();
	    	getNFKioshowtoapplysensorhelpfultiplinkXbtn().isPresent();
	    	getNFKioshowtoapplysensorhelpfultiplinkXbtn().isEnabled();
	    	getNFKioshowtoapplysensorhelpfultiplinkXbtn().click();
	    	LFSUtilsIOS.waitforLoad();
	    	LFSUtilsIOS.swipeWithScreenPercent(50, 60, 50, 20, 10);
	    	Reporter.logWithScreenShot("How to Apply screen",MessageTypes.Pass);
	    	getNFKioshowtoapplysenorbackbtn().click();
	    	
	    	LFSUtilsIOS.waitforLoad();
	    	Reporter.logWithScreenShot("User is on apply sensor screen", MessageTypes.Pass);
	    	LFSUtilsIOS.waitforLoad();
	    }
	
}
