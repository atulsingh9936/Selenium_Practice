package Java_streams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.id("search-field")).sendKeys("Rice");
     List<WebElement> Veggies= driver.findElements(By.id("//tr/td[1]"));
     //1 results
  List<WebElement>  filteredList= Veggies.stream().filter(s ->s.getText().contains("Rice")).collect(Collectors.toList());
  // 1 result

        Assert.assertEquals(Veggies.size(),filteredList.size());
    }
}
