package cnbc_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cnbcVerifyNewsLetterSignUpFromFooter {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void verifyNewsLetterSignUpFromFooter() throws InterruptedException {

        driver.get("https://www.cnbc.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[normalize-space()='Sign Up Now']")).click();
        Thread.sleep(4000);
        driver.findElement(By.id("breaking-news")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("inputEmail")).sendKeys("scratchtechtest@gmail.com");
        Thread.sleep(4000);
        driver.findElement(By.id("nl-page-submit")).click();
        Thread.sleep(3000);
        String confirmationText = driver.findElement(By.xpath("//div[@role='dialog']")).getText();
        System.out.println("The Confirmation Text is: "  + confirmationText);
        driver.close();
    }
}
