package HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

//three methods
//driver.switchTo.frame(name)
//driver.switchTo.frame(id)
//driver.switchTo.frame(WebElement)
public class Frames {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        //nested frames
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();
        WebDriverWait myWait = new WebDriverWait(driver,Duration.ofSeconds(10));

//        //frame 1
//        //cannot access frame elements with usual xpath, need to write own xpath like //frame[@src='wdwe'] for frame then for elememt
//        WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
//        driver.switchTo().frame(frame1);
//        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Bhumika");
//
//        driver.switchTo().defaultContent(); //go back to page
//
//
//        //frame 3 - consists of iframe
//        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
//        driver.switchTo().frame(frame3);
//        //switch to inner iFrame- using index (preferable if it contains only one inner frame)
//        driver.switchTo().frame(0);
//        //open iframe link in new tab to get xpath
//        driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
//        driver.switchTo().defaultContent();


        //frame5
        WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
        driver.switchTo().frame(frame5);
        driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
        Boolean logo = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img")).isDisplayed();





    }
}
