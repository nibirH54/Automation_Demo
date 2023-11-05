package cnbc_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cnbcVerifyLatestNewsSideRail {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void verifyLatestNewsSideRailIsPresent() throws InterruptedException {
        driver.get("https://www.cnbc.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        String latestNewsText = driver.findElement(By.xpath("//span[normalize-space()='Latest News']")).getText();
        System.out.println("The latest news side rail header Text is: " + latestNewsText);
        Assert.assertEquals(latestNewsText, "LATEST NEWS");
        driver.close();
    }
}
