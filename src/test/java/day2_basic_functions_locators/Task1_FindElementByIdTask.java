package day2_basic_functions_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_FindElementByIdTask {

    /**
     * Task 1: Find Element By ID
     *
     * 1. Open Chrome browser
     * 2. Go to https://www.google.com
     * 3. Find the element for the searchBox by ID
     * 4. Enter "Hello World" in the searchBox
     * 5. Close the browser
     */

    public static void main(String[] args) {

        WebDriver driver  = new ChromeDriver();
        driver.get("https://www.google.com");
        WebElement  searchBox = driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("Hello World");
        driver.quit();

    }
}
