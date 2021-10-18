package com.NFK.version1.android.pages;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.NFK.support.LFSUtilsAndroid;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

import io.appium.java_client.android.AndroidDriver;

public class AlertsPageAndroid extends WebDriverBaseTestPage<WebDriverTestPage>{

	
		
		private AndroidDriver androidDriver = (AndroidDriver) driver.getUnderLayingDriver();
		@FindBy(locator="NFK.alert.title")
		private QAFWebElement NFKAlertTitle;
		@FindBy (locator="NFK.alert.urgent.low.txt")
		private QAFWebElement NFKAlertUrgentLowTxt;
		@FindBy(locator="NFK.alert.alarmsetting.label")
		private QAFWebElement NFKAlertAlarmsettingLabel;
		@FindBy(locator="NFK.alert.urgentlowsoonalarm.label")
		private QAFWebElement NFKAlertUrgentlowsoonalarmLabel;
		@FindBy(locator="NFK.alert.urgentlow.label")
		private QAFWebElement NFKAlertUrgentlowLabel;
		@FindBy(locator="NFK.alert.urgentlow.default.value")
		private QAFWebElement NFKAlertUrgentlowDefaultValue;
		@FindBy (locator="NFK.alert.urgentlow.notify")
		private QAFWebElement NFKAlertUrgentlowNotify;
		@FindBy (locator="NFK.alert.urgentlow.repeat")
		private QAFWebElement NFKAlertUrgentlowRepeat;
		@FindBy (locator="NFK.alert.sound.label")
		private QAFWebElement NFKAlertSoundLabel;
		@FindBy(locator="NFK.alert.vibration.label")
		private QAFWebElement NFKAlertVibrationLabel;
		@FindBy (locator="NFK.alert.sound.content")
		private QAFWebElement NFKAlertSoundContent;
		@FindBy (locator="NFK.alert.vibration.content")
		private QAFWebElement NFKAlertVibrationContent;
		@FindBy(locator="NFK.alert.alarm.dynamic.txt")
		private QAFWebElement NFKAlertAlarmDynamicTxt;
		@FindBy(locator = "NFK.alert.elements.list")
	    private List<QAFWebElement> NFKAlertElementsList;
        @FindBy(locator="NFK.alert.back.btn")
        private QAFWebElement NFKAlertBackBtn;
		@FindBy(locator="NFK.alert.checkMark")
		private QAFWebElement NFKAlertCheckMark;
		@FindBy(locator="NFK.alert.uregentlowsoon.vibration.label")
		private QAFWebElement NFKAlertUregentlowsoonVibrationLabel;
		@FindBy(locator="NFK.alert.uregentlowsoon.sound.label")
		private QAFWebElement NFKAlertUregentlowsoonSoundLabel;
		@FindBy(locator="NFK.alert.urgentlowsoon.repeat.label")
		private QAFWebElement NFKAlertUrgentlowsoonRepeatLabel;
		@FindBy(locator="NFK.alert.uregentlowsoon.repeatfirst.button")
		private QAFWebElement NFKAlertUregentlowsoonRepeatfirstButton;
		@FindBy(locator="NFK.alert.uregentlowsoon.repeatsecond.button")
		private QAFWebElement NFKAlertUregentlowsoonRepeatsecondButton;
		@FindBy(locator="NFK.alert.description.txt")
		private QAFWebElement NFKAlertDescriptionTxt;
		@FindBy(locator = "NFK.alert.suboptions.screens.labels")
	    private List<QAFWebElement> NFKAlertSuboptionsScreensLabels;
		@FindBy(locator = "NFK.alert.suboptions.screens.switch.btn")
	    private QAFWebElement NFKAlertSuboptionsScreensSwitchBtn;
		@FindBy(locator="NFK.alert.text.value")
		private List<QAFWebElement> NFKAlertTextValue;
		@FindBy(locator="NFK.alert.numberpicker")
		private QAFWebElement NFKAlertNumberpicker;
		@FindBy(locator="NFK.alert.picker.done.btn")
		private QAFWebElement NFKAlertPickerDoneBtn;
		@FindBy(locator="NFK.alert.picker.cancel.btn")
		private QAFWebElement NFKAlertPickerCancelBtn;
		@FindBy(locator="NFK.alert.picker.hr.lbl")
		private QAFWebElement NFKAlertPickerHrLbl;
		@FindBy(locator="NFK.alert.picker.min.lbl")
		private QAFWebElement NFKAlertPickerMinLbl;
		@FindBy(locator="NFK.alert.picker.upper.fieldbtn")
		private List<QAFWebElement> NFKAlertPickerUpperFieldbtn;
		@FindBy(locator="NFK.alert.picker.lower.fieldbtn")
		private QAFWebElement NFKAlertPickerLowerFieldbtn;
		@FindBy(locator="NFK.alert.repeat.numberpicker")
		private List<QAFWebElement> NFKAlertRepeatNumberpicker;
		
		//Edit scehedule
		@FindBy(locator="NFK.alert.editschedule.submenu.lbl")
		private List<QAFWebElement> NFKAlertEditscheduleSubmenuLbl;
		@FindBy(locator="NFK.alert.editschedule.submenu.values")
		private List<QAFWebElement> NFKAlertEditscheduleSubmenuValues;
		@FindBy(locator="NFK.alert.editschedule.acctndetails.text")
		private List<QAFWebElement> NFKAlertEditscheduleAcctndetailsText;	
		@FindBy(locator="NFK.alert.schedule.name")
		private QAFWebElement NFKAlertScheduleName;
		
		@FindBy(locator="NFK.editschedulepage.title")
		private QAFWebElement NFKEditschedulepageTitle;
		@FindBy(locator="NFK.editschedulepage.cancel.btn")
		private QAFWebElement NFKEditschedulepageCancelBtn;
		@FindBy(locator="NFK.editschedulepage.save.btn")
		private QAFWebElement NFKEditschedulepageSaveBtn;
		@FindBy(locator="NFK.editschedulepage.account.txts")
		private List<QAFWebElement> NFKEditschedulepageAccountTxts;
		@FindBy(locator="NFK.editschedulepage.schedules.value")
		private List<QAFWebElement> NFKEditschedulepageSchedulesValue;
		@FindBy(locator="NFK.editschedulepage.schedules.labels")
		private List<QAFWebElement> NFKEditschedulepageSchedulesLabels;
		@FindBy(locator="NFK.editschedulepage.clock.cancel.btn")
		private QAFWebElement NFKEditschedulepageClockCancelBtn;
		@FindBy(locator="NFK.editschedulepage.clock.ok.btn")
		private QAFWebElement NFKEditschedulepageClockOkBtn;
		@FindBy(locator="NFK.editschedulepage.clock.hrs.txt")
		private QAFWebElement NFKEditschedulepageClockHrsTxt;
		@FindBy(locator="NFK.editschedulepage.clock.min.txt")
		private QAFWebElement NFKEditschedulepageClockMinTxt;
		@FindBy(locator="NFK.editschedulepage.clock.am.txt")
		private QAFWebElement NFKEditschedulepageClockAmTxt;
		@FindBy(locator="NFK.editschedulepage.clock.pm.txt")
		private QAFWebElement NFKEditschedulepageClockPmTxt;
		@FindBy(locator="NFK.alert.reset.alert.btn")
		private QAFWebElement NFKAlertResetAlertBtn;
		
		public QAFWebElement getNFKAlertResetAlertBtn() {
			return NFKAlertResetAlertBtn;
		}
      public List<QAFWebElement> getNFKAlertElementsList() {
		return NFKAlertElementsList;
    	}
      public QAFWebElement getNFKEditschedulepageStatictextBtn(String text) {
  		return LFSUtilsAndroid.getElement("NFK.editschedulepage.statictext.btn", text);
  	}
      public QAFWebElement getNFKEditschedulepageTitle() {
    	  return NFKEditschedulepageTitle;
      }
      public QAFWebElement getNFKEditschedulepageClockHrsTxt() {
    	  return NFKEditschedulepageClockHrsTxt;
      }
      public QAFWebElement getNFKEditschedulepageClockMinTxt() {
    	  return NFKEditschedulepageClockMinTxt;
      }
      public QAFWebElement getNFKEditschedulepageClockAmTxt() {
    	  return NFKEditschedulepageClockAmTxt;
      }
      public QAFWebElement getNFKEditschedulepageClockPmTxt() {
    	  return NFKEditschedulepageClockPmTxt;
      }
            public QAFWebElement getNFKEditschedulepageCancelBtn() {
    	  return NFKEditschedulepageCancelBtn;
      }
      public QAFWebElement getNFKEditschedulepageSaveBtn()
      {
    	  return NFKEditschedulepageSaveBtn;
      }  
      public List<QAFWebElement> getNFKEditschedulepageAccountTxts(){
    	  return NFKEditschedulepageAccountTxts;
      }
      public List<QAFWebElement> getNFKEditschedulepageSchedulesValue(){
    	  return NFKEditschedulepageSchedulesValue;
      }
      public List<QAFWebElement> getNFKEditschedulepageSchedulesLabels(){
    	  return NFKEditschedulepageSchedulesLabels;
      }
      public QAFWebElement getNFKAlertScheduleName()
      {
    	   return NFKAlertScheduleName;  
      }   
      public List<QAFWebElement> getNFKAlertEditscheduleSubmenuLbl(){
    	  return NFKAlertEditscheduleSubmenuLbl;
      }
      public List<QAFWebElement> getNFKAlertEditscheduleSubmenuValues(){
    	  return NFKAlertEditscheduleSubmenuValues;
      }
      public List<QAFWebElement> getNFKAlertRepeatNumberpicker(){
    	  return NFKAlertRepeatNumberpicker;
      }
      public QAFWebElement getNFKAlertPickerHrLbl() {
    	  return NFKAlertPickerHrLbl;
      }
      public List<QAFWebElement> getNFKAlertPickerUpperFieldbtn() {
    	  return NFKAlertPickerUpperFieldbtn;
      }
      public QAFWebElement getNFKAlertPickerLowerFieldbtn() {
    	  return NFKAlertPickerLowerFieldbtn;
      }
      public QAFWebElement getNFKAlertPickerMinLbl() {
    	  return NFKAlertPickerMinLbl;
      }
 
      public QAFWebElement getNFKAlertNumberpicker() {
    	  return NFKAlertNumberpicker;
      }
      public QAFWebElement getNFKAlertPickerDoneBtn() {
    	  return NFKAlertPickerDoneBtn;
      }
      public QAFWebElement getNFKAlertPickerCancelBtn() {
    	  return NFKAlertPickerCancelBtn;
      }
      public List<QAFWebElement> getNFKAlertSuboptionsScreensLabels(){
    	  return NFKAlertSuboptionsScreensLabels;
      }
      public List<QAFWebElement> getNFKAlertTextValue() {
    	  return NFKAlertTextValue;
      }
      public QAFWebElement getNFKAlertSuboptionsScreensSwitchBtn(){
    	  return NFKAlertSuboptionsScreensSwitchBtn;
      }
		public QAFWebElement getNFKAlertTitle(){
			return  NFKAlertTitle;
		}
		
		public QAFWebElement getNFKAlertUrgentLowTxt() {
			return NFKAlertUrgentLowTxt;
		}
		public QAFWebElement getNFKAlertAlarmsettingLabel() {
			return NFKAlertAlarmsettingLabel;
		}
		public QAFWebElement getNFKAlertUrgentlowLabel() {
			return NFKAlertUrgentlowLabel;
		}
		public QAFWebElement getNFKAlertUrgentlowsoonalarmLabel() {
			return NFKAlertUrgentlowsoonalarmLabel;
		}
		public QAFWebElement getNFKAlertUrgentlowDefaultValue() {
			return NFKAlertUrgentlowDefaultValue;
		}
		public QAFWebElement getNFKAlertUrgentlowNotify() {
			return NFKAlertUrgentlowNotify;
		}
		
		 public QAFWebElement getNFKAlertUrgentlowRepeat() {
			 return NFKAlertUrgentlowRepeat;
		 }
		 public QAFWebElement getNFKAlertSoundLabel() {
			 return NFKAlertSoundLabel;
		 }
		 public QAFWebElement getNFKAlertVibrationLabel() {
			 return NFKAlertVibrationLabel;
		 }
		
		  public QAFWebElement getNFKAlertSoundContent() {
			  return NFKAlertSoundContent;
		  }
		  public QAFWebElement getNFKAlertVibrationContent() {
			  return NFKAlertVibrationContent;
		  }
		
		  public QAFWebElement getNFKAlertAlarmDynamicTxt(String text) {
				return LFSUtilsAndroid.getElement("NFK.alert.alarm.dynamic.txt", text);
			}
		 public QAFWebElement getNFKAlertBackBtn()
		 {
			 return NFKAlertBackBtn;
		 }
         public QAFWebElement getNFKAlertCheckMark() {
        	 return NFKAlertCheckMark;
         }
         public QAFWebElement getNFKAlertUregentlowsoonVibrationLabel()
         {
        	 return NFKAlertUregentlowsoonVibrationLabel;
         }
		
		 public QAFWebElement getNFKAlertUregentlowsoonSoundLabel() {
			 return NFKAlertUregentlowsoonSoundLabel;
		 }
		 public QAFWebElement getNFKAlertUrgentlowsoonRepeatLabel() {
			 return NFKAlertUrgentlowsoonRepeatLabel;
		 }
		 
		 public QAFWebElement getNFKAlertUregentlowsoonRepeatfirstButton() {
			 return NFKAlertUregentlowsoonRepeatfirstButton;
		 } 
		 public QAFWebElement getNFKAlertUregentlowsoonRepeatsecondButton() {
			 return NFKAlertUregentlowsoonRepeatsecondButton;
		 }
		 public QAFWebElement getNFKAlertDescriptionTxt() {
			 return NFKAlertDescriptionTxt;
		 }
		public QAFWebElement getNFKEditschedulepageClockCancelBtn() {
			return NFKEditschedulepageClockCancelBtn;
		}
		public QAFWebElement getNFKEditschedulepageClockOkBtn() {
			return NFKEditschedulepageClockOkBtn;
		}
			
		public void verifyAlertScreen() {	
         
		getNFKAlertTitle().verifyPresent("Alerts");
		getNFKAlertAlarmsettingLabel().verifyPresent("Alarm Settings");
		getNFKAlertUrgentlowLabel().verifyPresent("Urgent Low Alarm");
		getNFKAlertUrgentlowsoonalarmLabel().verifyPresent("Urgent Low Soon Alarm");
		
		getNFKAlertAlarmDynamicTxt(ConfigurationManager.getBundle().getString("alerts.alarmsSettings.Description")).isPresent();
	    Reporter.logWithScreenShot("Alert screen displayed", MessageTypes.Pass); 
		}


		public void clickOnUrgentAlarmAndVerify(String option) {
			option = option.toUpperCase();
			switch(option) {
			case "URGENT LOW ALARM":
				verifyUrgentLow();
				Reporter.logWithScreenShot("User verified the Urgent Low Alarm screen",MessageTypes.Pass);
				break;
			case "URGENT LOW SOON":
				clickUrgentLowSoon();
				verifyUrgentLowSoon();
				Reporter.logWithScreenShot("User verified the Urgent Low Soon Alarm screen",MessageTypes.Pass);
				break;
			}
				    
		}
		
		
		private void verifyUrgentLowSoon() {		
			getNFKAlertTitle().assertPresent("Urgent Low Soon Alarm");
			getNFKAlertSuboptionsScreensSwitchBtn().isEnabled();
			getNFKAlertUrgentlowsoonRepeatLabel().assertPresent("Repeat Every(min.)");
			getNFKAlertUregentlowsoonSoundLabel().assertPresent("Sound");
			getNFKAlertUregentlowsoonVibrationLabel().verifyPresent("Vibration");
			getNFKAlertUregentlowsoonRepeatfirstButton().assertPresent("15");
			getNFKAlertUregentlowsoonRepeatsecondButton().assertPresent("30");
			getNFKAlertSoundContent().assertPresent("Urgent Low Soon");
//			getNFKAlertVibrationContent().assertPresent("Urgent Low Soon");
			getNFKEditschedulepageStatictextBtn(LFSUtilsAndroid.getPropString("urgent.low.soon.hint"));
		}

		private void clickUrgentLowSoon() {
			getNFKAlertUrgentlowsoonalarmLabel().isPresent();
			getNFKAlertUrgentlowsoonalarmLabel().click();
			
		}
		private void verifyUrgentLow() {
			getNFKAlertUrgentlowLabel().isPresent();
			getNFKAlertUrgentlowDefaultValue().verifyPresent("55");
			getNFKAlertUrgentlowLabel().click();
			getNFKAlertTitle().waitForPresent();
			getNFKAlertTitle().verifyPresent("Urgent Low Alarm");
		    Assert.assertNotNull(getNFKAlertUrgentlowNotify().getAttribute("readonly"));
		    Assert.assertNotNull(getNFKAlertUrgentlowRepeat().getAttribute("readonly"));
		    getNFKAlertAlarmDynamicTxt(ConfigurationManager.getBundle().getString("urgentlow.alarm.notification.text")).isPresent();
		    getNFKAlertSoundLabel().verifyPresent("Sound");
		    getNFKAlertVibrationLabel().verifyPresent("Vibration");
		    getNFKAlertSoundContent().verifyPresent("Urgent Low");
//		    getNFKAlertVibrationContent().verifyPresent("Urgent Low");
		    getNFKAlertAlarmDynamicTxt(ConfigurationManager.getBundle().getString("urgentlow.alarm.notification.belowlevel.text")).isPresent();	   
		}

		@Override
		protected void openPage(PageLocator locator, Object... args) {
			
		}

		public void verifySoundAndVibrationScreen(String str0) {
			getNFKAlertSoundContent().isPresent();
			getNFKAlertSoundContent().click();			
			String str1=str0.toUpperCase();
            verifyList(str1);
            clickBackbutton();
			/*
			 * getNFKAlertVibrationContent().isPresent(); LFSUtilsAndroid.waitforLoad();
			 * getNFKAlertVibrationContent().click(); verifyList(str1); clickBackbutton();
			 */
            Reporter.logWithScreenShot("User verified the sound and vibration screens", MessageTypes.Pass);		
		}

		public void verifyList(String str1) {
			List<QAFWebElement> list=getNFKAlertElementsList();
	           String []linkText =new String[list.size()];
	           int i=0;
	           for(QAFWebElement a: list)
	           {
	              linkText[i]=a.getText().toUpperCase();
	            if((linkText[i]).equals(str1))
	             {
	            	 //check the checkmark is present or not
	         	   getNFKAlertCheckMark().isPresent();
	         	   Reporter.logWithScreenShot("User verified the default value selected ",MessageTypes.Pass);
	            }  
	              i++;
	           }		
		}

		public void clickBackbutton() {
			getNFKAlertBackBtn().isPresent();
			getNFKAlertBackBtn().click();
			LFSUtilsAndroid.waitforLoad();
			Reporter.logWithScreenShot("User clicked on Back button ", MessageTypes.Pass);	
			
		}

		public void clickAndVerifyScreen(String Option) {
                switch (Option) {
                   case "LOW":
                	   clickLowAlert();
                	   verifyLowScreen();
	                   break;
                   case "HIGH":
                	   clickHighAlert();
                	   verifyHighAlertScreen();
	                   break;
                   case "FALLRATE":
                	   clickFallRate();
                	   verifyFallRate();
	                   break;
                   case "RISERATE":
                	   clickRiseRate();
                	   verifyRiseRate();
	                   break;
                   case "SIGNALLOSS":
                	   clickSignalLoss();
                	   verifySignalLossScreen();               	 
	                   break;
                   case "NOREADINGS":
                	   clickNoReadings(Option);
                	   verifyNoReadings();
	                   break;
                    }
                Reporter.logWithScreenShot("User has Verified the "+Option+" screen",MessageTypes.Pass);
			
		}
		private void verifyNoReadings() {
			Assert.assertEquals(getNFKAlertTitle().getText(),LFSUtilsAndroid.
	      			   getPropString("noreading.title"));	 
			 getNFKAlertBackBtn().isPresent();
			Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(0).getText(),LFSUtilsAndroid.
	          		   getPropString("noreading.title"));
			getNFKAlertSuboptionsScreensSwitchBtn().getAttribute("text").equals("ON");
			 Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(1).getText(),LFSUtilsAndroid.
	      			   getPropString("alerts.sound.option"));
			 Assert.assertEquals(getNFKAlertTextValue().get(1).getText(), 
	      			 LFSUtilsAndroid.getPropString("noreading.sound"));
			 getNFKAlertAlarmDynamicTxt(LFSUtilsAndroid.getPropString("noreading.hint")).
			 assertPresent("Hint Text");	
			 getNFKAlertSuboptionsScreensLabels().get(1).click();
			  Assert.assertEquals(getNFKAlertTitle().getText(),LFSUtilsAndroid.getPropString("alerts.sound.option"));
	   	      getNFKAlertBackBtn().click();	
		}
		
		private void clickNoReadings(String option) {
			LFSUtilsAndroid.waitforLoad();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
	      	  getNFKEditschedulepageStatictextBtn(LFSUtilsAndroid.getPropString("noreadings.txt")).click();
	      	 LFSUtilsAndroid.pause(100);
		}
		private void verifySignalLossScreen() {
			Assert.assertEquals(getNFKAlertTitle().getText(),LFSUtilsAndroid.
	      			   getPropString("signalloss.title"));	 
			 getNFKAlertBackBtn().isPresent();
			Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(0).getText(),LFSUtilsAndroid.
	          		   getPropString("signalloss.title"));
			 getNFKAlertSuboptionsScreensSwitchBtn().getAttribute("text").equals("ON");
			 Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(1).getText(),LFSUtilsAndroid.
	          		   getPropString("formore.than"));
			 Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(2).getText(),LFSUtilsAndroid.
	      			   getPropString("alerts.sound.option"));
			 Assert.assertEquals(getNFKAlertTextValue().get(1).getAttribute("text"),
					 LFSUtilsAndroid.getPropString("signalloss.formore.than.val"));
				Assert.assertEquals(getNFKAlertTextValue().get(2).getText(), 
						LFSUtilsAndroid.getPropString("signalloss.sound"));
				 getNFKAlertAlarmDynamicTxt(LFSUtilsAndroid.getPropString("signal.loss.hint")).assertPresent("Hint Text");	
		
			
		}
		private void clickSignalLoss() {	
			LFSUtilsAndroid.waitforLoad();
			LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
	      	   Assert.assertEquals(getNFKAlertTextValue().get(6).getText(),LFSUtilsAndroid.
	      			   getPropString("appCommon.on"));
	      	   getNFKAlertTextValue().get(6).click();
			
		}
		public void updatePickervalue(String choice) {
			switch (choice) {
		 case "LOW":
      	    updateNotifyBelow();
      	    updateRepeatValue();
      	     clickSound();
      	     LFSUtilsAndroid.waitforLoad();
             break;
         case "HIGH":
      	    updateNotifyAbove();
      	    updateRepeatValue();
   	         clickSound();
   	      LFSUtilsAndroid.waitforLoad();
             break;
         case "FALLRATE":
       	    updateNotifyMeAt();
       	    clickRateSound();
    	      LFSUtilsAndroid.waitforLoad();
              break;
         case "RISERATE":
        	 updateNotifyMeAt();
        	 clickRateSound();
    	      LFSUtilsAndroid.waitforLoad();
            break;
         case "SIGNALLOSS":
        	 updateForMoreThan();
        	 clickSignalLossSound();
    	      LFSUtilsAndroid.waitforLoad();
            break;
		
		}
		      Reporter.logWithScreenShot("User has changed the "+choice+" picker values",MessageTypes.Pass);
		       
     }
		
		private void clickSignalLossSound() {
			LFSUtilsAndroid.waitforLoad();
			getNFKAlertTextValue().get(2).click();
  	      Assert.assertEquals(getNFKAlertTitle().getText(),LFSUtilsAndroid.getPropString("alerts.sound.option"));
  	      getNFKAlertBackBtn().click();
			
		}
		private void updateForMoreThan() {
			  String hrs =String.valueOf(ThreadLocalRandom.current().nextInt(0,4));
			  String min= String.valueOf((ThreadLocalRandom.current().nextInt(2, 55) + 4) / 5 * 5);
				 ConfigurationManager.getBundle().setProperty("formorethan.hrs",hrs);
				 ConfigurationManager.getBundle().setProperty("formorethan.min",min);
				 getNFKAlertTextValue().get(1).click();
			   while(!(getNFKAlertRepeatNumberpicker().get(0).getText().equals(hrs))){
				   getNFKAlertPickerUpperFieldbtn().get(1).click();
			   }
			   if(getNFKAlertRepeatNumberpicker().get(0).getText().equals("0")) 
			   {
				while(!(getNFKAlertRepeatNumberpicker().get(1).getText().equals("25"))){
					 getNFKAlertPickerUpperFieldbtn().get(3).click();
				 }
				   
			   }
			   else
				   { while(!(getNFKAlertRepeatNumberpicker().get(1).getText().equals(min))){
			        	getNFKAlertPickerUpperFieldbtn().get(3).click();
			        }
				   }      
           
		   getNFKAlertPickerDoneBtn().click();
		}
		
		private void updateNotifyMeAt() {			
			HashMap<Integer, String> map = new HashMap<Integer, String>();
			map.put(1,"2");
			map.put(2,"2.5");
			map.put(3,"3");
			map.put(4,"3.5");
			map.put(5,"4");

			int notifyval= ThreadLocalRandom.current().nextInt(1,4+1);
			String valueaboveme=map.get(notifyval);
		 	ConfigurationManager.getBundle().setProperty("fallrate.value",valueaboveme);
		 	getNFKAlertTextValue().get(1).click();
		    while(!(getNFKAlertNumberpicker().getText().equals(valueaboveme))){
			   getNFKAlertPickerUpperFieldbtn().get(1).click();
		   }     
	         getNFKAlertPickerDoneBtn().click();
	         getNFKAlertSuboptionsScreensSwitchBtn().click();
		}
		
		public void verifyUpdatedPickervalue(String option) {
			switch (option) {
			 case "LOW":
	      	     verifyUpdatedLowValue();
	      	     LFSUtilsAndroid.waitforLoad();
	             break;
	         case "HIGH":
	        	  verifyUpdatedHighValue();
		      	  LFSUtilsAndroid.waitforLoad();
	             break;
	         case "FALLRATE":
	        	  verifyUpdatedRateValue();
	     	     LFSUtilsAndroid.waitforLoad();
	              break;
	          case "RISERATE":
	        	  verifyUpdatedRateValue();
	     	      LFSUtilsAndroid.waitforLoad();
	              break;
	          case "SIGNALLOSS":
	        	  verifyUpdatedsignallossValue();
	     	      LFSUtilsAndroid.waitforLoad();
	              break;
			
			}
			   Reporter.logWithScreenShot("Verifies the updated Picker values of "+option,MessageTypes.Pass);
		}

		private void verifyUpdatedsignallossValue() {
			getNFKAlertSuboptionsScreensSwitchBtn().getText().equals("ON");	
			String gethrs=(String)ConfigurationManager.getBundle().getProperty("formorethan.hrs");
		String moremin=(String) ConfigurationManager.getBundle().getProperty("formorethan.min");
		String timehrs=gethrs.concat("hours"), timeonehr=gethrs.concat("hour");
		String timemin=moremin.concat("min");
		String formorethanval=timehrs+timemin, foronehr=timeonehr+timemin;
		int getmin=Integer.parseInt(moremin),mintw=25;
			 if((gethrs.equals("0"))) {
				Assert.assertEquals(getNFKAlertTextValue().get(1).getText().replaceAll("[, ;]", ""),
						mintw);
			 }
		else if(gethrs.equals("1")) {
				 Assert.assertEquals(getNFKAlertTextValue().get(1).getText().replaceAll("[, ;]", ""), 
						 foronehr );
			 }
			 else {
				 Assert.assertEquals((getNFKAlertTextValue().get(1).getText().replaceAll("[, ;]", "")),
						 formorethanval);
			 }
		}
		
		private void verifyUpdatedRateValue() {
			getNFKAlertSuboptionsScreensSwitchBtn().getText().equals("ON");
			String strval=(String)ConfigurationManager.getBundle().getProperty("fallrate.value");
			Assert.assertEquals(strval.replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
					getNFKAlertTextValue().get(1).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""));
			
		}
		
		private void verifyRiseRate() {
			Assert.assertEquals(getNFKAlertTitle().getText(),LFSUtilsAndroid.
	      			   getPropString("rise.rate"));	
			 getNFKAlertSuboptionsScreensSwitchBtn().getAttribute("text").equals("OFF");
			 Assert.assertEquals(getNFKAlertTextValue().get(1).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
					 LFSUtilsAndroid.getPropString("notify.me.at"));
		
			 Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(2).getText(),LFSUtilsAndroid.
	      			   getPropString("alerts.sound.option"));
				Assert.assertEquals(getNFKAlertTextValue().get(2).getText(), LFSUtilsAndroid.getPropString("rise.sound"));
				 getNFKAlertAlarmDynamicTxt(LFSUtilsAndroid.getPropString("rise.rate.hint")).assertPresent("Hint Text");	
		}
		
		private void clickRiseRate() {
			 LFSUtilsAndroid.waitforLoad();
	      	   Assert.assertEquals(getNFKAlertTextValue().get(6).getText(),LFSUtilsAndroid.
	      			   getPropString("appCommon.off"));
	      	   getNFKAlertTextValue().get(6).click();
			
		}
		private void clickFallRate() {
			 LFSUtilsAndroid.waitforLoad();
	      	   Assert.assertEquals(getNFKAlertTextValue().get(4).getText(),LFSUtilsAndroid.
	      			   getPropString("appCommon.off"));
	      	   getNFKAlertTextValue().get(4).click();	
		}
		
		private void verifyFallRate() {
			Assert.assertEquals(getNFKAlertTitle().getText(),LFSUtilsAndroid.
	      			   getPropString("fall.rate"));	
			 getNFKAlertSuboptionsScreensSwitchBtn().getAttribute("text").equals("OFF");
			 Assert.assertEquals(getNFKAlertTextValue().get(1).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
					 LFSUtilsAndroid.getPropString("notify.me.at"));
			 Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(2).getText(),LFSUtilsAndroid.
	      			   getPropString("alerts.sound.option"));
			Assert.assertEquals(getNFKAlertTextValue().get(2).getText(), LFSUtilsAndroid.getPropString("fall.sound"));
				 getNFKAlertAlarmDynamicTxt(LFSUtilsAndroid.getPropString("fall.rate.hint")).assertPresent("Hint Text");
		}
		
		private void verifyHighAlertScreen() {
			LFSUtilsAndroid.waitforLoad();
	      	   Assert.assertEquals(getNFKAlertTitle().getText(),LFSUtilsAndroid.
	      			   getPropString("high.alert.title"));  
	      	 getNFKAlertBackBtn().assertPresent("Back button");
	             Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(0).getText(),LFSUtilsAndroid.
	          		   getPropString("high.alert.title"));
	        	   Assert.assertEquals( getNFKAlertSuboptionsScreensLabels().get(1).getText(),LFSUtilsAndroid.
	      			   getPropString("high.notify.above"));
	      	   Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(2).getText(),LFSUtilsAndroid.
	      			   getPropString("alerts.repeat"));
	      	   Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(3).getText(),LFSUtilsAndroid.
	      			   getPropString("alerts.sound.option"));
	      	 getNFKAlertAlarmDynamicTxt(LFSUtilsAndroid.getPropString("high.hint.text")).assertPresent("Hint Text");
	      	   getNFKAlertSuboptionsScreensSwitchBtn().isEnabled();
	      
	      	Reporter.logWithScreenShot("High Alert Screen",MessageTypes.Pass);
	      	Assert.assertEquals(getNFKAlertTextValue().get(2).getText(),
	      			LFSUtilsAndroid.getPropString("reminder.types.never"));
	      	Assert.assertEquals(getNFKAlertTextValue().get(3).getText(), 
	      			LFSUtilsAndroid.getPropString("high.sound"));
	      	
		}

		private void clickHighAlert() {
			 LFSUtilsAndroid.waitforLoad();
	      	   Assert.assertEquals(getNFKAlertTextValue().get(5).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""),LFSUtilsAndroid.
	      			   getPropString("high.value"));
	      	   getNFKAlertTextValue().get(5).click();
			
		}

		private void clickLowAlert() {
			 LFSUtilsAndroid.waitforLoad();
	      	   Assert.assertEquals(getNFKAlertTextValue().get(3).getText(),LFSUtilsAndroid.
	      			   getPropString("low.value"));
	      	   getNFKAlertTextValue().get(3).click();	
		}

		private void verifyLowScreen() {
      	   LFSUtilsAndroid.waitforLoad();
      	   Assert.assertEquals(getNFKAlertTitle().getText(),LFSUtilsAndroid.
      			   getPropString("low.alert.title"));  
      	 getNFKAlertBackBtn().assertPresent("Back button");
             Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(0).getText(),LFSUtilsAndroid.
          		   getPropString("low.alert.title"));
        	   Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(1).getText(),LFSUtilsAndroid.
      			   getPropString("low.notify.below"));
      	   Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(2).getText(),LFSUtilsAndroid.
      			   getPropString("alerts.repeat"));
      	   Assert.assertEquals(getNFKAlertSuboptionsScreensLabels().get(3).getText(),LFSUtilsAndroid.
      			   getPropString("alerts.sound.option"));
      	 getNFKAlertAlarmDynamicTxt(LFSUtilsAndroid.getPropString("low.hint.text")).assertPresent("Hint Text");
      	   getNFKAlertSuboptionsScreensSwitchBtn().isEnabled();
      	Assert.assertEquals(getNFKAlertTextValue().get(1).getText(),LFSUtilsAndroid.getPropString("low.value"));
      	Assert.assertEquals(getNFKAlertTextValue().get(2).getText(),LFSUtilsAndroid.getPropString("reminder.types.never"));
      	Assert.assertEquals(getNFKAlertTextValue().get(3).getText(), LFSUtilsAndroid.getPropString("low.sound"));
      
		}

		private void clickSound() {
			LFSUtilsAndroid.waitforLoad();
			 getNFKAlertTextValue().get(3).click();
   	      Assert.assertEquals(getNFKAlertTitle().getText(),LFSUtilsAndroid.getPropString("alerts.sound.option"));
   	      getNFKAlertBackBtn().click();	
		}
		
		private void clickRateSound() {
			LFSUtilsAndroid.waitforLoad();
			 getNFKAlertTextValue().get(2).click();
   	      Assert.assertEquals(getNFKAlertTitle().getText(),LFSUtilsAndroid.getPropString("alerts.sound.option"));
   	      getNFKAlertBackBtn().click();	
		}
		
		private void updateRepeatValue() {
			   String hrs =String.valueOf(ThreadLocalRandom.current().nextInt(0,4));
			  String min= String.valueOf((ThreadLocalRandom.current().nextInt(2, 55) + 4) / 5 * 5);
				 ConfigurationManager.getBundle().setProperty("repeat.hrs",hrs);
				 ConfigurationManager.getBundle().setProperty("repeat.min",min);
				 getNFKAlertTextValue().get(2).click();
			   while(!(getNFKAlertRepeatNumberpicker().get(0).getText().equals(hrs))){
				   getNFKAlertPickerUpperFieldbtn().get(1).click();
			   }
			   if(getNFKAlertRepeatNumberpicker().get(0).getText().equals("0")) 
			   {
				while(!(getNFKAlertRepeatNumberpicker().get(1).getText().equals("15"))){
					 getNFKAlertPickerUpperFieldbtn().get(3).click();
				 }
				   
			   }
			   else
				   { while(!(getNFKAlertRepeatNumberpicker().get(1).getText().equals(min))){
			        	getNFKAlertPickerUpperFieldbtn().get(3).click();
			        }
				   }      
           
		   getNFKAlertPickerDoneBtn().click();
		}
		
		private void updateNotifyAbove() {

			   getNFKAlertTextValue().get(1).click();	
			   String randomNum = String.valueOf(ThreadLocalRandom.current().nextInt(120,310+ 1));
			   	String txt=getNFKAlertNumberpicker().getText();
			   	ConfigurationManager.getBundle().setProperty("high.value",randomNum);
			   if(getNFKAlertNumberpicker().getText().equals(randomNum)) {
				   Reporter.logWithScreenShot("Value found",MessageTypes.Pass);
				   }
			   else if(Integer.parseInt(randomNum) > Integer.parseInt(txt)){
				   while(!(getNFKAlertNumberpicker().getText().equals(randomNum))){
					   getNFKAlertPickerUpperFieldbtn().get(1).click();
			        }
			   }
			        else
			        {
			        	while(!(getNFKAlertNumberpicker().getText().equals(randomNum))){			        	
				        	getNFKAlertPickerUpperFieldbtn().get(0).click();
				        }
			        }
			        
			   getNFKAlertPickerDoneBtn().click();
		          
			
		}

		private void updateNotifyBelow() {
			   getNFKAlertTextValue().get(1).click();	
			   String randomNum = String.valueOf(ThreadLocalRandom.current().nextInt(60, 100 + 1));
			   	String txt=getNFKAlertNumberpicker().getText();
			   	ConfigurationManager.getBundle().setProperty("below.value",randomNum);
			   if(getNFKAlertNumberpicker().getText().equals(randomNum)) {
				   Reporter.logWithScreenShot("Value found",MessageTypes.Pass);
				   }
			   else if(Integer.parseInt(randomNum) > Integer.parseInt(txt)){
				   while(!(getNFKAlertNumberpicker().getText().equals(randomNum))){
					   getNFKAlertPickerUpperFieldbtn().get(1).click();
			        }
			   }
			        else
			        {
			        	while(!(getNFKAlertNumberpicker().getText().equals(randomNum))){			        	
				        	getNFKAlertPickerUpperFieldbtn().get(0).click();
				        }
			        }
			        
			   getNFKAlertPickerDoneBtn().click();
		          }
		
		
		private void verifyUpdatedHighValue() {
			LFSUtilsAndroid.waitforLoad();
  		  String gethrs= ConfigurationManager.getBundle().getPropertyValue("repeat.hrs");
		      String getmins= ConfigurationManager.getBundle().getPropertyValue("repeat.min");
		      String repeatval=gethrs+getmins;
			Assert.assertEquals(
			getNFKAlertTextValue().get(1).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
			ConfigurationManager.getBundle().getProperty("high.value"));
			if(gethrs.equals("0")) {
				Assert.assertEquals(getNFKAlertTextValue().get(2).getText().replaceAll("[^\\d]", " ").
						replaceAll("\\s", ""),"15");
			}else if(gethrs.equals("4")) {
				Assert.assertEquals(getNFKAlertTextValue().get(2).getText().replaceAll("[^\\d]", " ").
						replaceAll("\\s", ""),gethrs);
			} else {
			Assert.assertEquals(getNFKAlertTextValue().get(2).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", "")
					,repeatval);
			}
			
				}
		
		private void verifyUpdatedLowValue() {
			LFSUtilsAndroid.waitforLoad();
 		  String gethrs= ConfigurationManager.getBundle().getPropertyValue("repeat.hrs");
		      String getmins= ConfigurationManager.getBundle().getPropertyValue("repeat.min");
		      String repeatval=gethrs+getmins;
		      Assert.assertEquals(ConfigurationManager.getBundle().getPropertyValue("below.value"),
		  			getNFKAlertTextValue().get(1).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""));
		      if(gethrs.equals("0")) {
		    	  Assert.assertEquals(
							getNFKAlertTextValue().get(2).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""),"15"); 
		      }else if(gethrs.equals("4")) {
		    	  Assert.assertEquals(
							getNFKAlertTextValue().get(2).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""),gethrs); 
		      }else if(gethrs.equals("1")) {
		    	  Assert.assertEquals(
							getNFKAlertTextValue().get(2).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
							(gethrs+getmins)); 
		      }
		      else {
		   	Assert.assertEquals(
					getNFKAlertTextValue().get(2).getText().replaceAll("[^\\d]", " ").replaceAll("\\s", ""),repeatval);
		      }
		}
		
		
		public void enableAlertSchedule() {
			LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
			LFSUtilsAndroid.swipeWithScreenPercent(50,90,50,30,2);
			getNFKAlertSuboptionsScreensSwitchBtn().click();
			getNFKAlertSuboptionsScreensSwitchBtn().isEnabled();
		    }
		
		public void verifyNameField() {

			LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
			LFSUtilsAndroid.waitforLoad();
			Assert.assertEquals(getNFKAlertScheduleName().getText(), 
					LFSUtilsAndroid.getPropString("schedule.name"));
		}
		
		public void clickScheduleName() {
             LFSUtilsAndroid.waitforLoad();
             getNFKAlertScheduleName().click();
			 Assert.assertEquals(getNFKEditschedulepageTitle().getText(),
					 LFSUtilsAndroid.getPropString("edit.schedule.title"));
			 Reporter.logWithScreenShot("Edit Schedule screen",MessageTypes.Pass);
		}
		
		public void verifyEditScheduleScreen() {
		       waitForPageToLoad();
				LFSUtilsAndroid.waitforLoad();
			 Assert.assertEquals(getNFKEditschedulepageTitle().getText(),
					 LFSUtilsAndroid.getPropString("edit.schedule.title"));
			 Assert.assertEquals(getNFKEditschedulepageAccountTxts().get(0).getText(),
					 LFSUtilsAndroid.getPropString("edit.schedule.name.lbl"));
			 System.out.println("Get text forrooorooroo "+LFSUtilsAndroid.getPropString("edit.schedule.weekend.lbl"));
//			 getNFKEditschedulepageStatictextBtn(LFSUtilsAndroid.getPropString("edit.schedule.weekend.lbl")).
//			 assertPresent("Weekend text");
			 Assert.assertEquals(getNFKEditschedulepageSchedulesValue().get(0),
					 LFSUtilsAndroid.getPropString("schedule.name"));
			 Assert.assertEquals(getNFKEditschedulepageAccountTxts().get(1).getText(),
					 LFSUtilsAndroid.getPropString("edit.schedule.alert.settings.lbl"));
			 Assert.assertEquals(getNFKEditschedulepageSchedulesLabels().get(0),
					 LFSUtilsAndroid.getPropString("edit.schedule.treatcritical.lbl"));
			 getNFKEditschedulepageStatictextBtn(LFSUtilsAndroid.getPropString("edit.schedule.urgency.txt").replace("\"", ""));
			 Assert.assertEquals(getNFKEditschedulepageSchedulesLabels().get(1).getText(),
					 LFSUtilsAndroid.getPropString("edit.schedule.start.time"));
			 Assert.assertEquals(getNFKEditschedulepageSchedulesLabels().get(2).getText(), 
					 LFSUtilsAndroid.getPropString("edit.schedule.stop.time"));
			 Assert.assertEquals(getNFKEditschedulepageSchedulesLabels().get(3).getText(), 
					 LFSUtilsAndroid.getPropString("edit.schedule.daysweek.lbl"));
			 Assert.assertEquals(getNFKEditschedulepageSchedulesLabels().get(4).getText(),
					 LFSUtilsAndroid.getPropString("edit.schedule.ULS.txt"));
			 Assert.assertEquals(getNFKEditschedulepageSchedulesLabels().get(5).getText(),
					 LFSUtilsAndroid.getPropString("edit.schedule.low.txt"));
		   LFSUtilsAndroid.swipeWithScreenPercent(50,70, 50, 40,1);
			 Assert.assertEquals(getNFKEditschedulepageSchedulesLabels().get(6).getText(),
					 LFSUtilsAndroid.getPropString("edit.schedule.fall.txt"));
			 Assert.assertEquals(getNFKEditschedulepageSchedulesLabels().get(7).getText(),
					 LFSUtilsAndroid.getPropString("edit.schedule.high.txt"));
			 Assert.assertEquals(getNFKEditschedulepageSchedulesLabels().get(8).getText(),
					 LFSUtilsAndroid.getPropString("edit.schedule.srise.txt"));	 
		}
		
		public void clickUserAlertSchedule(String option) {
			 switch (option) {
	            case "low":
	         	   clikUserLowAlert();
	         	   verifyLowScreen();
	                break;
	            case "high":
	           	   clikUserHighAlert();
	           	   verifyHighAlertScreen();
	                  break;
	            case "fallrate":
	         	   clikUserFallRateAlert();
	         	   verifyFallRate();
	                break;
	            case "riserate":
	         	   clikUserRiseRateAlert();
	         	   verifyRiseRate();
	                break;
	            case "Urgent Low Soon":
	            	clikUserUrgentLowSoon();
	            	verifyUrgentLowSoon();
	                 break;       
	             }
				Reporter.logWithScreenShot("User has verified the "+option+" screen",MessageTypes.Pass);
			
		}
		
		private void clikUserUrgentLowSoon() {
	      	   Assert.assertEquals(getNFKAlertTextValue().get(5).getText(),LFSUtilsAndroid.
	      			   getPropString("appCommon.on"));
	      	   getNFKAlertTextValue().get(5).click();	
	      	 LFSUtilsAndroid.waitforLoad();
			
		}
		private void clikUserRiseRateAlert() {
			LFSUtilsAndroid.swipeWithScreenPercent(50,70,50,40,1); 
	      	   Assert.assertEquals(getNFKAlertTextValue().get(8).getText(),LFSUtilsAndroid.
	      			   getPropString("appCommon.off"));
	      	   getNFKAlertTextValue().get(8).click();	
	      	 LFSUtilsAndroid.waitforLoad();
		}
		
		private void clikUserFallRateAlert() {
			 LFSUtilsAndroid.waitforLoad();
				      	   Assert.assertEquals(getNFKEditschedulepageSchedulesValue().get(7).getText(),LFSUtilsAndroid.
	      			   getPropString("appCommon.off"));
	      	 getNFKEditschedulepageSchedulesValue().get(7).click();	
		}
		
		private void clikUserHighAlert() {
			LFSUtilsAndroid.swipeWithScreenPercent(50,70,50,40,1); 
			 getNFKEditschedulepageSchedulesValue().get(7).isPresent();
	      	 getNFKEditschedulepageSchedulesValue().get(7).click();
	    	 LFSUtilsAndroid.waitforLoad();
		}
		
		private void clikUserLowAlert() {
			LFSUtilsAndroid.waitforLoad();
	      	   Assert.assertEquals(getNFKEditschedulepageSchedulesValue().get(6).getText(),LFSUtilsAndroid.
	      			   getPropString("low.value"));
	      	 getNFKEditschedulepageSchedulesValue().get(6).click();	
		}
		
		public void enterScheduleName() {
			LFSUtilsAndroid.waitforLoad();
			String str="Holden Ford";
			getNFKEditschedulepageAccountTxts().get(0).sendKeys(str);
			ConfigurationManager.getBundle().setProperty("name.schedule", str);
		}
		
		public void verifyScheduleField(String option) {
			 switch (option) {
	            case "Canceling":
	            	getNFKEditschedulepageCancelBtn().click();
	            	verifyOnCancel();
	            	break;
	            case "Saving":
	            	enterScheduleName();
	            	getNFKEditschedulepageSaveBtn().click();
	            	verifyOnSaving();
	            	break;
	            
		}			
		
}
	   private void verifyOnSaving() {
		String savedval=(String)ConfigurationManager.getBundle().getProperty("name.schedule");
         Reporter.logWithScreenShot(savedval +"is present",MessageTypes.Pass);	
		}
		   
		public void verifyOnCancel() {
			   LFSUtilsAndroid.waitforLoad();
			   Assert.assertEquals(getNFKAlertScheduleName().getText(), 
						LFSUtilsAndroid.getPropString("schedule.name")); 
		    }
		public void clicksOnPicker(String option) {
			 switch (option) {
	            case "Start time":
	            	clickStartTime();
	            	verifyClock();
	            	verifyDefaultValue();
	            	getNFKEditschedulepageSchedulesLabels().get(1).click();
	            	updatePickerTime();
	            	String getval=	getNFKEditschedulepageSchedulesValue().get(2).getText().replaceAll(":","");
	            	verifyPickerSetTime(getval);
	            	break;
	            case "Stop time":
	            	clickStopTime();
	            	verifyClock();
	            	verifyDefaultStopTime();
	            	getNFKEditschedulepageSchedulesLabels().get(2).click();
	            	updateStopPickerTime();
	            
	            	verifyPickerStopSetTime();
	            	break;
	            case "Week picker":
	            	clickWeekPicker();
	            	verifyWeekPage();
	            	verifyupdatedweekvalue();
	            	break;      
			
		}
			 Reporter.logWithScreenShot("Verified the pickers of Edit schedule",MessageTypes.Pass);
}
		
		private void verifyPickerStopSetTime() {
			String time=	getNFKEditschedulepageSchedulesValue().get(3).getText().replaceAll(":","");	
			Assert.assertEquals(time,"430 PM");
		}
		private void verifyupdatedweekvalue() {
           LFSUtilsAndroid.waitforLoad();
			String getweekval=getNFKEditschedulepageSchedulesValue().get(4).getText();
		    Reporter.logWithScreenShot(getweekval, MessageTypes.Pass);
			
		}
		private void updatePickerTime() {
			 String randomhrs = String.valueOf(ThreadLocalRandom.current().nextInt(1,9));
			 LFSUtilsAndroid.waitforLoad();
			 getNFKEditschedulepageClockHrsTxt().sendKeys(randomhrs);
			new WebDriverWait(driver,20);
				 getNFKEditschedulepageClockPmTxt().click();
			 getNFKEditschedulepageClockOkBtn().click();
			 ConfigurationManager.getBundle().setProperty("picker.time",(randomhrs));			 
		}
		
		private void updateStopPickerTime() {
				 getNFKEditschedulepageClockPmTxt().click();
				 getNFKEditschedulepageClockOkBtn().click();	
		}
		
		public void verifyPickerSetTime(String getval2) {		
		 String updaatedtime=String.valueOf(ConfigurationManager.getBundle().getPropertyValue("picker.time"));
	     String am=" PM",zero="00";
	     String time=updaatedtime+zero+am;
	    Assert.assertEquals(getval2,time);
	     Reporter.logWithScreenShot("Verified the updated Picker values",MessageTypes.Pass);
			
		}
		
		private void verifyWeekPage() {
			Assert.assertEquals(getNFKEditschedulepageTitle().getText(),
					LFSUtilsAndroid.getPropString("day.week.title"));
			HashMap<String, String> weekview = new HashMap<String, String>();
	
			weekview.put("Every Sunday", "1");
			weekview.put("Every Monday", "2");
			weekview.put("Every Tuesday", "3");
			weekview.put("Every Wednesday", "4");
			weekview.put("Every Thursday", "5");
			weekview.put("Every Friday", "6");		
			weekview.put("Every Saturday", "7");
			 int key1 =ThreadLocalRandom.current().nextInt(1,4);
			 int key2=ThreadLocalRandom.current().nextInt(5,8);
			getNFKEditschedulepageSchedulesLabels().get(key1).click();
			getNFKEditschedulepageSchedulesLabels().get(key2).click();
			getNFKEditschedulepageCancelBtn().click();
		}
		
		private void verifyDefaultStopTime() {
			Assert.assertEquals(getNFKEditschedulepageSchedulesValue().get(3).getText(),LFSUtilsAndroid.getPropString
					("stop.time.default"));
			
		}
		private void verifyDefaultValue() {	
			Assert.assertEquals(getNFKEditschedulepageSchedulesValue().get(2).getText(),LFSUtilsAndroid.getPropString
					("start.time.default.value"));
			
		}
		private void verifyClock() {
			getNFKEditschedulepageClockCancelBtn().isPresent();
			getNFKEditschedulepageClockOkBtn().isPresent();
			//click cancel 
			getNFKEditschedulepageClockCancelBtn().click();
			
		}
		private void clickWeekPicker() {
			LFSUtilsAndroid.pause(200);
				Assert.assertEquals(getNFKEditschedulepageSchedulesValue().get(4).getText(),
				"All");
		getNFKEditschedulepageSchedulesLabels().get(3).click();
					
		}

		private void clickStopTime() {
			LFSUtilsAndroid.waitforLoad();
			getNFKEditschedulepageSchedulesLabels().get(2).click();
				
		}
		private void clickStartTime() {
			LFSUtilsAndroid.waitforLoad();
			getNFKEditschedulepageSchedulesLabels().get(1).click();
		}
		
		public void resetAlertsSettings() {
		    //UrgentLow soon set OFF 	
			  setUrgentLowSoonValue();
			   waitForPageToLoad();
			//Set Low value
			   setLowValue();
			  waitForPageToLoad();
			//Fallrate ON
			   setFallRate();
			   LFSUtilsAndroid.swipeWithScreenPercent(50, 70, 50, 40, 1);
		    //High value
			  setHighValue();
			//Rise Rate ON
			  setRiseToOn();
			//SignalLoss OFF
			  setSignalLossOFF();
			//No readings OFF
			  setNoReadingsOFF();
		}
		private void setNoReadingsOFF() {
	      	  getNFKEditschedulepageStatictextBtn(LFSUtilsAndroid.getPropString("noreadings.txt")).click();
			getNFKAlertSuboptionsScreensSwitchBtn().click();
			clickBackbutton();
			
		}
		private void setSignalLossOFF() {
			clickSignalLoss();
			getNFKAlertSuboptionsScreensSwitchBtn().click();
			clickBackbutton();
		}
		private void setRiseToOn() {
			 getNFKEditschedulepageStatictextBtn("Rise Rate").click();
			getNFKAlertSuboptionsScreensSwitchBtn().click();
			clickBackbutton();
		}
		private void setHighValue() {
			   getNFKEditschedulepageStatictextBtn("High").click();
			updateNotifyAbove();
			clickBackbutton();		
		}
		
		private void setFallRate() {
			clickFallRate();
			getNFKAlertSuboptionsScreensSwitchBtn().click();
			clickBackbutton();
			
		}
		private void setLowValue() {
			clickLowAlert();
			  updateNotifyBelow();
			  clickBackbutton();
			
		}
		private void setUrgentLowSoonValue() {
			clickUrgentLowSoon();
			getNFKAlertSuboptionsScreensSwitchBtn().click();
			clickBackbutton();
			
		}
		
		public void clickResetAlerts() {
			LFSUtilsAndroid.swipeWithScreenPercent(50,70,50,40,1);
			LFSUtilsAndroid.swipeWithScreenPercent(50,70,50,40,1);
			getNFKAlertResetAlertBtn().waitForPresent(200);
             getNFKAlertResetAlertBtn().click();
			SharePageAndroid share= new SharePageAndroid();
			share.getNFKSharepageShareReportPageTextDiscardTxt().click();
			Reporter.logWithScreenShot("settings configuration value",MessageTypes.Pass);
			getNFKAlertResetAlertBtn().click();
			share.getNFKSharepagePopupNodataOkBtn().click();
			LFSUtilsAndroid.waitforLoad();
		}
		public void getConfigurationSettinsg() {
			//reset to original settings
			Reporter.logWithScreenShot("Screen of ALerts ",MessageTypes.Pass);
			Assert.assertEquals(getNFKAlertTextValue().get(1).getText(),LFSUtilsAndroid.
	      			   getPropString("low.value")); 
			  Assert.assertEquals(getNFKAlertTextValue().get(2).getText(),LFSUtilsAndroid.
	      			   getPropString("appCommon.off"));
			 
			   Assert.assertEquals(getNFKAlertTextValue().get(4).getText(),LFSUtilsAndroid.
	      			   getPropString("appCommon.off"));
			   Assert.assertEquals(getNFKAlertTextValue().get(5).getText(),LFSUtilsAndroid.
	      			   getPropString("appCommon.on"));
			   Assert.assertEquals(getNFKAlertTextValue().get(6).getText(),LFSUtilsAndroid.
	      			   getPropString("appCommon.on"));
	      	  Reporter.logWithScreenShot("User has verified the Configuration Setting after reset",MessageTypes.Pass);
			   
			   Assert.assertTrue(getNFKAlertTextValue().get(3).getText().equals("200 mg/dL"));
				 
		}
		
}