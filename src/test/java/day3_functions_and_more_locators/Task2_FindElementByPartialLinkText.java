package day3_functions_and_more_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_FindElementByPartialLinkText {

    /**
     * Task 2: Find Element By Partial Link Text
     * 1. Open Chrome browser
     * 2. Go to https://www.facebook.com
     * 3. Find the element for the "Forgot password?" link by Partial Link Text
     * 4. Click on the "Forgot password?" link
     * 5. Close the browser
     *
     */

    public static void main(String[] args) {

        WebDriver driver  = new ChromeDriver();
        driver.get("https://www.facebook.com");
        WebElement forgotAccountLink = driver.findElement(By.partialLinkText("password?"));
        forgotAccountLink.click();
        driver.quit();


        /**
         * Note:
         * --LinkText Locator--
         * In Selenium, partialLinkText and linkText
         * are locators used to identify and interact with links on a webpage.
         * Example:
         * Suppose you have an HTML link like this:
         * <a href="https://www.example.com">Click here to register</a>
         * To locate and click this link using linkText:
         * WebElement link = driver.findElement(By.linkText("Click here to register"));
         * link.click();
         *
         * Explanation: The linkText locator will only find the link if
         * the text inside the <a> tag matches exactly with "Click here to register".
         *
         * --partialLinkText Locator--
         * The partialLinkText locator is used to find a link by a part of the text inside the <a> tag.
         * Example:
         * Suppose you have an HTML link like this:
         * <a href="https://www.example.com">Click here to register</a>
         * To locate and click this link using partialLinkText:
         * WebElement link = driver.findElement(By.partialLinkText("register"));
         * link.click();
         * Explanation: The partialLinkText locator will find the link if the text inside the <a> tag
         * contains the word "register" anywhere in the text.
         * In this case, the partialLinkText locator will find the link because the text "Click here to register"
         * contains the word "register".
         */
    }
}
