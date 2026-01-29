package HandlingElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//capturing alert with explicit wait
public class HandlingAlertsWithExplicitWait {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //wait declaration
        WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
        //capturing alert
        Alert promptAlert =  myWait.until(ExpectedConditions.alertIsPresent());
        assert promptAlert != null;
        promptAlert.getText();
        promptAlert.sendKeys("Bhumika Shah");
        promptAlert.accept();
    }
}
