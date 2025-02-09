package E_commerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class E_commerce {
    public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        int j=0;
        String[] itemsneeded ={"Cucumber","Brocolli","Beetroot","Carrot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(3000);
      List<WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
      for(int i=0;i<products.size();i++){

          // brocolli - 1kg
          //cucumber -1kg
          String[] name = products.get(i).getText().split("-");
       //name[0]- brocolli
        String formattedstring=  name[0].trim();
       List itemNeededList = Arrays.asList(itemsneeded);

       if(itemNeededList.contains(formattedstring)){
           // click on add to cart
           j++;
           driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
           if(j==itemsneeded.length) {
               break;
           }

       }
      }
    }
}
