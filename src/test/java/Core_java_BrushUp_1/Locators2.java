package Core_java_BrushUp_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators2 {
    public static void main(String[] args) throws InterruptedException {
        String name ="rahul";
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//         System.setProperty("webdriver.gecko.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\geckodriver.exe");
//         WebDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.edge.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      String password=  getpassword(driver);
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys(password);
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        System.out.println(  driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
        System.out.println(   driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText());
        Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello"+" "+name+",");
        driver.findElement(By.xpath("// button[text()='Log Out']")).click();
        driver.close();
    }

    public static String getpassword(WebDriver driver) throws InterruptedException {

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        String PasswordText= driver.findElement(By.cssSelector("form p")).getText();
        // Please use temporary password 'rahulshettyacademy' to Login.
      String[] passwordArray=  PasswordText.split("'");
    String password = passwordArray[1].split("'")[0];
    return password;
        // 0 ->Please use temporary password
        // 1-> rahulshettyacademy' to Login
        // 0 th - rahulshettyacademy
        // 1 th -> to Login

    }
}
