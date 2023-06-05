package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchAutomation {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

        // Launch Chromebrowser
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to Google
        driver.get("https://www.google.com");

        // Find the search input element
        WebElement searchInput = driver.findElement(By.name("q"));

        // Enter the search query
        searchInput.sendKeys("Automated search with Selenium");

        // Press Enter key to perform the search
        searchInput.sendKeys(Keys.ENTER);

        // Wait for the search results to load
        try {
            Thread.sleep(3000); // Adjust the sleep time as needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the title of the search results page
        System.out.println("Search results page title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}


