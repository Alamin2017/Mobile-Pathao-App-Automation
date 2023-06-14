package testCases;
import EnvSetup.BaseEnv;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class test extends BaseEnv {
    @Test(priority = 1)
    public void test_tc_001() throws InterruptedException {
        Thread.sleep(2000);
        boolean pathaoLogo =driver.findElement(By.id("com.pathao.user:id/ivLogo")).isDisplayed();
        System.out.println("Pathao logo Exist:"+pathaoLogo);
        String text=driver.findElement(By.id("com.pathao.user:id/tvSelect")).getText();
        Assert.assertEquals("Select Language",text);
    }
    @Test(priority = 2)
    public void test_tc_002() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("com.pathao.user:id/tvBangla")).isDisplayed();
        driver.findElement(By.id("com.pathao.user:id/tvEnglish")).isDisplayed();
        driver.findElement(By.id("com.pathao.user:id/tvNepal")).isDisplayed();
        Thread.sleep(2000);
        Thread.sleep(2000);
    }
}
