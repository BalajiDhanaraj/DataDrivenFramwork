package DataDriven;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//public class ReadExcel {
//
//        public static WebDriver driver;
//       static List<String> usernamelist = new ArrayList<String>();
//       static List<String> passwordlist = new ArrayList<String>();
//
//       @BeforeSuite
//        public void invoke(){
//            System.setProperty("webdriver.chrome.driver","/Volumes/Macintosh HD/For Mac/java text and soft file and java IDE/Intellij java project/Drivers/chromedriver");
//
//            driver = new ChromeDriver();
//            driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
//
//        }
//
//        @BeforeTest
//        public void readExcel() throws IOException {
//            FileInputStream excel = new FileInputStream("/Volumes/Macintosh HD/For Mac/java text and soft file and java IDE/Intellij java project/DataDrivenFramwork/exceldata.xlsx");
//
//            Workbook workbook = new XSSFWorkbook(excel);
//
//            Sheet sheet = workbook.getSheetAt(0); // there are two type of calling the sheet by using sheet position "1" or else sheet "Sheetname
//
//            Iterator<Row> rowIterator = sheet.iterator(); // sheet.iterator will give overall value of the sheet, Like Total no of data
//
//            while (rowIterator.hasNext()){
//                Row rowvalue = rowIterator.next();
//
//                Iterator<Cell> columnIterator = rowvalue.iterator();
//
//                int i = 2;
//                while (columnIterator.hasNext()){
//                    if (i%2 == 0){
//                      usernamelist.add(columnIterator.next().getStringCellValue());
//                    }else {
//                        passwordlist.add(columnIterator.next().getStringCellValue());
//                    }
//                    i++;
//                }
//            }
//        }
//
//
//       public void Login(String uname,String pass){
//
//        driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(uname);
//
//        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(pass);
//      }
//
//        @Test
//        public void executeTest(){
//            for (int i=0;i<usernamelist.size();i++){
//                Login(usernamelist.get(i),passwordlist.get(i));
//            }
//        }
//
//        @AfterSuite
//        public void close(){
//           driver.quit();
//        }
//
//
//
//      /*  public static void main(String[] args) throws IOException {
//            ReadExcel readExcel = new ReadExcel();
//            readExcel.readExcel();
//            readExcel.executeTest();
//            System.out.println("username"+usernamelist);
//            System.out.println("passord"+passwordlist);
//        }*/
//
//    }

