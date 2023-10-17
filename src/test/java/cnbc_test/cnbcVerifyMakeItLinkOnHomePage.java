package cnbc_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class cnbcVerifyMakeItLinkOnHomePage {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void verifyMakeItLinkOnHomePage() throws InterruptedException {
        driver.get("https://www.cnbc.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@title='makeit']")).click();
        Thread.sleep(3000);
        String makeItPageUrl = driver.getCurrentUrl();
        System.out.println("The Make It Page Url is: " + makeItPageUrl);
        String headerTextSize = driver.findElement(By.xpath("(//img[@alt='logo'])[2]")).getSize().toString();
        System.out.println("The Header Text size of the Make it Page is: " + headerTextSize);
        driver.close();
    }
}
