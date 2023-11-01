package cnbc_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class cnbcVerifyTravelInsurancePageUrl {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void verifyTravelInsurancePageUrl() throws InterruptedException {
        driver.get("https://www.cnbc.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//button[@class='EditionMenu-featuredMenuButton']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        driver.findElement(By.xpath("//p[normalize-space()='Insurance']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//p[normalize-space()='Travel Insurance']")).click();
        Thread.sleep(4000);
        String travelInsurancePageUrl = driver.getCurrentUrl();
        System.out.println("The travel insurance Page Url is: " + travelInsurancePageUrl);
        Thread.sleep(3000);
        String articleHeader = driver.findElement(By.xpath("//h1[@class='ArticleHeader-styles-select-headline--n2eyV']")).getText();
        System.out.println("The Article Header Text is: " + articleHeader);
        driver.close();
    }
}
