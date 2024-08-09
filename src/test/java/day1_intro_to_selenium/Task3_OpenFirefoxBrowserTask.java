package day1_intro_to_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task3_OpenFirefoxBrowserTask {

    /**
     * Task 3: Open Firefox Browser
     * 1. Open Firefox browser
     * 2. Go to https://www.facebook.com
     * 3. Close the browser
     */

    public static void main(String[] args) {
        // 1. Open Firefox browser
        // 2. Go to https://www.facebook.com
        // 3. Close the browser
        WebDriver driver  = new FirefoxDriver();
        driver.get("https://www.facebook.com");
        driver.quit();
    }
}
