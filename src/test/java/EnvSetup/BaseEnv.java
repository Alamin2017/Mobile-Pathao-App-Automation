package EnvSetup;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import java.net.MalformedURLException;
import java.net.URL;
public class BaseEnv {
    public static AndroidDriver driver;
    @BeforeSuite
    public void installApp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities cap=new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy A90 5G");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.UDID, "RFCMB01Q39B");
        URL url=new URL("http://127.0.0.1:4723/wd/hub");
        driver=new AndroidDriver<MobileElement>(url,cap);
        driver.installApp("E:\\Soft\\Android_Studio\\pathao-8-8-1.apk");
        Thread.sleep(2000);
    }
    @BeforeClass
    public void openAppBeforeEveryClass() throws InterruptedException {
        Thread.sleep(2000);
        driver.activateApp("com.pathao.user");
        Thread.sleep(2000);
    }
    @AfterClass
    public void closeAppAfterEveryClass() throws InterruptedException {
        Thread.sleep(2000);
        driver.terminateApp("com.pathao.user");
        Thread.sleep(2000);
    }
    @AfterSuite
    public void uninstallApp() throws InterruptedException {
        Thread.sleep(2000);
        driver.removeApp("com.pathao.user");
        Thread.sleep(2000);
    }
}
