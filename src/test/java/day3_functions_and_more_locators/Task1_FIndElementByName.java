package day3_functions_and_more_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_FIndElementByName {

    /**
     * Task 1: Navigate to URL and search for an element by name
     *
     * 1. Open Chrome browser
     * 2. Go to https://www.facebook.com
     * 3. Find the element for the email box by Name
     * 4. Enter "Hello World" in the email box
     * 5. Close the browser
     */

    public static void main(String[] args) {

        WebDriver driver  = new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement emailBox = driver.findElement(By.name("email"));
        emailBox.sendKeys("Hello World");
        driver.quit();

    }
}
