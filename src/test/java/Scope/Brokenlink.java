package Scope;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

    public class Brokenlink {
        public static void main(String[] args) throws IOException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\OneDrive\\Documents\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            // Open the webpage
            driver.get("https://rahulshettyacademy.com/AutomationPractice/");

            // Locate all links in the footer section
            List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

            // Iterate through the links
            for (WebElement link : links) {
                String url = link.getDomAttribute("href");

                // Filter invalid or empty URLs
                if (url == null || url.isEmpty() || url.equals("#")) {
                    System.out.println("Skipping invalid URL: " + url);
                    continue;
                }

                // Validate the URL by checking the response code
                try {
                    HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
                    conn.setRequestMethod("HEAD");
                    conn.connect();
                    int responseCode = conn.getResponseCode();

                    if (responseCode > 400) {
                        System.out.println("The link with text \"" + link.getText() + "\" is broken with code " + responseCode);
                        Assert.assertTrue(false);
                    } else {
                        System.out.println("The link with text \"" + link.getText() + "\" is working fine.");
                    }
                } catch (Exception e) {
                    System.out.println("Error processing URL: " + url + " - " + e.getMessage());
                }
            }

            // Close the browser
            driver.quit();
        }
    }


