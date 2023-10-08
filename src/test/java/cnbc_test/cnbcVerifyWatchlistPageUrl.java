package cnbc_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cnbcVerifyWatchlistPageUrl {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void verifyWatchListPageUrl() throws InterruptedException {

        driver.navigate().to("https://www.cnbc.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='CNBCGlobalNav-watchListContainerBtn CNBCGlobalNav-watchListContainerBtn_BellPosition']")).click();
        Thread.sleep(3000);
        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, "https://www.cnbc.com/watchlist/");
        System.out.println("The URL of the watchlist Page is: " +currentUrl);
        driver.close();
    }
}
