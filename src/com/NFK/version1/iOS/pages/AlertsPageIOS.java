package com.NFK.version1.iOS.pages;


import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.NFK.support.LFSUtilsAndroid;
import com.NFK.support.LFSUtilsIOS;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.core.MessageTypes;
import com.qmetry.qaf.automation.ui.WebDriverBaseTestPage;
import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.api.PageLocator;
import com.qmetry.qaf.automation.ui.api.WebDriverTestPage;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;
import com.qmetry.qaf.automation.util.Reporter;

public class AlertsPageIOS extends WebDriverBaseTestPage<WebDriverTestPage>
{	
	
	@FindBy (locator= "NFKios.alertspage.alarm.txt")
	private QAFWebElement NFKiosAlertspagealarmtxt;
	@FindBy (locator= "NFKios.alertspage.urgent.low.alarm.lbl")
	private QAFWebElement NFKiosAlertspageurgentlowalarmlbl;
	@FindBy (locator= "NFKios.alertspage.urgent.low.soon.alarm.lbl")
	private QAFWebElement NFKiosAlertspageurgentlowsoonalarmlbl;
	@FindBy (locator="NFKios.alertspage.urgent.low.alarm.title")
	private QAFWebElement NFKiosAlertspageurgentlowalarmtitle;
	@FindBy (locator="NFKios.alertspage.notify.me.below.txt")
	private QAFWebElement NFKiosAlertspagenotifymebelowtxt;
	@FindBy (locator="NFKios.alertspage.repeat.txt")
	private QAFWebElement NFKiosAlertspagerepeatTxt;
	@FindBy (locator="NFKios.alertspage.urgent.low.alarm.back.btn.urgent.low")
	private QAFWebElement NFKiosAlertspageurgentlowalarmbackbtnurgentlow;
	@FindBy (locator="NFKios.alertspage.urgent.low.alarm.back.btn.urgent.low.soon")
	private QAFWebElement NFKiosAlertspageurgentlowalarmbackbtnurgentlowsoon;
	@FindBy (locator="NFKios.alertspage.back.btn")
	private QAFWebElement NFKiosAlertspagebackbtn;
	@FindBy (locator="NFKios.alertspage.urgent.low.alarm.repeat.hint.txt")
	private QAFWebElement NFKiosAlertspageurgentlowalarmrepeathinttxt;
	@FindBy (locator="NFKios.alertspage.urgent.low.alarm.sound.lbl")
	private QAFWebElement NFKiosAlertspageurgentlowalarmsoundlbl;
	@FindBy (locator="NFKios.alertspage.urgent.low.alarm.vibration.lbl")
	private QAFWebElement NFKiosAlertspageurgentlowalarmvibrationlbl;
	@FindBy (locator="NFKios.alertspage.urgent.low.alarm.urgent.low.hint.lbl")
	private QAFWebElement NFKiosAlertspageurgentlowalarmurgentlowhintlbl;
	@FindBy (locator= "NFKios.alertspage.urgent.low.alarm.sound.title")
	private QAFWebElement NFKiosAlertspageurgentlowalarmsoundtitle;
	@FindBy (locator="NFKios.alertspage.urgent.low.alarm.vibration.title")
	private QAFWebElement NFKiosAlertspageurgentlowalarmvibrationtitle;
	@FindBy (locator= "NFKios.alertspage.urgent.low.soon.alarm.title")
	private QAFWebElement NFKiosAlertspageurgentlowsoonalarmtitle;
	@FindBy (locator="NFKios.alertspage.urgent.low.soon.alarm.repreat")
	private QAFWebElement NFKiosAlertspageurgentlowsoonalarmrepreat;
	@FindBy (locator="NFKios.alertspage.urgent.low.soon.alarm.sound.lbl")
	private QAFWebElement NFKiosAlertspageurgentlowsoonalarmsoundlbl;
	@FindBy (locator="NFKios.alertspage.urgent.low.soon.alarm.vibration.lbl")
	private QAFWebElement NFKiosAlertspageurgentlowsoonalarmvibrationlbl;
	@FindBy (locator="NFKios.alertspage.urgent.low.soon.alarm.repeat.hint.txt")
	private QAFWebElement NFKiosAlertspageurgentlowsoonalarmrepeathinttxt;
	@FindBy (locator="NFKios.alertspage.urgent.low.alarm.urgent.low.select")
	private QAFWebElement NFKiosAlertspageurgentlowalarmurgentlowselect;
	@FindBy(locator="NFKios.alertspage.urgentlow.back.btn")
	private QAFWebElement NFKiosAlertspageUrgentLowBackBtn;
	@FindBy(locator="NFKios.alertspage.urgentlowsoon.back.btn")
	private QAFWebElement NFKiosAlertspageUrgentlowsoonBackBtn;
	@FindBy(locator="NFKios.alertspage.urgentlow.elements.soundvibration")
	private List<QAFWebElement> NFKiosAlertspageUrgentlowElementsSoundvibration;
	@FindBy(locator="NFKios.alertspage.urgentlow.checkmark")
	private QAFWebElement NFKiosAlertspageUrgentlowCheckmark;
	//Low Alert page
	@FindBy(locator="NFKios.alertspage.lowalert.txt")
	private QAFWebElement NFKiosAlertspageLowalertTxt;
    @FindBy(locator="NFKios.alertspage.lowalert.field")
	private QAFWebElement NFKiosAlertspageLowalertField;
    @FindBy(locator="NFKios.alertspage.switch.btn")
    private QAFWebElement NFKiosAlertspageSwitchBtn;
    @FindBy(locator="NFKios.alertspage.alertsc.switch.btn")
    private List<QAFWebElement> NFKiosAlertspageAlertscSwitchBtn;
    @FindBy(locator="NFKios.alertspage.lowalert.repeatfield")
    private QAFWebElement NFKiosAlertspageLowalertRepeatfield;
    @FindBy(locator="NFKios.alertspage.lowalert.soundfield")
    private QAFWebElement NFKiosAlertspageLowalertSoundfield;
    @FindBy(locator="NFKios.alertspage.lowalert.hint.txt")
    private QAFWebElement NFKiosAlertspageLowalertHintTxt;
    @FindBy(locator="NFKios.alertspage.lowalert.back.btn")
    private QAFWebElement NFKiosAlertspageLowalertBackBtn;
    @FindBy(locator="NFKios.alertspage.lowalert.notify.mebelow.btn")
    private QAFWebElement NFKiosAlertspageLowalertNotifyMebelowBtn;
    @FindBy(locator="NFKios.alertspage.picker.btn")
    private QAFWebElement NFKiosAlertspagePickerBtn;
    @FindBy(locator="NFKios.alertspage.picker.min.btn")
    private QAFWebElement NFKiosAlertspagePickerMinBtn;
    @FindBy(locator="NFKios.alertspage.picker.done.btn")
    private QAFWebElement NFKiosAlertspagePickerDoneBtn;
    @FindBy(locator="NFKios.alertspage.picker.cancel.btn")
    private QAFWebElement NFKiosAlertspagePickerCancelBtn;
    //High Alert
    @FindBy(locator="NFKios.alertspage.highalert.txt")
    private QAFWebElement NFKiosAlertspageHighalertTxt;
    @FindBy(locator="NFKios.alertspage.highalert.notify.meabove.btn")
    private QAFWebElement NFKiosAlertspageHighalertNotifyMeaboveBtn;
    @FindBy(locator="NFKios.alertspage.highalert.repeatfield")
    private QAFWebElement NFKiosAlertspageHighalertRepeatfield;
    @FindBy(locator="NFKios.alertspage.highalert.soundfield")
    private QAFWebElement NFKiosAlertspageHighalertSoundfield;
    @FindBy(locator="NFKios.alertspage.highalert.hint.txt")
    private QAFWebElement NFKiosAlertspageHighalertHintTxt;
    @FindBy(locator="NFKios.alertspage.highalert.back.btn")
    private QAFWebElement NFKiosAlertspageHighalertBackBtn;
    //Fall Rate
    @FindBy(locator="NFKios.alertspage.fallratealert.txt")
    private QAFWebElement NFKiosAlertspageFallratealertTxt;
    @FindBy(locator="NFKios.alertspage.fallratealert.notify.atbelow.btn")
    private QAFWebElement NFKiosAlertspageFallratealertNotifyAtbelowBtn;
    @FindBy(locator="NFKios.alertspage.fallratealert.soundfield")
    private QAFWebElement NFKiosAlertspageFallratealertSoundfield;
    @FindBy(locator="NFKios.alertspage.fallratealert.hint.txt")
    private QAFWebElement NFKiosAlertspageFallratealertHintTxt;
    @FindBy(locator="NFKios.alertspage.fallratealert.back.btn")
    private QAFWebElement NFKiosAlertspageFallratealertBackBtn;
    //Rise rate
    @FindBy(locator="NFKios.alertspage.riseratealert.txt")
    private QAFWebElement NFKiosAlertspageRiseratealertTxt;
    @FindBy(locator="NFKios.alertspage.riseratealert.notify.atabove.btn")
    private QAFWebElement NFKiosAlertspageRiseratealertNotifyAtaboveBtn;
    @FindBy(locator="NFKios.alertspage.riseratealert.soundfield")
    private QAFWebElement NFKiosAlertspageRiseratealertSoundfield;
    @FindBy(locator="NFKios.alertspage.riseratealert.hint.txt")
    private QAFWebElement NFKiosAlertspageRiseratealertHintTxt;
    @FindBy(locator="NFKios.alertspage.riseratealert.back.btn")
    private QAFWebElement NFKiosAlertspageRiseratealertBackBtn;
  //signal loss
    @FindBy(locator="NFKios.alertspage.signalloss.back.btn")
        private QAFWebElement NFKiosAlertspageSignallossBackBtn;
    @FindBy(locator="NFKios.alertspage.signalloss.txt")
        private QAFWebElement NFKiosAlertspageSignallossTxt;
    @FindBy(locator="NFKios.alertspage.signalloss.formorethan")
        private QAFWebElement NFKiosAlertspageSignallossFormorethan;
    @FindBy(locator="NFKios.alertspage.signalloss.soundfield")
        private QAFWebElement NFKiosAlertspageSignallossSoundfield;
    @FindBy(locator="NFKios.alertspage.signalloss.hint.txt")
        private QAFWebElement NFKiosAlertspageSignallossHintTxt;
    	
    //No reading
    @FindBy(locator="NFKios.alertspage.noreading.back.btn")
        private QAFWebElement NFKiosAlertspageNoreadingBackBtn;
    @FindBy(locator="NFKios.alertspage.noreading.txt")
        private QAFWebElement NFKiosAlertspageNoreadingTxt;
    @FindBy(locator="NFKios.alertspage.noreading.field")
        private QAFWebElement NFKiosAlertspageNoreadingField;
    @FindBy(locator="NFKios.alertspage.noreading.soundfield")
        private QAFWebElement NFKiosAlertspageNoreadingSoundfield;	
    @FindBy(locator="NFKios.alertspage.noreading.hint.txt")
        private QAFWebElement NFKiosAlertspageNoreadingHintTxt;	
    
    //Edit schedule
    @FindBy(locator="NFKios.alertspage.schedule.name.field")
      private QAFWebElement NFKiosAlertspageScheduleNameField;
    @FindBy(locator="NFKios.editschedulepage.title")
     private QAFWebElement NFKiosEditschedulepageTitle;
    @FindBy(locator="NFKios.editschedulepage.cancel.btn")
     private QAFWebElement  NFKiosEditschedulepageCancelBtn;
    @FindBy(locator="NFKios.editschedulepage.save.btn")
      private QAFWebElement  NFKiosEditschedulepageSaveBtn;
    @FindBy(locator="NFKios.editschedulepage.schdeule.label")
      private QAFWebElement  NFKiosEditschedulepageSchdeuleLabel;
    @FindBy(locator="NFKios.editschedulepage.schdeule.name")
      private QAFWebElement  NFKiosEditschedulepageSchdeuleName;
    @FindBy(locator="NFKios.editschedulepage.weekend.label")
     private QAFWebElement NFKiosEditschedulepageWeekendLabel;
    @FindBy(locator="NFKios.editschedulepage.alertsettings.label")
      private QAFWebElement NFKiosEditschedulepageAlertsettingsLabel;
    @FindBy(locator="NFKios.editschedulepage.treatcritical.label")
    private QAFWebElement NFKiosEditschedulepageTreatcriticalLabel;
    @FindBy(locator="NFKios.editschedulepage.warningmsg.label")
    private QAFWebElement NFKiosEditschedulepageWarningmsgLabel;
    @FindBy(locator="NFKios.editschedulepage.starttime.label")
      private QAFWebElement NFKiosEditschedulepageStarttimeLabel;
    @FindBy(locator="NFKios.editschedulepage.stoptime.label")
    private QAFWebElement NFKiosEditschedulepageStoptimeLabel;
    @FindBy(locator="NFKios.editschedulepage.daysofweek.field")
      private QAFWebElement NFKiosEditschedulepageDaysofweekField;
    @FindBy(locator="NFKios.editschedulepage.urgentlbl.label")
     private QAFWebElement NFKiosEditschedulepageUrgentlblLabel;
    @FindBy(locator="NFKios.editschedulepage.low.label")
     private QAFWebElement NFKiosEditschedulepageLowLabel;
    @FindBy(locator="NFKios.editschedulepage.fallrate.label")
      private QAFWebElement NFKiosEditschedulepageFallrateLabel;
    @FindBy(locator="NFKios.editschedulepage.high.label")
      private QAFWebElement NFKiosEditschedulepageHighLabel;
    @FindBy(locator="NFKios.editschedulepage.riserate.label")
      private QAFWebElement NFKiosEditschedulepageRiserateLabel;
    @FindBy(locator="NFKios.editschedulepage.hrs.pkr")
    private QAFWebElement NFKiosEditschedulepageHrsPkr;
    @FindBy(locator="NFKios.editschedulepage.minute.pkr")
    private QAFWebElement NFKiosEditschedulepageMinutePkr;
    @FindBy(locator="NFKios.editschedulepage.ampm.pkr")
    private QAFWebElement NFKiosEditschedulepageAmPmPkr;
    @FindBy(locator="NFKios.editschedulepage.done.btn")
    private QAFWebElement NFKiosEditschedulepageDoneBtn;
    @FindBy(locator="NFKios.editschedulepage.picker.cancel.btn")
    private QAFWebElement NFKiosEditschedulepagePickerCancelBtn;
    @FindBy(locator="NFKios.editschedulepage.week.back.btn")
    private QAFWebElement NFKiosEditschedulepageWeekBackBtn;
    @FindBy(locator="NFKios.alertspage.reset.btn")
    private QAFWebElement NFKiosAlertspageResetBtn;
    @FindBy(locator="NFKios.alertspage.resetpop.reset.btn")
    private QAFWebElement NFKiosAlertspageResetpopResetBtn;
    
	@Override
	protected void openPage(PageLocator locator, Object... args) {
	}
	public QAFWebElement getNFKiosAlertspageResetBtn() {
		return NFKiosAlertspageResetBtn;
	}
	public QAFWebElement getNFKiosAlertspageResetpopResetBtn() {
		return NFKiosAlertspageResetpopResetBtn;
	}
	//Edit schedule
	 public QAFWebElement getNFKiosAlertspageScheduleNameField() {
		 return NFKiosAlertspageScheduleNameField;
	 }
	 public QAFWebElement getNFKiosEditschedulepageWeekBackBtn() {
		 return NFKiosEditschedulepageWeekBackBtn;
	 }
	 public QAFWebElement getNFKiosEditschedulepageHrsPkr() {
		 return NFKiosEditschedulepageHrsPkr;
	 }
	 public QAFWebElement getNFKiosEditschedulepageMinutePkr() {
		 return NFKiosEditschedulepageMinutePkr;
	 }
	 public QAFWebElement getNFKiosEditschedulepageAmPmPkr() {
		 return NFKiosEditschedulepageAmPmPkr;
	 }
	 public QAFWebElement getNFKiosEditschedulepageDoneBtn() {
		 return NFKiosEditschedulepageDoneBtn;
	 }
	 public QAFWebElement getNFKiosEditschedulepagePickerCancelBtn() {
		 return NFKiosEditschedulepagePickerCancelBtn;
	 }
	 public QAFWebElement getNFKiosEditschedulepageTitle() {
		 return NFKiosEditschedulepageTitle;
	 }
	 public QAFWebElement getNFKiosEditschedulepageCancelBtn() {
		 return NFKiosEditschedulepageCancelBtn;
	 }
	 public QAFWebElement getNFKiosEditschedulepageSaveBtn() {
		 return NFKiosEditschedulepageSaveBtn;
	 }
	 public QAFWebElement getNFKiosEditschedulepageSchdeuleLabel() {
		 return NFKiosEditschedulepageSchdeuleLabel;
	 }	
	 public QAFWebElement getNFKiosEditschedulepageSchdeuleName(){
		 return NFKiosEditschedulepageSchdeuleName;
	 }	
	 public QAFWebElement getNFKiosEditschedulepageWeekendLabel(){
		 return NFKiosEditschedulepageWeekendLabel;
	 }	
	 public QAFWebElement getNFKiosEditschedulepageAlertsettingsLabel(){
		 return NFKiosEditschedulepageAlertsettingsLabel;
	 }	
	public QAFWebElement getNFKiosEditschedulepageTreatcriticalLabel() {
		return NFKiosEditschedulepageTreatcriticalLabel;
	}
	public QAFWebElement getNFKiosEditschedulepageWarningmsgLabel() {
		return NFKiosEditschedulepageWarningmsgLabel;
	}
	public QAFWebElement getNFKiosEditschedulepageStarttimeLabel(){
		return NFKiosEditschedulepageStarttimeLabel;
	}	
	public QAFWebElement getNFKiosEditschedulepageStoptimeLabel() {
		return NFKiosEditschedulepageStoptimeLabel;
	}
	public QAFWebElement getNFKiosEditschedulepageDaysofweekField(){
		return NFKiosEditschedulepageDaysofweekField;
	}
	public QAFWebElement getNFKiosEditschedulepageUrgentlblLabel(){
		return NFKiosEditschedulepageUrgentlblLabel;
	}
	public QAFWebElement getNFKiosEditschedulepageLowLabel(){
		return NFKiosEditschedulepageLowLabel;
	}
	public QAFWebElement getNFKiosEditschedulepageFallrateLabel() {
		return NFKiosEditschedulepageFallrateLabel;
	}
	public QAFWebElement getNFKiosEditschedulepageHighLabel() {
		return NFKiosEditschedulepageHighLabel;
	}
	public QAFWebElement getNFKiosEditschedulepageRiserateLabel() {
		return NFKiosEditschedulepageRiserateLabel;
	}
	public List<QAFWebElement> getNFKiosAlertspageAlertscSwitchBtn(){
		return NFKiosAlertspageAlertscSwitchBtn;
	}
	//Low Alert page
	public QAFWebElement getNFKiosAlertspageLowalertTxt() {
		return NFKiosAlertspageLowalertTxt;
	}
	public QAFWebElement getNFKiosAlertspagePickerMinBtn() {
		return NFKiosAlertspagePickerMinBtn;
	}
	public QAFWebElement getNFKiosAlertspagePickerBtn() {
		return NFKiosAlertspagePickerBtn;
	}
	public QAFWebElement getNFKiosAlertspagePickerDoneBtn() {
		return NFKiosAlertspagePickerDoneBtn;
	}
	public QAFWebElement getNFKiosAlertspagePickerCancelBtn() {
		return NFKiosAlertspagePickerCancelBtn;
	}
	public QAFWebElement getNFKiosAlertspageLowalertNotifyMebelowBtn() {
		return NFKiosAlertspageLowalertNotifyMebelowBtn;
	}
	public QAFWebElement getNFKiosAlertspageLowalertField() {
		return NFKiosAlertspageLowalertField;
	}
	public QAFWebElement getNFKiosAlertspageSwitchBtn() {
		return NFKiosAlertspageSwitchBtn;
	}
	public QAFWebElement getNFKiosAlertspageLowalertRepeatfield() {
		return NFKiosAlertspageLowalertRepeatfield;
	}
	public QAFWebElement getNFKiosAlertspageLowalertSoundfield() {
		return NFKiosAlertspageLowalertSoundfield;
	}
	public QAFWebElement getNFKiosAlertspageLowalertHintTxt() {
		return NFKiosAlertspageLowalertHintTxt;
	}
	public QAFWebElement getNFKiosAlertspageLowalertBackBtn() {
		return NFKiosAlertspageLowalertBackBtn;
	}
	//High Rate
	public QAFWebElement getNFKiosAlertspageHighalertTxt() {
		 return NFKiosAlertspageHighalertTxt;
	}
	public QAFWebElement getNFKiosAlertspageHighalertNotifyMeaboveBtn() {
		return NFKiosAlertspageHighalertNotifyMeaboveBtn;
	}
	public QAFWebElement getNFKiosAlertspageHighalertRepeatfield() {
		return NFKiosAlertspageHighalertRepeatfield;
	}
	public QAFWebElement getNFKiosAlertspageHighalertSoundfield() {
		return NFKiosAlertspageHighalertSoundfield;
	}
	public QAFWebElement getNFKiosAlertspageHighalertHintTxt() {
		return NFKiosAlertspageHighalertHintTxt;
	}
	public QAFWebElement getNFKiosAlertspageHighalertBackBtn() {
		return NFKiosAlertspageHighalertBackBtn;
	}
	//Fall Rate
	public QAFWebElement getNFKiosAlertspageFallratealertTxt() {
		return NFKiosAlertspageFallratealertTxt;
	}
	public QAFWebElement getNFKiosAlertspageFallratealertNotifyAtbelowBtn() {
		return NFKiosAlertspageFallratealertNotifyAtbelowBtn;
	}
	public QAFWebElement getNFKiosAlertspageFallratealertSoundfield() {
		return NFKiosAlertspageFallratealertSoundfield;
	}
	public QAFWebElement getNFKiosAlertspageFallratealertHintTxt() {
		return NFKiosAlertspageFallratealertHintTxt;
	}
	public QAFWebElement getNFKiosAlertspageFallratealertBackBtn() {
		return NFKiosAlertspageFallratealertBackBtn;
	}
	//Rise Rate Alert
	public QAFWebElement getNFKiosAlertspageRiseratealertTxt() {
		return NFKiosAlertspageRiseratealertTxt;
	}
	public QAFWebElement getNFKiosAlertspageRiseratealertNotifyAtaboveBtn() {
		return NFKiosAlertspageRiseratealertNotifyAtaboveBtn;
	}
	public QAFWebElement getNFKiosAlertspageRiseratealertSoundfield() {
		return NFKiosAlertspageRiseratealertSoundfield;
	}
	public QAFWebElement getNFKiosAlertspageRiseratealertHintTxt() {
		return NFKiosAlertspageRiseratealertHintTxt;
	}
	public QAFWebElement getNFKiosAlertspageRiseratealertBackBtn() {
		return NFKiosAlertspageRiseratealertBackBtn;
	}
	//Signal loss
		public QAFWebElement getNFKiosAlertspageSignallossBackBtn() {
			return NFKiosAlertspageSignallossBackBtn;
		}
		public QAFWebElement getNFKiosAlertspageSignallossTxt() {
			return NFKiosAlertspageSignallossTxt;
		}
		public QAFWebElement getNFKiosAlertspageSignallossFormorethan() {
			return NFKiosAlertspageSignallossFormorethan;
		}
		public QAFWebElement getNFKiosAlertspageSignallossSoundfield() {
			return NFKiosAlertspageSignallossSoundfield;
		}
		public QAFWebElement getNFKiosAlertspageSignallossHintTxt() {
			return NFKiosAlertspageSignallossHintTxt;
		}
		
		//no reading
		public QAFWebElement getNFKiosAlertspageNoreadingBackBtn() {
			return NFKiosAlertspageNoreadingBackBtn;
		}
		public QAFWebElement getNFKiosAlertspageNoreadingTxt() {
			return NFKiosAlertspageNoreadingTxt;
		}
	    public QAFWebElement getNFKiosAlertspageNoreadingField(){
		     return NFKiosAlertspageNoreadingField;
		}
		public QAFWebElement getNFKiosAlertspageNoreadingSoundfield(){
		   return NFKiosAlertspageNoreadingSoundfield;
		}
		public QAFWebElement getNFKiosAlertspageNoreadingHintTxt(){
		   return NFKiosAlertspageNoreadingHintTxt; 
		}
		public QAFWebElement getNFKiosAlertspagealarmtxt() {
			return NFKiosAlertspagealarmtxt;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmlbl() {
			return NFKiosAlertspageurgentlowalarmlbl;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowsoonalarmlbl() {
			return NFKiosAlertspageurgentlowsoonalarmlbl;
		}
	
		public QAFWebElement getNFKiosAlertspageurgentlowalarmtitle() {
			return NFKiosAlertspageurgentlowalarmtitle;
		}
		
		public QAFWebElement getNFKiosAlertspagenotifymebelowtxt() {
			return NFKiosAlertspagenotifymebelowtxt;
		}
		
		public QAFWebElement getNFKiosAlertspagerepeatTxt() {
			return NFKiosAlertspagerepeatTxt;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmbackbtnurgentlow() {
			return NFKiosAlertspageurgentlowalarmbackbtnurgentlow;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmbackbtnurgentlowsoon() {
			return NFKiosAlertspageurgentlowalarmbackbtnurgentlowsoon;
		}
		
		public QAFWebElement getNFKiosAlertspagebackbtn() {
			return NFKiosAlertspagebackbtn;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmrepeathinttxt() {
			 return NFKiosAlertspageurgentlowalarmrepeathinttxt;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmsoundlbl() {
			return NFKiosAlertspageurgentlowalarmsoundlbl;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmvibrationlbl() {
			return NFKiosAlertspageurgentlowalarmvibrationlbl;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmurgentlowhintlbl() {
			return NFKiosAlertspageurgentlowalarmurgentlowhintlbl;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmsoundtitle() {
			return NFKiosAlertspageurgentlowalarmsoundtitle;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmvibrationtitle() {
			return NFKiosAlertspageurgentlowalarmvibrationtitle;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowsoonalarmtitle() {
			return NFKiosAlertspageurgentlowsoonalarmtitle;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowsoonalarmrepreat() {
			return NFKiosAlertspageurgentlowsoonalarmrepreat;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowsoonalarmsoundlbl() {
			return NFKiosAlertspageurgentlowsoonalarmsoundlbl;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowsoonalarmvibrationlbl() {
			return NFKiosAlertspageurgentlowsoonalarmvibrationlbl;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowsoonalarmrepeathinttxt() {
			return NFKiosAlertspageurgentlowsoonalarmrepeathinttxt;
		}
		
		public QAFWebElement getNFKiosAlertspageurgentlowalarmurgentlowselect() {
			return NFKiosAlertspageurgentlowalarmurgentlowselect;
		}
		
		public QAFWebElement getNFKiosAlertspageUrgentLowBackBtn() {
			return NFKiosAlertspageUrgentLowBackBtn;
		}
		
		public QAFWebElement getNFKiosAlertspageUrgentlowsoonBackBtn() {
			return NFKiosAlertspageUrgentlowsoonBackBtn;
		}
		public List<QAFWebElement> getNFKiosAlertspageUrgentlowElementsSoundvibration() {
			return NFKiosAlertspageUrgentlowElementsSoundvibration;
	    	}
		
		public QAFWebElement getNFKiosAlertspageUrgentlowCheckmark() {
			return NFKiosAlertspageUrgentlowCheckmark;
		}
		
		
		public void verifyAlertScreen() {
			getNFKiosAlertspagealarmtxt().waitForPresent();
			getNFKiosAlertspagealarmtxt().verifyPresent(LFSUtilsIOS.getPropString("alerts.alarmsSettings.Description"));
			getNFKiosAlertspageurgentlowalarmlbl().verifyPresent("Urgent Low Alarm");
			getNFKiosAlertspageurgentlowsoonalarmlbl().verifyPresent("Urgent Low Soon Alarm");
			Reporter.logWithScreenShot("User verified the Alert screen", MessageTypes.Pass);
		}
			

		public void clickOnUrgentAlarmAndVerify(String option) {
			option = option.toUpperCase();
			switch(option) {
			case "URGENT LOW ALARM":
				verifyUrgenLowAlarmScreen();
				Reporter.logWithScreenShot("User verified the Urgent Low Alarm screen",MessageTypes.Pass);
				break;
			case "URGENT LOW SOON":
				clickUrgentLowSoon();
				verifyUrgenLowSoonAlarmScreen();
				Reporter.logWithScreenShot("User verified the Urgent Low Soon Alarm screen",MessageTypes.Pass);
				break;
			}
				    
		}

		public void verifyUrgenLowAlarmScreen() {
			getNFKiosAlertspageurgentlowalarmlbl().click();
			getNFKiosAlertspageurgentlowalarmtitle().verifyPresent("Urgent Low Alarm");
		    Assert.assertTrue(getNFKiosAlertspagenotifymebelowtxt().getAttribute("visible").
		    		equals("true"),"Notify Me at below");
			Assert.assertTrue(getNFKiosAlertspagerepeatTxt().getAttribute("visible").equals("true"),"Repeat");
			getNFKiosAlertspageurgentlowalarmbackbtnurgentlow().verifyPresent("Back");
			getNFKiosAlertspageurgentlowalarmrepeathinttxt().verifyPresent();
			getNFKiosAlertspageurgentlowalarmsoundlbl().verifyPresent("Sound");
//			getNFKiosAlertspageurgentlowalarmvibrationlbl().verifyPresent("Vibration");
			getNFKiosAlertspageurgentlowalarmurgentlowhintlbl().verifyPresent();
		}
		
		public void verifyUrgenLowSoonAlarmScreen() {	
			getNFKiosAlertspageurgentlowsoonalarmtitle().verifyPresent("Urgent Low Soon Alarm");
			getNFKiosAlertspageurgentlowsoonalarmrepreat().verifyPresent("Repeat Every (min.)");
			getNFKiosAlertspageurgentlowsoonalarmsoundlbl().verifyPresent("Sound");
//			getNFKiosAlertspageurgentlowsoonalarmvibrationlbl().verifyPresent("Vibration");
			getNFKiosAlertspageurgentlowsoonalarmrepeathinttxt().verifyPresent();
		}
		
		private void clickUrgentLowSoon() {
			getNFKiosAlertspageurgentlowsoonalarmlbl().waitForPresent();
			getNFKiosAlertspageurgentlowsoonalarmlbl().click();
			
		}
		public void clickOnSoundAndVibrationUrgentLowAlarm(String str) {
			try {
				if(getNFKiosAlertspageurgentlowalarmtitle().isPresent()) {
					getNFKiosAlertspageurgentlowalarmsoundlbl().click();
					Reporter.logWithScreenShot("Sound screen of Urgent Low",MessageTypes.Pass);
					soundVibration(str);
					getNFKiosAlertspagebackbtn().click();
					LFSUtilsIOS.pause(2000);
					getNFKiosAlertspageurgentlowalarmvibrationlbl().click();
					Reporter.logWithScreenShot("Vibration screen",MessageTypes.Pass);
					LFSUtilsIOS.pause(1000);
					soundVibration(str);
					getNFKiosAlertspagebackbtn().click();
					LFSUtilsIOS.pause(2000);
				}
				else {
					LFSUtilsIOS.waitforLoad();
					getNFKiosAlertspageurgentlowsoonalarmsoundlbl().isPresent();
					getNFKiosAlertspageurgentlowsoonalarmsoundlbl().click();
					Reporter.logWithScreenShot("Sound screen of Urgent Low Soon ",MessageTypes.Pass);
					soundVibration(str);
					getNFKiosAlertspagebackbtn().click();
					LFSUtilsIOS.waitforLoad();
					getNFKiosAlertspageurgentlowsoonalarmvibrationlbl().click();
					Reporter.logWithScreenShot("Vibration screen of Urgent Low soon",MessageTypes.Pass);
					soundVibration(str);
					getNFKiosAlertspagebackbtn().click();
					LFSUtilsIOS.waitforLoad();
				}
			} catch (Exception e) {	
				e.printStackTrace();
			}
		}
		
		
		public void soundVibration(String str1)
		{
			List<QAFWebElement> list=getNFKiosAlertspageUrgentlowElementsSoundvibration();
	           String []linkText =new String[list.size()];
	           int i=0;
	           for(QAFWebElement a: list)
	           {
	              linkText[i]=a.getText().toUpperCase();
	              String str=str1.toUpperCase();
	            if((linkText[i]).equals(str))
	             {
	            	 //check the checkmark is present or not
	            	getNFKiosAlertspageUrgentlowCheckmark().isPresent();
	         	   Reporter.logWithScreenShot("User verified the default value selected ",MessageTypes.Pass);
	            }  
	              i++;
	           }		
		}		
		
		
		public void verifySoundVibrationScreen(String option) {
			switch(option) {
			case "Urgent Low":
				clickOnSoundAndVibrationUrgentLowAlarm(option);	
				LFSUtilsIOS.waitforLoad();
				Reporter.logWithScreenShot("User verified the Urgent low's Sound and vibration screen", MessageTypes.Pass);
				break;
				
			case "Urgent Low Soon":			
				clickOnSoundAndVibrationUrgentLowAlarm(option);	
				LFSUtilsIOS.pause(2000);
				Reporter.logWithScreenShot("User verified Urgent low Soon's Sound and Vibration screen", MessageTypes.Pass);
				break;
			}
		}
		public void clickAlertBackbutton() {
			if(getNFKiosAlertspageUrgentLowBackBtn().isPresent())
			{	
				getNFKiosAlertspageUrgentLowBackBtn().waitForPresent();
				  getNFKiosAlertspageUrgentLowBackBtn().click();
			}
			else {
				getNFKiosAlertspageUrgentlowsoonBackBtn().waitForPresent();
				getNFKiosAlertspageUrgentlowsoonBackBtn().click();
			}
			Reporter.logWithScreenShot("User clicked on Back button", MessageTypes.Pass);
			
		}
		
		public void clickVerifyScreen(String Option) {
			 switch (Option) {
             case "LOW":
          	   clikLowAlert();
          	   verifyLowScreen();
                 break;
             case "HIGH":
            	   clikHighAlert();
            	   verifyHighScreen();
                   break;
             case "FALLRATE":
          	   clikFallRateAlert();
          	   verifyFallRateScreen();
                 break;
             case "RISERATE":
          	   clikRiseRateAlert();
          	   verifyRiseRateScreen();
                 break;
             case "SIGNALLOSS":
            	 clickSignalLoss();
          	     verifySignalLossScreen();               	 
                 break;
             case "NOREADINGS":
            	 clickNoReadings();
          	      verifyNoReadings();
                 break;
              }
			Reporter.logWithScreenShot("User has verified the "+Option+" screen",MessageTypes.Pass);
		}
		
		private void verifyNoReadings() {
			sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("noreading.title")).
			assertPresent("Title No Readings alert");
			getNFKiosAlertspageFallratealertBackBtn().isPresent();
			Assert.assertEquals(getNFKiosAlertspageLowalertField().getAttribute("value"),
					LFSUtilsIOS.getPropString("noreading.title"));
			getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("1");
			Assert.assertEquals(getNFKiosAlertspageNoreadingSoundfield().getAttribute("value"),
					LFSUtilsIOS.getPropString("noreading.sound"));
			Assert.assertEquals(getNFKiosAlertspageNoreadingHintTxt().getText(),
					LFSUtilsIOS.getPropString("noreading.hint"));
			
		}
		private void clickNoReadings() {
			   getNFKiosAlertspageNoreadingTxt().waitForPresent();
			   Reporter.logWithScreenShot("Get attribute value is "+getNFKiosAlertspageNoreadingTxt().
					   getAttribute("value")+" displayed", MessageTypes.Pass);
				Assert.assertTrue(getNFKiosAlertspageNoreadingTxt().getAttribute("value").equals("On"));	
				getNFKiosAlertspageNoreadingTxt().click();
			     LFSUtilsIOS.waitforLoad();	
		}
		
		private void verifySignalLossScreen() {
			sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("signalloss.title")).
			assertPresent("Title Signal Loss alert");
			getNFKiosAlertspageFallratealertBackBtn().isPresent();
			Assert.assertEquals(getNFKiosAlertspageLowalertField().getAttribute("value"),
					LFSUtilsIOS.getPropString("signalloss.title"));
			getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("1");
			Assert.assertEquals(getNFKiosAlertspageSignallossFormorethan().getAttribute("label"),
					LFSUtilsIOS.getPropString("formore.than"));
			Assert.assertEquals(getNFKiosAlertspageSignallossSoundfield().getAttribute("value"),
					LFSUtilsIOS.getPropString("signalloss.sound"));
			Assert.assertEquals(getNFKiosAlertspageSignallossFormorethan().getAttribute("value"),
					LFSUtilsIOS.getPropString("signalloss.formore.than.val"));
			Assert.assertEquals(getNFKiosAlertspageSignallossHintTxt().getText(),
					  LFSUtilsIOS.getPropString("signal.loss.hint"));	
			
		}
		private void clickSignalLoss() {
			   getNFKiosAlertspageSignallossTxt().waitForPresent();
			   Reporter.logWithScreenShot("Get attribute value is "+getNFKiosAlertspageSignallossTxt().getAttribute("value")+" displayed", MessageTypes.Pass);
				Assert.assertTrue(getNFKiosAlertspageSignallossTxt().getAttribute("value").equals("On"));	
				getNFKiosAlertspageSignallossTxt().click();
			     LFSUtilsIOS.waitforLoad();
		}
		
		private void verifyRiseRateScreen() {
			sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("rise.rate")).
			assertPresent("Title Rise Rate alert");
			getNFKiosAlertspageRiseratealertBackBtn().isPresent();
		Assert.assertEquals(getNFKiosAlertspageLowalertField().getAttribute("value"),
				LFSUtilsIOS.getPropString("rise.rate"));
		getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("0");
		
		Assert.assertEquals(getNFKiosAlertspageRiseratealertNotifyAtaboveBtn().getAttribute("label"),
				LFSUtilsIOS.getPropString("notify.me.at.txt"));
		Assert.assertEquals(getNFKiosAlertspageRiseratealertSoundfield().getText(),
				LFSUtilsIOS.getPropString("rise.sound"));
		Assert.assertEquals(getNFKiosAlertspageRiseratealertNotifyAtaboveBtn().getAttribute("value").replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
				LFSUtilsIOS.getPropString("notify.me.at"));
		Assert.assertEquals(getNFKiosAlertspageRiseratealertHintTxt().getText(),
				LFSUtilsIOS.getPropString("rise.rate.hint"));
				
		}
		private void clikRiseRateAlert() {
			getNFKiosAlertspageRiseratealertTxt().waitForPresent();
				Assert.assertTrue(getNFKiosAlertspageRiseratealertTxt().getAttribute("value").equals("Off"));	
				getNFKiosAlertspageRiseratealertTxt().click();
			     LFSUtilsIOS.waitforLoad();
		}
		
		private void verifyFallRateScreen() {
			sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("fall.rate")).
			assertPresent("Title Fall Rate alert");
			getNFKiosAlertspageFallratealertBackBtn().isPresent();
		Assert.assertEquals(getNFKiosAlertspageLowalertField().getAttribute("value"),
				LFSUtilsIOS.getPropString("fall.rate"));
		getNFKiosAlertspageSwitchBtn().getAttribute("value").equals("0");
		Assert.assertEquals(getNFKiosAlertspageFallratealertNotifyAtbelowBtn().getAttribute("label"),
				LFSUtilsIOS.getPropString("notify.me.at.txt"));
		Assert.assertEquals(getNFKiosAlertspageFallratealertSoundfield().getText(),
				LFSUtilsIOS.getPropString("fall.sound"));
		Assert.assertEquals(getNFKiosAlertspageFallratealertNotifyAtbelowBtn().getAttribute("value").replaceAll("[^\\d]", " ").replaceAll("\\s", ""),
				LFSUtilsIOS.getPropString("notify.me.at"));	
		
		}
		
		private void clikFallRateAlert() {
			   getNFKiosAlertspageFallratealertTxt().waitForPresent();
			   Reporter.logWithScreenShot("Get attribute value is "+getNFKiosAlertspageFallratealertTxt().getAttribute("value")+" displayed", MessageTypes.Pass);
				Assert.assertTrue(getNFKiosAlertspageFallratealertTxt().getAttribute("value").equals("Off"));	
				getNFKiosAlertspageFallratealertTxt().click();
			     LFSUtilsIOS.waitforLoad();
	}
		
		public void updatePickervalue(String option) {
			switch (option) {
            case "LOW":
            	updateNotifyBelow();
            	updateRepeatValue();
            	clickOnSound();	
                break;
            case "HIGH":
            	updateNotifyAbove();
            	updateRepeatValue();
            	clickOnSound();
                break;
            case "FALLRATE":
            	updateFallNotifyMeAT();
            	clickOnSound();
                break;
            case "RISERATE":
            	updateRiseNotifyMeAT();
            	clickOnSound();
                break;
            case "SIGNALLOSS":
            	updateSignalLossValue();
            	clickOnSound();
                break;
            case "NOREADINGS":
            	clickOnSound();
                break;
             }	
			Reporter.logWithScreenShot("User has updated the picker values",MessageTypes.Pass);
		}
		
		private void updateSignalLossValue() {
			getNFKiosAlertspageSwitchBtn().getText().equals("0");	
			 String hrs =String.valueOf(ThreadLocalRandom.current().nextInt(0,4));	  
			 String min= String.valueOf((ThreadLocalRandom.current().nextInt(2, 55) + 4) / 5 * 5);
			 ConfigurationManager.getBundle().setProperty("formorethan.hrs",hrs);
			 ConfigurationManager.getBundle().setProperty("formorethan.min",min);
			 getNFKiosAlertspageSignallossFormorethan().click();
				int mint=20;
				int raandommin=Integer.parseInt(min);
		   if((hrs.equals("0"))&& raandommin<=mint) {
		       Reporter.log("The value of minute is less than 20");
		   }
		   else if((hrs.equals("0"))&& raandommin>=mint) {
			   getNFKiosAlertspagePickerMinBtn().sendKeys(min);
		   }
		   else {
			   while(!(getNFKiosAlertspagePickerBtn().getText().equals(hrs))){
				  getNFKiosAlertspagePickerBtn().sendKeys(hrs);
			   }
           	while(!(getNFKiosAlertspagePickerMinBtn().getText().equals(min))){
           		  getNFKiosAlertspagePickerMinBtn().sendKeys(min);
		        }        
	         getNFKiosAlertspagePickerDoneBtn().click();
		   }
		   getNFKiosAlertspageSwitchBtn().click();		
		}
		
		private void updateRiseNotifyMeAT() {
			HashMap<Integer, String> map = new HashMap<Integer, String>();
			map.put(1,"2");
			map.put(2,"2.5");
			map.put(3,"3");
			map.put(4,"3.5");
			map.put(5,"4");
			int notifyval= ThreadLocalRandom.current().nextInt(1,4+1);
			String valueaboveme=map.get(notifyval);
		 	ConfigurationManager.getBundle().setProperty("riserate.value",valueaboveme);
		 	getNFKiosAlertspageRiseratealertNotifyAtaboveBtn().click();
		    getNFKiosAlertspagePickerBtn().sendKeys(valueaboveme);
			getNFKiosAlertspagePickerDoneBtn().click();	
			getNFKiosAlertspageSwitchBtn().click();
		}
		
		private void updateFallNotifyMeAT() {
			HashMap<Integer, String> map = new HashMap<Integer, String>();
			map.put(1,"2");
			map.put(2,"2.5");
			map.put(3,"3");
			map.put(4,"3.5");
			map.put(5,"4");
			int notifyval= ThreadLocalRandom.current().nextInt(1,4+1);
			String valueaboveme=map.get(notifyval);
		 	ConfigurationManager.getBundle().setProperty("fallrate.value",valueaboveme);
		 	getNFKiosAlertspageFallratealertNotifyAtbelowBtn().click();
		 getNFKiosAlertspagePickerBtn().sendKeys(valueaboveme);
			getNFKiosAlertspagePickerDoneBtn().click();
		getNFKiosAlertspageSwitchBtn().click();
		}
		
		public void verifyUpdatedPickervalue(String option) {
			switch (option) {
            case "LOW":
            	verifyUpdatedLowPickervalue();
                break;
            case "HIGH":
            	verifyUpdatedHighPickervalue();
                break;
            case "FALLRATE":
            	verifyUpdatedFallNotifyMeAtValue();
                break;
            case "RISERATE":
            	verifyUpdatedRiseNotifyMeAtValue();
            	break;
            case "SIGNALLOSS":
            	verifyUpdatedSignalLossValue();
            	break;
             }	
			Reporter.logWithScreenShot("Verified the "+option+" picker values",MessageTypes.Pass);
		}
		
		private void verifyUpdatedSignalLossValue() {
			getNFKiosAlertspageSwitchBtn().getText().equals("1");
			String tmin="20min";
			String gethrs=(String)ConfigurationManager.getBundle().getProperty("formorethan.hrs");
		String moremin=(String) ConfigurationManager.getBundle().getProperty("formorethan.min");
		String timehrs=gethrs.concat("hours");
		String timeonehr=gethrs.concat("hour");
		String timemin=moremin.concat("min");
		String formorethanval=timehrs+timemin;
		String timeone=timeonehr+timemin;
		int getmin=Integer.parseInt(moremin),mintw=20;
			 if((gethrs.equals("0")) && getmin<=mintw) {
				LFSUtilsIOS.findText(
						tmin);
			   }
			 else if((gethrs.equals("0"))&&(getmin>20)){
				 LFSUtilsIOS.findText(
						 tmin);
			 }
			 else if(gethrs.equals("1")) {
				 LFSUtilsIOS.findText(timeone);
			 }
			 else
			 {
				 LFSUtilsIOS.findText(
						 formorethanval);
			 }
			
		}
		private void verifyUpdatedRiseNotifyMeAtValue() {
			getNFKiosAlertspageSwitchBtn().getText().equals("1");
			String getfallvalue=(String) ConfigurationManager.getBundle().getProperty("riserate.value");
			LFSUtilsIOS.findText(getfallvalue);
			LFSUtilsIOS.waitforLoad();
			
		}
		
		private void verifyUpdatedFallNotifyMeAtValue() {
			getNFKiosAlertspageSwitchBtn().getText().equals("1");
			String getfallval=(String)ConfigurationManager.getBundle().getPropertyValue("fallrate.value");
			LFSUtilsIOS.findText(
					getfallval);
			LFSUtilsIOS.waitforLoad();
		}
		
		private void verifyHighScreen() {
			sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("high.alert.title")).assertPresent("Title High alert");
			getNFKiosAlertspageHighalertBackBtn().isPresent();
		Assert.assertEquals(getNFKiosAlertspageLowalertField().getText(),LFSUtilsIOS.getPropString("high.alert.title"));
		Assert.assertEquals(getNFKiosAlertspageHighalertNotifyMeaboveBtn().getAttribute("label"),LFSUtilsIOS.getPropString("high.notify.above"));
		Assert.assertEquals(getNFKiosAlertspageHighalertRepeatfield().getAttribute("label"),LFSUtilsIOS.getPropString("alerts.repeat"));
		  Assert.assertEquals(getNFKiosAlertspageHighalertSoundfield().getAttribute("label"),LFSUtilsIOS.getPropString("alerts.sound.option"));
		  Assert.assertEquals(getNFKiosAlertspageHighalertRepeatfield().getAttribute("value"),LFSUtilsIOS.getPropString("reminder.types.never"));
		  Assert.assertEquals(getNFKiosAlertspageHighalertSoundfield().getAttribute("value"),
				  LFSUtilsIOS.getPropString("high.sound"));	
		  Assert.assertEquals(getNFKiosAlertspageHighalertHintTxt().getText(),
				  LFSUtilsIOS.getPropString("high.hint.text"));	 
		}
		
		private void clikHighAlert() {
	      getNFKiosAlertspageHighalertTxt().waitForPresent();
			String str = getNFKiosAlertspageHighalertTxt().getText().replaceAll("[^\\d]", " ");
			Assert.assertEquals(str.replaceAll("\\s", ""),
					LFSUtilsIOS.getPropString("high.value"));
		     getNFKiosAlertspageHighalertTxt().click();
				LFSUtilsIOS.waitforLoad();
			
		}
		SignupPageIOS sign= new SignupPageIOS();
		
		private void verifyLowScreen() {	
			sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("low.alert.title")).assertPresent("Title Low alert");
			getNFKiosAlertspageLowalertBackBtn().isPresent();
			Assert.assertEquals(getNFKiosAlertspageLowalertField().getText(),LFSUtilsIOS.getPropString("low.alert.title"));
			Assert.assertEquals(getNFKiosAlertspageLowalertNotifyMebelowBtn().getAttribute("label"),LFSUtilsIOS.getPropString("low.notify.below"));
			Assert.assertEquals(getNFKiosAlertspageLowalertRepeatfield().getAttribute("label"),LFSUtilsIOS.getPropString("alerts.repeat"));
			Assert.assertEquals(getNFKiosAlertspageLowalertSoundfield().getAttribute("label"),LFSUtilsIOS.getPropString("alerts.sound.option"));
			Assert.assertEquals(getNFKiosAlertspageLowalertHintTxt().getText(),
					LFSUtilsIOS.getPropString("low.hint.text"));
			Reporter.logWithScreenShot("Low value is "+getNFKiosAlertspageLowalertNotifyMebelowBtn().getAttribute("value")+" present",
					MessageTypes.Pass);	
			Assert.assertEquals(getNFKiosAlertspageLowalertRepeatfield().getAttribute("value"),LFSUtilsIOS.getPropString("reminder.types.never"));
		  Assert.assertEquals(getNFKiosAlertspageLowalertSoundfield().getAttribute("value"),
				  LFSUtilsIOS.getPropString("low.sound")); 
		}
		
		private void clikLowAlert() {
			getNFKiosAlertspageLowalertTxt().waitForPresent();
			String str = getNFKiosAlertspageLowalertTxt().getText().replaceAll("[^\\d]", " ");
			Assert.assertEquals(str.replaceAll("\\s", ""),
					LFSUtilsIOS.getPropString("low.value"));
			getNFKiosAlertspageLowalertTxt().click();	
			LFSUtilsIOS.waitforLoad();
					
		}
		
		private void verifyUpdatedHighPickervalue() {
			//String str = getNFKiosAlertspageHighalertNotifyMeaboveBtn().getAttribute("value").replaceAll("[^\\d]", " ");
			  String getmin= ConfigurationManager.getBundle().getPropertyValue("repeat.min");
			  String gethrs= ConfigurationManager.getBundle().getPropertyValue("repeat.hrs");
           String time=gethrs+getmin;
           LFSUtilsIOS.findText((ConfigurationManager.getBundle().getProperty("notify.above")).toString());
			if(gethrs.equals("0")) {
				LFSUtilsIOS.findText(
						getmin);	
			}else if(gethrs.equals("4")) {
				LFSUtilsIOS.findText(gethrs);
			}
			else {
				LFSUtilsIOS.findText(time);	
			}
		}
		
		private void clickOnSound() {
			sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.sound.option")).click();
			SignupPageIOS sign= new SignupPageIOS();
			sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.sound.option")).
			  assertPresent("Sound Screen");
			getNFKiosAlertspagebackbtn().click();	
		}
		
		private void updateNotifyAbove() {
			LFSUtilsIOS.waitforLoad();
			String aboveval=String.valueOf(ThreadLocalRandom.current().nextInt(120, 300 + 1));
			ConfigurationManager.getBundle().setProperty("notify.above",aboveval);
			getNFKiosAlertspageHighalertNotifyMeaboveBtn().click();
			getNFKiosAlertspagePickerBtn().sendKeys(aboveval);
			getNFKiosAlertspagePickerDoneBtn().click();	
			
		}
		
		private void updateRepeatValue() {
			// convert to nearest multiple of 5	
			String min = String.valueOf((ThreadLocalRandom.current().nextInt(2, 55) + 4) / 5 * 5);                       
			String hrs=String.valueOf(ThreadLocalRandom.current().nextInt(0, 4+ 1));
			ConfigurationManager.getBundle().setProperty("repeat.min",min);
			ConfigurationManager.getBundle().setProperty("repeat.hrs",hrs);
			sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("alerts.repeat")).click();
			getNFKiosAlertspagePickerBtn().sendKeys(hrs);
			LFSUtilsIOS.waitforLoad();
			if(hrs.equals("4")) {
				getNFKiosAlertspagePickerMinBtn().sendKeys("0");
			}
			else {
			    getNFKiosAlertspagePickerMinBtn().sendKeys(min);	
			}
			getNFKiosAlertspagePickerDoneBtn().click();	
		}
		
		private void updateNotifyBelow() {
			LFSUtilsIOS.waitforLoad();
			String belowval=String.valueOf(ThreadLocalRandom.current().nextInt(60, 100 + 1));
			ConfigurationManager.getBundle().setProperty("notify.below",belowval);
			getNFKiosAlertspageLowalertNotifyMebelowBtn().click();
			getNFKiosAlertspagePickerBtn().sendKeys(belowval);
			getNFKiosAlertspagePickerDoneBtn().click();	
		}
		
		public void verifyUpdatedLowPickervalue() {
			LFSUtilsIOS.waitforLoad();			
			String getmin= ConfigurationManager.getBundle().getPropertyValue("repeat.min");
			  String gethrs= ConfigurationManager.getBundle().getPropertyValue("repeat.hrs");
             String time=gethrs+getmin;
		if(gethrs.equals("0")) {
			LFSUtilsIOS.findText(getmin);
		}
		else if(gethrs.equals("4")) {
			LFSUtilsIOS.findText(gethrs);
		  }
		  else {
			  LFSUtilsIOS.findText(time);
		  }
		}
		
		public void enableAlertSchedule() {
			LFSUtilsIOS.swipeWithScreenPercent(50,70,50,40,1);
			LFSUtilsIOS.swipeWithScreenPercent(50,70,50,40,1);
			try {
			getNFKiosAlertspageAlertscSwitchBtn().get(1).waitForPresent(10);
			getNFKiosAlertspageAlertscSwitchBtn().get(1).assertPresent("Switch button");
			getNFKiosAlertspageAlertscSwitchBtn().get(1).click();
			getNFKiosAlertspageAlertscSwitchBtn().get(1).isEnabled();}
			catch (Exception e) {
				e.printStackTrace();
			}
			LFSUtilsIOS.pause(100);
		}
		public void verifyNameField() {
			getNFKiosAlertspageScheduleNameField().waitForPresent();
			getNFKiosAlertspageScheduleNameField().assertPresent("Schedule name field");
			Reporter.logWithScreenShot("Schedule name field",MessageTypes.Pass);
		}
		public void clickScheduleName() {
			LFSUtilsIOS.waitforLoad();
		   getNFKiosAlertspageScheduleNameField().click();	
		   getNFKiosEditschedulepageTitle().waitForPresent();
		Assert.assertEquals(getNFKiosEditschedulepageTitle().getText(),
				LFSUtilsIOS.getPropString("edit.schedule.title"));
		Reporter.logWithScreenShot("Edit Schedule screen display",MessageTypes.Pass);
		}
		
			
	
		public void clickUserAlertSchedule(String Option) {
			 switch (Option) {
            case "low":
         	   clikUserLowAlert();
         	   verifyLowScreen();
                break;
            case "high":
           	   clikUserHighAlert();
           	   verifyHighScreen();
                  break;
            case "fallrate":
         	   clikUserFallRateAlert();
         	   verifyFallRateScreen();
                break;
            case "riserate":
         	   clikUserRiseRateAlert();
         	   verifyRiseRateScreen();
                break;
            case "Urgent Low Soon":
            	clikUserUrgentLowSoon();
            	verifyUrgenLowSoonAlarmScreen();
                 break;   
                
             }
			Reporter.logWithScreenShot("User has verified the "+Option+" screen",MessageTypes.Pass);
		}
		private void clikUserUrgentLowSoon() {
			getNFKiosEditschedulepageUrgentlblLabel().waitForPresent();
			Assert.assertTrue(getNFKiosEditschedulepageUrgentlblLabel().getAttribute("value").equals("On"));	
			getNFKiosEditschedulepageUrgentlblLabel().click();
		     LFSUtilsIOS.waitforLoad();
			
		}
		private void clikUserRiseRateAlert() {
			getNFKiosEditschedulepageRiserateLabel().waitForPresent();
			Assert.assertTrue(getNFKiosEditschedulepageRiserateLabel().getAttribute("value").equals("Off"));	
			getNFKiosEditschedulepageRiserateLabel().click();
		     LFSUtilsIOS.waitforLoad();
			
		}
		private void clikUserFallRateAlert() {
			  getNFKiosEditschedulepageFallrateLabel().waitForPresent();
			   Reporter.logWithScreenShot("Get attribute value is "+getNFKiosEditschedulepageFallrateLabel().getAttribute("value")+" displayed", MessageTypes.Pass);
				Assert.assertTrue(getNFKiosEditschedulepageFallrateLabel().getAttribute("value").equals("Off"));	
				getNFKiosEditschedulepageFallrateLabel().click();
			     LFSUtilsIOS.waitforLoad();
			
		}
		private void clikUserHighAlert() {
			LFSUtilsIOS.swipeWithScreenPercent(50,70,50,40,1);
		      getNFKiosEditschedulepageHighLabel().waitForPresent();
				String str = getNFKiosEditschedulepageHighLabel().getText().replaceAll("[^\\d]", " ");
				Assert.assertEquals(str.replaceAll("\\s", ""),
						LFSUtilsIOS.getPropString("high.value"));
				getNFKiosEditschedulepageHighLabel().click();
					LFSUtilsIOS.waitforLoad();		
		}
		private void clikUserLowAlert() {
			getNFKiosEditschedulepageLowLabel().waitForPresent();
			String str = getNFKiosEditschedulepageLowLabel().getText().replaceAll("[^\\d]", " ");
			Assert.assertEquals(str.replaceAll("\\s", ""),
					LFSUtilsIOS.getPropString("low.value"));
			getNFKiosEditschedulepageLowLabel().click();	
			LFSUtilsIOS.waitforLoad();		
		}
		public void enterScheduleName() {
			LFSUtilsIOS.waitforLoad();
			String str="Theodara Crain";
			getNFKiosEditschedulepageSchdeuleName().sendKeys(str);
			ConfigurationManager.getBundle().setProperty("name.schedule", str);
			
		}
		public void verifyScheduleField(String option) {
			 switch (option) {
	            case "Canceling":
	            	getNFKiosEditschedulepageCancelBtn().click();
	            	verifyOnCancel();
	            	break;
	            case "Saving":
	            	getNFKiosEditschedulepageSaveBtn().click();
	            	verifyOnSaving();
	            	break;
	            
			
		  }
		}
			 public void verifyOnSaving() {
				 LFSUtilsIOS.swipeWithScreenPercent(50,70,50,40,1);
				 LFSUtilsIOS.swipeWithScreenPercent(50,70,50,40,1);
				 String str=(String) ConfigurationManager.getBundle().getPropertyValue("name.schedule");
				 Assert.assertEquals(getNFKiosAlertspageScheduleNameField().getText(),str);
					
		}
			public void verifyOnCancel() {
				LFSUtilsIOS.swipeWithScreenPercent(50,70,50,40,1);
				LFSUtilsIOS.swipeWithScreenPercent(50,70,50,40,1);
				LFSUtilsIOS.waitforLoad();
				Assert.assertEquals(getNFKiosAlertspageScheduleNameField().getText(),
						LFSUtilsIOS.getPropString("schedule.name"));	
				}
			public void clicksOnPicker(String option) {
				switch(option) {
				case "Start time":
	            	clickStartTime();
	            	verifyClock();
	            	verifyDefaultValue();
	            	getNFKiosEditschedulepageStarttimeLabel().click();
	            	updatePickerTime();
	            	String getval=	getNFKiosEditschedulepageStarttimeLabel().getAttribute("value").replaceAll(":","");
	            	verifyPickerSetTime(getval);
	            	break;
	            case "Stop time":
	            	clickStopTime();
	            	verifyClock();
	            	verifyDefaultStopTime();
	            	getNFKiosEditschedulepageStoptimeLabel().click();
	            	updatePickerTime();
	            	String getstoptime=	getNFKiosEditschedulepageStoptimeLabel().getAttribute("value").replaceAll(":","");	
	            	verifyPickerSetTime(getstoptime);
	            	break;
	            case "Week picker":
	            	clickWeekPicker();
	            	verifyWeekPage();
	            	verifyupdatedweekvalue();
	            	break;
				}
				
				
			}
			private void verifyupdatedweekvalue() {
				LFSUtilsIOS.waitforLoad();
				String getweekval=getNFKiosEditschedulepageWeekendLabel().getAttribute("value");
		    Reporter.logWithScreenShot(getweekval, MessageTypes.Pass);
			}
			
			private void verifyDefaultStopTime() {
				LFSUtilsIOS.findText(LFSUtilsIOS.getPropString("stop.time.default"));
				
			}
			
			private void verifyWeekPage() {
				getNFKiosEditschedulepageWeekBackBtn().isPresent();
				SignupPageIOS sign= new SignupPageIOS();
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("day.week.title"));
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("sun")).isPresent();
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("mon")).isPresent();
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("tue")).isPresent();
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("wed")).isPresent();
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("thu")).isPresent();
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("fri")).isPresent();
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("sat")).isPresent();
				//select the days
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("mon")).click();
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("fri")).click();
				sign.getNFKiosSignuppageStaticlabel(LFSUtilsIOS.getPropString("sat")).click();
				 
				getNFKiosEditschedulepageWeekBackBtn().click();
			}
			
			private void verifyPickerSetTime(String getval) {
			String gettime=ConfigurationManager.getBundle().getPropertyValue("picker.time");
			String starttime=gettime.replaceAll("[, ;]", "")+" PM";
			Assert.assertEquals(getval,starttime);
				
			}
			private void updatePickerTime() {
				 String randomhrs= String.valueOf(ThreadLocalRandom.current().nextInt(1,12));
				 String randommin = String.valueOf(ThreadLocalRandom.current().nextInt(5,55));
				 LFSUtilsIOS.waitforLoad();
				 try {
					 getNFKiosEditschedulepageHrsPkr().sendKeys(randomhrs);
					 LFSUtilsIOS.waitforLoad();
					 getNFKiosEditschedulepageMinutePkr().sendKeys(randommin);
					 LFSUtilsIOS.waitforLoad();
					 getNFKiosEditschedulepageAmPmPkr().sendKeys("PM");
				 }catch (Exception e) {
					Reporter.logWithScreenShot("User was unable to send the Time",MessageTypes.Fail);
					
				}
				 getNFKiosEditschedulepageDoneBtn().click();
				 String settime=(randomhrs+randommin);
				 ConfigurationManager.getBundle().setProperty("picker.time",(settime));
				
			}
			
			private void verifyDefaultValue() {
				Assert.assertEquals(
				getNFKiosEditschedulepageStarttimeLabel().getAttribute("value"),
				LFSUtilsIOS.getPropString("start.time.default.value"));				
			}
			
			private void verifyClock() {
			getNFKiosEditschedulepageDoneBtn().isPresent();
			getNFKiosEditschedulepageHrsPkr().isPresent();
			getNFKiosEditschedulepagePickerCancelBtn().click();
				
			}
			private void clickWeekPicker() {
				LFSUtilsIOS.waitforLoad();
				System.out.println("Week valueee  ------"+getNFKiosEditschedulepageDaysofweekField().getAttribute("value"));
	Assert.assertEquals(getNFKiosEditschedulepageDaysofweekField().getAttribute("value"),"All");
	getNFKiosEditschedulepageDaysofweekField().click();
				
			}
			private void clickStopTime() {
				LFSUtilsIOS.waitforLoad();
				getNFKiosEditschedulepageStoptimeLabel().click();
			
				
			}
			private void clickStartTime() {
				LFSUtilsIOS.waitforLoad();
				getNFKiosEditschedulepageStarttimeLabel().click();
			
				
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
				   LFSUtilsIOS.swipeWithScreenPercent(50, 70, 50, 40, 1);
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
				 clickNoReadings();
				 getNFKiosAlertspageSwitchBtn().click();
					LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
			}
			private void setSignalLossOFF() {
				clickSignalLoss();
				getNFKiosAlertspageSwitchBtn().click();
				LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
			}
			private void setRiseToOn() {
				  clikRiseRateAlert();
				  getNFKiosAlertspageSwitchBtn().click();
					LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
			}
			private void setHighValue() {
				  clikHighAlert();
				  updateNotifyAbove();
					LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
			}
			private void setFallRate() {
				clikFallRateAlert();
				getNFKiosAlertspageSwitchBtn().click();
				LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
			}
			private void setLowValue() {
				clikLowAlert();
				 updateNotifyBelow();
					LFSUtilsIOS.clickWithText(ConfigurationManager.getBundle().getString("common.backbuttontext"));
				
			}
			private void setUrgentLowSoonValue() {
				clickUrgentLowSoon();
				getNFKiosAlertspageSwitchBtn().click();
				clickAlertBackbutton();
				
			}
			public void getConfigurationSettinsg() {
				System.out.println("Urgent Low "+getNFKiosAlertspageurgentlowsoonalarmlbl().getText());
				System.out.println("Low");
				String str = getNFKiosAlertspageLowalertTxt().getText().replaceAll("[^\\d]", " ");
				Assert.assertEquals(str.replaceAll("\\s", ""),
						LFSUtilsIOS.getPropString("low.value"));
				
				System.out.println("Rise");
				Assert.assertTrue(getNFKiosAlertspageRiseratealertTxt().getAttribute("value").equals("Off"));	
				System.out.println("Fall");
				Assert.assertTrue(getNFKiosAlertspageFallratealertTxt().getAttribute("value").equals("Off"));	
				System.out.println("High");
				String str1 = getNFKiosAlertspageHighalertTxt().getText().replaceAll("[^\\d]", " ");
				Assert.assertEquals(str1.replaceAll("\\s", ""),
						LFSUtilsIOS.getPropString("high.value"));
				System.out.println("Signal");
				Assert.assertTrue(getNFKiosAlertspageSignallossTxt().getAttribute("value").equals("On"));	
				System.out.println("No reading");
				Assert.assertTrue(getNFKiosAlertspageNoreadingTxt().getAttribute("value").equals("On"));
					
			}
			public void clickResetAlerts() {
				 LFSUtilsIOS.swipeWithScreenPercent(50,70,50,40,1);
				 LFSUtilsIOS.swipeWithScreenPercent(50,70,50,40,1);
				 getNFKiosAlertspageResetBtn().click();
				 //Pop displayed
				 Reporter.logWithScreenShot("User has clicked on Reset Alert button on Alerts screen",MessageTypes.Pass);
				 getNFKiosAlertspageResetpopResetBtn().click();
				waitForPageToLoad();
				
			}
			public void verifyresetSeetings() {
			
				
			}
					
}
		




