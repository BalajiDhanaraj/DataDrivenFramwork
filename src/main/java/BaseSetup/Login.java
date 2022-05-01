package BaseSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

public class Login {

    public static WebDriver driver;
    @Test
    public void Login(){

        System.setProperty("webdriver.chrome.driver","/Volumes/Macintosh HD/For Mac/java text and soft file and java IDE/Intellij java project/Drivers/chromedriver");

         driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("nn");

         driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("jkj");
    }



}
