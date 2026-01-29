package TestNGtry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ILovePDF {
    public static void main (String[] args){
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.ilovepdf.com/");
        driver.manage().window().maximize();
        System.out.println("Opened ilovepdf");
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

        String file1 = "C:\\Users\\Qualityassurance\\OneDrive - guardware.com.au\\Desktop\\acdas.pdf";
        driver.findElement(By.xpath("//input[@type='file']\n")).sendKeys(file1);

        WebElement fileUpload = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@id='merge-options']")
                ));
        driver.findElement(By.xpath("//button[@id='processTask']")).click();
        driver.findElement(By.xpath("//a[@id='pickfiles']")).click();
        boolean download = driver.findElement(By.xpath("//h1[contains(text(),'Your PDF has been converted to an editable WORD do')]")).isDisplayed();
        if (download) {
            System.out.println("Word(.docx) file is downloaded");
        }

    }
}
