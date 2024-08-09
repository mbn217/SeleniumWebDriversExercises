package day1_intro_to_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_OpenChromeBrowserTask {
    /**
     * Task 2: Open Chrome Browser
     * 1. Open Chrome browser
     * 2. Go to https://www.amazon.com
     * 3. Close the browser
     */

    public static void main(String[] args) {

        WebDriver driver  = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.quit();


    }
}
