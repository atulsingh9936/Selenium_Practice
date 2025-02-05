import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Introduction {

    public static void main(String[] args) {
        // chrome
      //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
       // WebDriver driver = new ChromeDriver();
      //  WebDriver driver = new FirefoxDriver();
        // firefox launch
        //geckodriver
       // System.setProperty("webdriver.gecko.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\geckodriver.exe");

        // edge browser
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();




        driver.get("https://rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();

    }
}
