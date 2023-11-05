package cnbc_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cnbcVerifyTrendingNowComponent {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void verifyTrendingNow() throws InterruptedException {

        driver.get("https://www.cnbc.com/");
        driver.manage().window().maximize();
        String trendingNowHeader = driver.findElement(By.xpath("//h2[@class='TrendingNow-heading']")).getText();
        Assert.assertEquals(trendingNowHeader, "TRENDING NOW");
        System.out.println("The Trending now Header Text is: " + trendingNowHeader);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='PageBuilder-col-12 PageBuilder-col']//li[1]")).click();
        String trendingNowFirstUrl = driver.getCurrentUrl();
        System.out.println("The first Story URL Of trending now section is: " + trendingNowFirstUrl);
        driver.close();
    }
}
