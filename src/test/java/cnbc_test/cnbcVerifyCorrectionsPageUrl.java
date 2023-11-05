package cnbc_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cnbcVerifyCorrectionsPageUrl {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void verifyCorrectionsPageUrl() throws InterruptedException {
        driver.get("https://www.cnbc.com/");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//div[normalize-space()='Corrections']")).click();
        Thread.sleep(3000);
        String correctionsPageUrl = driver.getCurrentUrl();
        System.out.println("The corrections page Url is: " + correctionsPageUrl);
        Assert.assertEquals(correctionsPageUrl, "https://www.cnbc.com/corrections/");
        driver.close();
    }
}
