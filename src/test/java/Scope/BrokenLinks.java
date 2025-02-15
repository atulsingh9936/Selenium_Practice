package Scope;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.*;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // Broken url
        // step1: is to gell all urls tied up to the links using selenium
        // java methods will call urls and get the status code
        // if status code>400 then the url is not working-> link which tied to url is broken
        // a[href*=".soapui"]
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

     List<WebElement> links=  driver.findElements(By.cssSelector("li[class='gf-li'] a"));
        SoftAssert a = new SoftAssert();
     for(WebElement link:links) {

         String url = link.getDomAttribute("href");
         if (url == null || url.isEmpty() || url.equals("#")) {
             System.out.println("Skipping invalid URL: " + url);
             continue;
         }

         HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
         conn.setRequestMethod("HEAD");
         conn.connect();
         int responsecode = conn.getResponseCode();
         System.out.println(responsecode);
         a.assertTrue(responsecode<400,"The link with text" + link.getText() + " is broken with code" + responsecode);

     }
     a.assertAll();

//       }catch (Exception e){
//           System.out.println("Error processing URL: " + url + " - " + e.getMessage());
//       }






//
//      String url=  driver.findElement(By.cssSelector("a[href*='brokenlink']")).getDomAttribute("href");
//    HttpURLConnection conn=(HttpURLConnection) new URL(url).openConnection();
//    conn.setRequestMethod("HEAD");
//    conn.connect();
//   int responsecode= conn.getResponseCode();
//        System.out.println(responsecode);

    }
}
