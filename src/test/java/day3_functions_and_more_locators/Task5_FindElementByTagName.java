package day3_functions_and_more_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5_FindElementByTagName {

    /**
     * Task 4: Find Element By Tag Name
     * 1. Open Chrome browser
     * 2. Go to http://practice.primetech-apps.com/practice/buttons
     * 3. Find the element for the button "Click me" by Tag Name
     * 4. Get the label of the button
     * 5. Print the label of the button
     *
     */

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.primetech-apps.com/practice/buttons");
        WebElement button = driver.findElement(By.ByLinkText.tagName("Click Me"));
        button.click();


    }
}
