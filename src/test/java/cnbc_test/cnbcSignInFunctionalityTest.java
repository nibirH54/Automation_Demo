package cnbc_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cnbcSignInFunctionalityTest {

    WebDriver driver = new ChromeDriver();

    @Test
    public void signInFunctionalityTest() throws InterruptedException {

        driver.navigate().to("https://www.cnbc.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='SignInMenu-signInMenu']")).click();
        driver.findElement(By.name("email")).sendKeys("hasannibir54@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Cnbc@123");
        driver.findElement(By.xpath("//span[@class='Checkboxes-checkmark']")).click();
        Thread.sleep(4000);
        driver.findElement(By.name("signin")).click();
        Thread.sleep(5000);
        String myAccountText = driver.findElement(By.xpath("//button[@class='SignInMenu-accountMenu']")).getText();
        Assert.assertEquals(myAccountText, "MY ACCOUNT");
        System.out.println("The confirmation Text after user Logs in is: " + myAccountText);


    }
}
