package cnbc_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class cnbcVerifySearchQuoteFunctionality {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void verifySearchQuoteFunctionality() throws InterruptedException {

        driver.navigate().to("https://www.cnbc.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[normalize-space() ='Search quotes, news & videos']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@placeholder='Search quotes, news, & videos']")).sendKeys("AAPL");
        driver.findElement(By.xpath("//button[@class='icon-search SearchEntry-searchButton']")).click();
        Thread.sleep(3000);
        String quotePageUrl = driver.getCurrentUrl();
        System.out.println("The AAPL Quote Page URL is: " + quotePageUrl);
        driver.close();
    }
}
