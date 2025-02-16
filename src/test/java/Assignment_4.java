import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Assignment_4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[text()='Multiple Windows']")).click();
        driver.findElement(By.linkText("Click Here")).click();
     Set<String> window= driver.getWindowHandles();
      Iterator <String> it= window.iterator();
     String parentid= it.next();
     String childid = it.next();
     driver.switchTo().window(childid);
        System.out.println( driver.findElement(By.xpath("//div[@class='example']/h3")).getText());
        driver.switchTo().window(parentid);
        System.out.println(driver.findElement(By.xpath("//h3[text()='Opening a new window']")).getText());
    }
}
