package Java_streams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.stream.Collectors;

public class Selenium_webtable {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

        // click on column
        driver.findElement(By.xpath("//tr/th[1]")).click(); // capture all weblement in list

      List<WebElement> elementlist=  driver.findElements(By.xpath("//tr/td[1]"));


      // capture texts of all webelemnent into new(original) list
      List<String> originallist=  elementlist.stream().map(s->s.getText()).collect(Collectors.toList());


        // sort in the  original list of step3 -> sorted list
       List<String> sortedList= originallist.stream().sorted().collect(Collectors.toList());
        // compare original list and sorted list
        Assert.assertTrue(originallist.equals(sortedList));

        // scan the name column with gettext -> rice , -> ask to print the price of the rice
        List<String> price;
     do {
         List<WebElement> rows=  driver.findElements(By.xpath("//tr/td[1]"));
          price = rows.stream().filter(s -> s.getText().contains("Rice")).map(s -> getpriceVeggie(s)).collect(Collectors.toList());
         price.forEach(s -> System.out.println(s));
         if (price.size() < 1) {
             driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
         }
     } while(price.size() < 1);






    }

    private static String getpriceVeggie(WebElement s) {
     String pricevalue=   s.findElement(By.xpath("following-sibling::td[1]")).getText();
     return pricevalue;

    }
}
