package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
//        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\Qualityassurance\\Documents\\gfh.pdf");
//        if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("gfh.pdf"))
//        {
//            System.out.println("File is uploaded");
//        }else{
//            System.out.println("File not uploaded");
//        }

        //MULTIPLE FILE UPLOAD
        String file1 = "C:\\Users\\Qualityassurance\\Documents\\gfh.pdf";
        String file2 = "C:\\Users\\Qualityassurance\\Documents\\fjgjg.pdf";
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1 + "\n" + file2);
    }
}
