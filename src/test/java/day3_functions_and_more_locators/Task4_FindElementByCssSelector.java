package day3_functions_and_more_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4_FindElementByCssSelector {

    /**
     * Task 3: Find Element By Css Selector
     * 1. Open Chrome browser
     * 2. Go to https://www.facebook.com
     * 3. Find the element for the email box by Css Selector
     * 4. Enter "Hello World" in the email box
     * 5. Close the browser
     *
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement emailBox = driver.findElement(By.cssSelector("#email"));
        emailBox.sendKeys("Hello World");
        Thread.sleep(2000);
        driver.quit();
    }

    /**
     * Note:
     * cssSelector is a locator strategy that is used to find elements using the css selector syntax.
     * Example:
     * Suppose you have an HTML element like this:
     * <input type="text" id="email" name="email" class="inputtext">
     * To locate this element using cssSelector:
     * WebElement emailBox = driver.findElement(By.cssSelector("#email"));
     *
     * ##Because for id we use # and for class we use . in cssSelector##
     *
     * Example using class:
     * Suppose you have an HTML element like this:
     * <input type="text" id="email" name="email" class="inputtext">
     * To locate this element using cssSelector:
     * WebElement emailBox = driver.findElement(By.cssSelector(".inputtext"));
     */



}
