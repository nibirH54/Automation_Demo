package cnbc_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class cnbcHomePageTitleTest {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void homePageTitleTest(){

        //When user wants to Navigate to a Website
        driver.get("https://www.cnbc.com/");
        driver.manage().window().maximize();
        String pageTitle = driver.getTitle();
        System.out.println("The Home Page Title for the  Website is: " + pageTitle);
        driver.close();

    }
}
