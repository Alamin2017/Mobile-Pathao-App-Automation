package testCases;
import EnvSetup.BaseEnv;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class test2 extends BaseEnv {

    @Test(priority = 3)
    public void test_tc_003() throws InterruptedException {
        Thread.sleep(2000);
        String text1=driver.findElement(By.id("com.pathao.user:id/tvChangeLanguage")).getText();
        Assert.assertEquals("You can change language later from settings",text1);
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void test_tc_004() throws InterruptedException {
        Thread.sleep(2000);
        boolean ivBanner=driver.findElement(By.id("com.pathao.user:id/ivBanner")).isDisplayed();
        System.out.println("ivBanner logo Exist:"+ivBanner);
        driver.findElement(By.id("com.pathao.user:id/btnStart")).click();
        Thread.sleep(2000);
    }

}
