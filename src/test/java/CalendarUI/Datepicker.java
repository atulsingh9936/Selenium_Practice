package CalendarUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Datepicker {
    public static void main(String[] args) {

        String monthnumber ="6";
        String date ="15";
        String Year="2027";
        String[] expectedList= {monthnumber,date,Year};
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
        driver.findElement(By.xpath("//button[text()='"+Year+"']")).click();
        driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthnumber)-1).click();
        driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();

       // System.out.println(driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).getText());

     List<WebElement> actualist= driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));
     for(int i=0;i<actualist.size();i++){
         System.out.println(  actualist.get(i).getDomAttribute("Value"));
         Assert.assertEquals(actualist.get(i).getDomAttribute("Value"),expectedList[i]);
     }
     driver.close();


    }
}
