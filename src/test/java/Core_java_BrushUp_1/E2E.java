package Core_java_BrushUp_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class E2E {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='DEL']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
        if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("0.5")) {
            System.out.println("its disabled");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }
        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();

        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        int i = 1;
        while (i < 5) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

//        driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();
        driver.findElement(By.cssSelector("input[type='submit']")).click();
//        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //  driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
    }
}
