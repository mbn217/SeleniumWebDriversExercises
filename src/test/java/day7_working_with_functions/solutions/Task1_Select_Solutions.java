package day7_working_with_functions.solutions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task1_Select_Solutions {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        // verify that by default the “Older Newsletters” is selected from the dropdown
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='drop1']"));
        Select select = new Select(dropdown);
        WebElement selectedOption = select.getFirstSelectedOption();
        System.out.println("Default selected option: " + selectedOption.getText());

        //Get all the option available in the dropdown
        for (WebElement option : select.getOptions()) {
            System.out.println("The Selected options is:  " + option.getText());
        }

        //Verify that the list is matching with what is in the requirement
        List<String> expectedOptions = List.of("Older Newsletters", "doc 1", "doc 2"
                , "doc 3", "doc 4");
        //Store all the options from the UI in a list
        List<WebElement> actualOptions = select.getOptions();
        for (int i = 0; i < expectedOptions.size(); i++) {
            if (expectedOptions.get(i).equals(actualOptions.get(i).getText())) {
                System.out.println("Option " + i + " is matching");
            } else {
                System.out.println("Option " + i + " is not matching");
            }
        }


    }
}
