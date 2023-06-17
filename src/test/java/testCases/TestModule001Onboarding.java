package testCases;
import EnvSetup.BaseEnv;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestModule001Onboarding extends BaseEnv {
    @Test(priority = 1)
    public void TC_001() throws InterruptedException {
        Thread.sleep(3000);
        boolean pathaoLogo =driver.findElement(By.id("com.pathao.user:id/ivLogo")).isDisplayed();
        System.out.println("Pathao logo Exist:"+pathaoLogo);
        String text=driver.findElement(By.id("com.pathao.user:id/tvSelect")).getText();
        Assert.assertEquals("Select Language",text);
    }
    @Test(priority = 2)
    public void TC_002() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.id("com.pathao.user:id/tvBangla")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("com.pathao.user:id/tvEnglish")).isDisplayed());
        Assert.assertTrue(driver.findElement(By.id("com.pathao.user:id/tvNepal")).isDisplayed());
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void TC_003() throws InterruptedException {
        Thread.sleep(2000);
        String textValidation=driver.findElement(By.id("com.pathao.user:id/tvChangeLanguage")).getText();
        Assert.assertEquals("You can change language later from settings",textValidation);
        Thread.sleep(2000);
        boolean ivBanner=driver.findElement(By.id("com.pathao.user:id/ivBanner")).isDisplayed();
        System.out.println("ivBanner logo Exist:"+ivBanner);
    }
    @Test(priority = 4)
    public void TC_004() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("com.pathao.user:id/btnStart")).click();
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void TC_005() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("com.pathao.user:id/btnGetStarted")).click();
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void TC_006() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("com.pathao.user:id/etPhoneNumber")).sendKeys("1629674872");
        Thread.sleep(2000);
        driver.findElement(By.id("com.pathao.user:id/btnContinue")).click();
        Thread.sleep(20000);
    }
    @Test(priority = 7)
    public void TC_007() throws InterruptedException {
        driver.findElement(By.id("com.pathao.user:id/btnSubmit")).click();
        Thread.sleep(3000);
    }
    @Test(priority = 8)
    public void TC_008() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("com.pathao.user:id/btnRequestPermission")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_one_time_button")).click();
        Thread.sleep(3000);
    }
    @Test(priority = 9)
    public void TC_009() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Pathao\"])[12]")).click();
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.id("com.pathao.user:id/tvFoodInviteMessage")).click();
    }
}
