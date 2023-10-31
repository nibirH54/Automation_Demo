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
        driver.findElement(By.id("morning-squawk")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("your-money-your-vote")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("the-exchange")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("space")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("disruptors")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("ontheotherhand")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("cnbccouncils")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("stocksatnight")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("big-data-investor")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("warrenbuffettwatch")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("investorsclub")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("etfedge")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("futureproof")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("msapac")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("msemea")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("btv")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("sustainablefuture")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("closing-the-gap")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("make-it")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("your-wealth")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("investinyou")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("dinero")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("selectmoneymatters")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("cnbc-prime-newsletter")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("healthy-returns")).click();
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
