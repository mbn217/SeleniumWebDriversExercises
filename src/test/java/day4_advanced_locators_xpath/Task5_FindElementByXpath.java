package day4_advanced_locators_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5_FindElementByXpath {

    /**
     * Task 5: Find Element By Xpath
     * 1. Open Chrome browser
     * 2. Go to http://practice.primetech-apps.com/practice/practice-forms
     * 3. Find the element for the "First Name" text box by Xpath
     * 4. Enter your First Name in the "First Name" text box
     * 5. Find the element for the "Last Name" text box by Xpath
     * 6. Enter Your Last Name in the "Last Name" text box
     * 7. Find the element for the "Address" text box by Xpath
     * 8. Enter your address in the "Address" text box
     * 9. Find the element for the "City" text box by Xpath
     * 10. Enter your city in the "City" text box
     * 11. Find the element for the "State" text box by Xpath
     * 12. Select your state from the "State" dropdown
     * 13. Find the element for the "Zip Code" text box by Xpath
     * 14. Enter your zip code in the "Zip Code" text box
     * 15. Find the element for the "Gender" radio button by Xpath
     * 16. Click on the radio button for your Gender
     * 17. Find the element for the "Submit" button by Xpath
     * 18. Click on the "Submit" button
     */
    public static void main(String[] args) {

        WebDriver driver  = new ChromeDriver();
        driver.get("http://practice.primetech-apps.com/practice/practice-forms");
        WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
        firstName.sendKeys("John");
        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
        lastName.sendKeys("Stewart");
        WebElement address = driver.findElement(By.xpath("//input[@id='address']"));
        address.sendKeys("123 Main St");
        WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
        city.sendKeys("New York");
        WebElement state = driver.findElement(By.xpath("//select[@id='state']"));
        state.sendKeys("New York");
        WebElement zipCode = driver.findElement(By.xpath("//input[@id='zipCode']"));
        zipCode.sendKeys("10001");
        driver.findElement(By.xpath("//html")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("//html")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("//html")).sendKeys(Keys.DOWN);
        driver.findElement(By.xpath("//html")).sendKeys(Keys.DOWN);
        WebElement genderFemale= driver.findElement(By.xpath("//label[@for='female']"));
        genderFemale.click();
        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        submit.click();

    }

}
