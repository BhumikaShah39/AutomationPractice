package HandlingElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alerts {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
        Alert simpleAlert = driver.switchTo().alert();
        Thread.sleep(2000);
        System.out.println(simpleAlert.getText());
        simpleAlert.accept();

        //Confirmation alert (OK AND CANCEL)
        driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
        Thread.sleep(2000);
        Alert confirmationAlert = driver.switchTo().alert();
        System.out.println(confirmationAlert.getText());
        //confirmationAlert.accept(); //clicks confirm
        confirmationAlert.dismiss();//clicks cancel

        //prompt alert
        driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
        Thread.sleep(2000);
        Alert promptAlert = driver.switchTo().alert();
        System.out.println(promptAlert.getText());
        promptAlert.sendKeys("Bhumika");
        promptAlert.accept();


    }
}
