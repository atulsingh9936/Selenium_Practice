package Windowpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

public class Fileupload {
    public static void main(String[] args) throws InterruptedException, IOException {
      String downloadpath=  System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadpath);
        ChromeOptions Options = new ChromeOptions();
        Options.setExperimentalOption("prefs",chromePrefs);

        WebDriver driver = new ChromeDriver(Options);
        driver.get("https://www.ilovepdf.com/pdf_to_jpg");
        driver.findElement(By.cssSelector(".uploader__btn")).click();
        Thread.sleep(4000);
        Runtime.getRuntime().exec("C:\\Users\\Atul\\OneDrive\\Documents\\FileUpload.exe");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("processTaskTextBtn")));
        driver.findElement(By.id("processTaskTextBtn")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pickfiles")));
        driver.findElement(By.id("pickfiles")).click();
        Thread.sleep(5000);
        File f = new File(downloadpath+"/ilovepdf_pages-to-jpg.zip");
       if( f.exists()){
           //System.out.println("file is found");
           Assert.assertTrue(f.exists());
          if( f.delete()){
              System.out.println("file deleted");
          }
       }


    }
}
