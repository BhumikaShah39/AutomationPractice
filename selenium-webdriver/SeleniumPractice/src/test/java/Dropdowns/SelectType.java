package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectType {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));
        Select dropElement = new Select(dropdown);
        dropElement.selectByValue("canada");
        List<WebElement> options = dropElement.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

    }
}
