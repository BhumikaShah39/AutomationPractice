package HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_Executor {
    public static void main (String [] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nopcommerce.com/en/demo?srsltid=AfmBOopQDEqCOwNPxN5-INtYDSkPqNnzZiXKZHMDoZJsWJxe7CJT8KxW");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //scrolling page - pixel
//        js.executeScript("window.scrollBy(0,3000)","");
//        System.out.println(js.executeScript("return window.pageYOffset"));


        //scrolling till an element is visible
        WebElement el = driver.findElement(By.xpath("//h2[normalize-space()='The Perfect Solution!']"));
        js.executeScript("arguments[0].scrollIntoView();",el);
    }

}
