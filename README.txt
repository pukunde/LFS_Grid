A.Import project from  bitbucket repository 
1.Repository URL: https://lfshelpdesk.com/bitbucket/scm/naao/norfolk_automate_test.git
1.Branch name:feature/5 

Steps to follow for Perfecto device:
========================================================================
From project Run config file : config\SensorPairing\sensorPairingPerfecto.xml


Physical devices execution on local machine:
=========================================================================

Pre-requisites 
---------------------------------------------------------
A.Winium configuration:

1.Download Winium.Desktop.Driver.zip from https://github.com/2gis/Winium.Desktop/releases
2.Extract zip file and open exe file

Points to note during execution:
1.Winium window should be opened during physical device execution
2.Windows Setting:Scale and Layout: 100% (to automate desktop app)

B.Appium configuration:
1.Install appium server on machine (1.20.2)

C.Android configuration
1.Recommended Android Device :Saumsung
2.Bluetooth setting should be ON 
3.Location setting should be ON 



Steps to follow for physical devices execution on local machine:
-----------------------------------------------------------------
1.Connect emulator 
2.Connect android mobile (Run command "adb devices" on command propt to make sure the device is connected)
3.Click on winium exe(This window should be opened during execution) and minimuze the window
4.Start appium server
3.From project Run config file : config\SensorPairing\sensorPairingPhysicalDevice.xml

Note: During execution only MoteConfig window should be opened (So that winium can perform required action on this desktop app(MoteConfig ) while running the script)
 