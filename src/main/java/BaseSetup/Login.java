package BaseSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Login {

    public static WebDriver driver;

    public String[][] data = {
            {"Admin1","admin"},
            {"Admin1","admin2"},
            {"Admin1","admin3"}
    };

    @DataProvider(name = "loginData")
    public Object[][] LoginDataProvider(){
        return data;
    }

    @Test(dataProvider ="loginData")
    public void Login(String uname,String pass){
        System.setProperty("webdriver.chrome.driver","/Volumes/Macintosh HD/For Mac/java text and soft file and java IDE/Intellij java project/Drivers/chromedriver");

         driver = new ChromeDriver();
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(uname);

         driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(pass);
    }



}
