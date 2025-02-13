package Scope;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Scope {
    public static void main(String[] args) throws InterruptedException {

        //1. Give me the counts of link of the page
        // 2. count of footer section
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());
       WebElement footdriver =driver.findElement(By.id("gf-BIG")); // limiting webdriver scope
        System.out.println(footdriver.findElements(By.tagName("a")).size());

    WebElement columndriver = footdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());


        // 4. click on each link in the column and check if the page are opening
        for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++) {
            String clickonlink = Keys.chord(Keys.CONTROL, Keys.ENTER);
            columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlink);
            Thread.sleep(5000);
        }// opens all the tabs

          Set<String> abc= driver.getWindowHandles();
         Iterator<String>  it = abc.iterator();
         while(it.hasNext()){

             driver.switchTo().window(it.next());
             System.out.println(driver.getTitle());
         }




    }
}
