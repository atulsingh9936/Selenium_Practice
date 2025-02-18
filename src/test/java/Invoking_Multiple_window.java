import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class Invoking_Multiple_window {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        // switching window
        driver.switchTo().newWindow(WindowType.WINDOW);


      Set<String> handles=  driver.getWindowHandles();
     Iterator<String> it= handles.iterator();
    String parentid= it.next();
    String childId= it.next();
         driver.switchTo().window(childId);
         driver.get("https://rahulshettyacademy.com/");
      String courseName=   driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
      driver.switchTo().window(parentid);
      WebElement name= driver.findElement(By.cssSelector("[name='name']"));
      name.sendKeys(courseName);
      // taking screenshot
    File file =name.getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(file, new File("logo.png"));

    // get height and width
        System.out.println(name.getRect().getDimension().getHeight());
        System.out.println(name.getRect().getDimension().getWidth());


    }
}
