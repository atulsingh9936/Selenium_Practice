package Core_java_BrushUp_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class wait_Ecommerce {


    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
           // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        String[] itemsneeded ={"Cucumber","Brocolli","Beetroot","Carrot"};
            driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
            Thread.sleep(3000);
            additems(driver,itemsneeded);
            driver.findElement(By.xpath("//img[@alt='Cart']")).click();
            driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
            w.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//input[@class='promoCode']"))));



            driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
            driver.findElement(By.cssSelector("button.promoBtn")).click();

            // explicit wait

        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

        System.out.println(  driver.findElement(By.cssSelector("span.promoInfo")).getText());











    }

    public static void additems(WebDriver driver,String[] itemsneeded){
        int j=0;
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
