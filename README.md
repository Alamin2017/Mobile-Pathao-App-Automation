# Pathao-App-Automation
What is Appium:

Appium is an open-source test automation framework for use with native, hybrid, and mobile web apps. It drives iOS, Android, and Windows apps using the WebDriver protocol.

Need to Install software for setting up Environment Appium with Java for Mobile Application Automation:

→JAVA JDK Latest versions like 8,11,17

→Android Studio Latest Version

→Appium Windows Server with Latest Release

→Nodejs Latest Version

Download and install Java (JDK) (https://www.oracle.com/in/java/technologies/downloads/#jdk17-windows) and set a path of JDK and bin folder with System variables:
→Go to the Environment variables and setup variable name, value, and path in the System Variables

Example: Variable name: JAVA_HOME and Variable value: C:\Program Files\Java\jdk-17 and Path : C:\Program Files\Java\jdk-17\bin.

->[Build Management Tool]-Download and Install Maven(https://maven.apache.org/download.cgi) and Configure it with System Variables and also include some paths in Path Variables.

Example: Variable name: Maven_Home and Variable value: C:\Program Files\Java\apache-maven-3.8.7 and Path : C:\Program Files\Java\apache-maven-3.8.7\bin

->[Build Management Tool]-Download and Install Gradle(https://gradle.org/releases/) and Configure it with System Variables and also include some paths in Path Variables.

Example: Variable name: Gradle_Home and Variable value: C:\Program Files\Java\gradle-7.6 and Path : C:\Program Files\Java\gradle-7.6\bin

Download and install Android Studio ( https://developer.android.com/studio?gclid=Cj0KCQiA8t2eBhDeARIsAAVEga1SBQMXg-rlpqz9RL7k_-Ip6a-_KEcFPmh2yPa3685chSPUdo2awMsaAuHtEALw_wcB&gclsrc=aw.ds) and Configure it with System Variables for Android SDK and also include some paths in Path Variables.
Example: Variable name: ANDROID_HOME and Variable value: C:\Users\amin.al\AppData\Local\Android\Sdk and Path : C:\Users\amin.al\AppData\Local\Android\Sdk\tools , C:\Users\amin.al\AppData\Local\Android\Sdk\emulator , C:\Users\amin.al\AppData\Local\Android\Sdk\platform-tools

Download and Install Nodejs (https://nodejs.org/en/download/), Configure it with System Variables, and include some Path Variables.
Example: Variable name: NODE_JS and Variable value: C:\Program Files\nodejs and Path : C:\Program Files\nodejs\node_modules , C:\Program Files\nodejs\node_modules\npm ,C:\Program Files\nodejs\node_modules\npm\bin.

Download and install Appium Windows Server like v1.21.0b from the GitHub link: https://github.com/appium/appium-desktop/releases/tag/v1.21.0 and Configure it System Variables in Path Variables.
Path: C:\Program Files\Appium\resources\app\node_modules

Open the Appium app and Go to the Edit Configurations and setup path for Android_HOME and JAVA_HOME

Download and Install IntelliJ IDEA(Community Edition) from https://www.jetbrains.com/idea/download/#section=windows

How to find out appPackage and appActivity:

1.open cmd and push "adb devices"

push "adb shell dumpsys window | find "mCurrentFocus" "
com.samsung.android.shealthmonitor/com.samsung.android.shealthmonitor.ui.activity.MainActivity

mobile_driver.terminateApp("com.samsung.android.shealthmonitor");->just close app after one test mobile_driver.removeApp("com.samsung.android.shealthmonitor");->uninstalled app after test mobile_driver.activateApp("com.samsung.android.shealthmonitor");-> just open app after installed app mobile_driver.installApp("C:\Users\amin.al\Desktop\certificate\Fake_Country_App_BP_ECG_IHRN_1.2.1.005.apk"); install app first time

Mobile Browser automate in Appium: https://stackoverflow.com/questions/52023111/no-chromedriver-found-that-can-automate-chrome-53-0-2785

Gradle_dependancy _workable for all:

testImplementation group: 'org.testng', name: 'testng', version: '7.4.0' implementation group: 'org.seleniumhq.selenium', name: 'selenium-server', version: '3.141.59' implementation group: 'io.appium', name: 'java-client', version: '7.6.0'

Need to certificate permissions:

https://sanaebadi97.medium.com/solve-the-certificate-error-in-android-studio-5773551e97f3

Go to C:\Program Files\Java\jdk-17\bin and open administrator cmd→run below commad

keytool -import -alias example -keystore "C:\Program Files\Java\jdk-17\lib\security\cacerts" -file C:\Users\amin.al\Desktop\certificate\siel.crt password :changeit

yes
