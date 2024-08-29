package day3_functions_and_more_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7_TestCase2 {

    /**
     * go to indeed.com
     * get the current URL and store it in a variable called homeURL.
     * get the website title and store it in a variable homeTitle.
     * find the input field for “Job title,Keywords” and type SDET
     * find the Search button and click on it.
     * get the current URL and store it a variable searchURL.
     * get the website title and store it in a variable searchTitle.
     * verify that searchURL does not equal to homeURL and contains the search criteria.
     * verify that searchTitle does not equal to homeTitle and has the search criteria.
     */

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  = new ChromeDriver();
        driver.get("https://www.indeed.com");
        Thread.sleep(2000);
        String homeURL = driver.getCurrentUrl();
        String homeTitle = driver.getTitle();
        System.out.println("Home URL: " + homeURL);
        System.out.println("Home Title: " + homeTitle);
        WebElement jobTitle = driver.findElement(By.name("q"));
        jobTitle.sendKeys("SDET");
        WebElement searchButton = driver.findElement(By.className("yosegi-InlineWhatWhere-primaryButton"));
        searchButton.click();
        Thread.sleep(2000);
        String searchURL = driver.getCurrentUrl();
        String searchTitle = driver.getTitle();
        System.out.println("Search URL: " + searchURL);
        System.out.println("Search Title: " + searchTitle);
        if (!searchURL.equals(homeURL) && searchURL.contains("SDET")) {
            System.out.println("Search URL does not equal to homeURL and contains the search criteria.");
        }else {
            System.out.println("Search URL does not meet the criteria.");
        }

        if (!searchTitle.equals(homeTitle) && searchTitle.contains("SDET")) {
            System.out.println("Search Title does not equal to homeTitle and has the search criteria.");
        }else {
            System.out.println("Search Title does not meet the criteria.");
        }



    }




}
