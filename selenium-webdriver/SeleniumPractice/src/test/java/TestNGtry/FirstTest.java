package TestNGtry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;


public class FirstTest {
    //global var
    WebDriver driver;
    WebDriverWait wait;
    @Test(priority = 1)
    void openApp(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.ilovepdf.com/");
        System.out.println("Opened ilovepdf");
    }

    @Test(priority = 2)
    void verifyAndMove(){
        boolean status = driver.findElement(By.xpath("//img[@alt='iLovePDF']")).isDisplayed();
        if(status)
        {
            System.out.println("Logo is present");
        }
        driver.findElement(By.xpath("//a[@title='PDF to Word']")).click();
        boolean pdfPage = driver.findElement(By.xpath("//h1[normalize-space()='PDF to WORD Converter']")).isDisplayed();
        if(pdfPage)
        {
            System.out.println("Moved Forward to :PDF TO WORD");
        }
    }


    @Test(priority = 3, dependsOnMethods = {"verifyAndMove"})
    void uploadFile() {
        String file1 = "C:\\Users\\Qualityassurance\\OneDrive - guardware.com.au\\Desktop\\acdas.pdf";
        WebElement fileInput = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']"))
        );
        fileInput.sendKeys(file1);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("merge-options")));
        driver.findElement(By.id("processTask")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Your PDF has been converted')]")));

        System.out.println("Word (.docx) file is ready for download");
    }
}
