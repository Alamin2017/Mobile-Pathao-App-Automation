package testCases;

import EnvSetup.BaseEnv;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestModule005Home extends BaseEnv {

    @Test(priority = 10)
    public void TC_0010() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=\"Pathao\"])[12]")).click();
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//android.widget.TextView[@text='More']")).click();
        driver.findElement(By.id("com.pathao.user:id/ivClose")).click();
    }
}
