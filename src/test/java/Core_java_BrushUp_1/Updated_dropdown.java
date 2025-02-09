package Core_java_BrushUp_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Updated_dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
       // System.out.println(  driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
        //System.out.println(  driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());

        // Count the number of checkboxes
        System.out.println(  driver.findElements(By.cssSelector("input[type='checkbox']")).size());




        driver.findElement(By.id("divpaxinfo")).click();
        System.out.println(  driver.findElement(By.id("divpaxinfo")).getText());
        Thread.sleep(2000);
        int i=1;
        while(i<5){
            driver.findElement(By.id("hrefIncAdt")).click();
           i++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(  driver.findElement(By.id("divpaxinfo")).getText());
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
    }
}
