import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElement(By.xpath("//label[@for='benz']")).getText());
      String checkboxtext=  driver.findElement(By.xpath("//label[@for='benz']")).getText();
        driver.findElement(By.cssSelector("#checkBoxOption2")).click();

     WebElement dropdown=  driver.findElement(By.id("dropdown-class-example"));
        Select s = new Select(dropdown);
        s.selectByVisibleText(checkboxtext);

        driver.findElement(By.name("enter-name")).sendKeys(checkboxtext);
        driver.findElement(By.id("alertbtn")).click();
      String text=  driver.switchTo().alert().getText();
      String formattedstring=text.split(",")[0].split(" ")[1];
      if(formattedstring.equalsIgnoreCase(checkboxtext)){
          System.out.println("text is present");
      }else{
          System.out.println("text not present");
      }



    }
}
