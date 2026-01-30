package TestNGtry;

import io.qameta.allure.SeverityLevel;
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
import io.qameta.allure.*;


@Epic("PDF Tools")
@Feature("PDF to Word")
public class FirstTest {

    WebDriver driver;
    WebDriverWait wait;

    @Test(priority = 1)
    @Story("Open application")
    @Description("Launch iLovePDF website")
    void openApp() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.ilovepdf.com/");
    }

    @Test(priority = 2)
    @Story("Navigate to PDF to Word")
    void verifyAndMove() {
        driver.findElement(By.xpath("//a[@title='PDF to Word']")).click();
    }

    @Test(priority = 3, dependsOnMethods = "verifyAndMove")
    @Story("Upload PDF and convert")
    @Severity(SeverityLevel.CRITICAL)
    void uploadFile() {
        String file1 = "C:\\Users\\Qualityassurance\\OneDrive - guardware.com.au\\Desktop\\test.pdf";
        WebElement fileInput = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='file']"))
        );
        fileInput.sendKeys(file1);
    }
}

