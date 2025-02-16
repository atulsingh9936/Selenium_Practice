import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment_2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Atul");
        driver.findElement(By.name("email")).sendKeys("atul.singh2189@gmail.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("Atul9936@");
        driver.findElement(By.id("exampleCheck1")).click();
     WebElement gender = driver.findElement(By.id("exampleFormControlSelect1"));
        Select s= new Select(gender);
        s.selectByVisibleText("Male");
        driver.findElement(By.id("inlineRadio1")).click();
        driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("25/09/1997");
        driver.findElement(By.cssSelector("input[value='Submit']")).click();
        System.out.println((driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText()));




    }
}
