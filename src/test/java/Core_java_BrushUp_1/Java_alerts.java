package Core_java_BrushUp_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_alerts {
    public static void main(String[] args) {
        String text="Rahul";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("name")).sendKeys(text);
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(  driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(  driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
    }
}
