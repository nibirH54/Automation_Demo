package cnbc_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cnbcVerifyWatchListPageText {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void verifyWatchListPageText() throws InterruptedException {
        driver.navigate().to("https://www.cnbc.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='CNBCGlobalNav-watchListContainerBtn CNBCGlobalNav-watchListContainerBtn_BellPosition']")).click();
        Thread.sleep(5000);
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(4000);
        String watchListPageText = driver.findElement(By.xpath("//p[@class='WatchlistMarketingPage-headline']")).getText();
        Assert.assertEquals(watchListPageText, "Follow the action to gain the insights you need to fine-tune your trading strategy");
        System.out.println("The watchlist page Text is: " + watchListPageText);
        driver.close();

    }
}
