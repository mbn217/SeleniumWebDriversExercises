package day2_basic_functions_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_FindElementByClassName {

    /**
     * Task 2: Find Element By Class Name
     *
     * 1. Open Chrome browser
     * 2. Go to https://www.yahoo.com
     * 3. Find the element for the searchBox by Class Name
     * 4. Enter "Hello World" in the searchBox
     */

    public static void main(String[] args) {

        WebDriver driver  = new ChromeDriver();
        driver.get("https://www.yahoo.com");
        // Find the element for the searchBox by Class Name
        WebElement searchBox = driver.findElement(By.className("_yb_rxlbl2 _yb_1894tvq  _yb_ajji91   "));
        searchBox.sendKeys("Hello World");


    }
}
