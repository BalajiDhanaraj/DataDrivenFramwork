package BaseSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

public class Login {


    @Test
    public void Login(){

        System.setProperty("webdriver.chrome.driver","/Volumes/Macintosh HD/For Mac/python project/Browserdrivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("nn");

         driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("jkj");
    }



}
