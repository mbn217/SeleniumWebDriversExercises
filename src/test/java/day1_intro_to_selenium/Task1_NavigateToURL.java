package day1_intro_to_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_NavigateToURL {
    /**
     * Task 1: Navigate to URL
     * 1. Open Chrome browser
     * 2. Go to https://www.google.com
     * 3. Close the browser
     */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();



    }
}
