package HandlingElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class OrangeHRM {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
        Set<String> winIds= driver.getWindowHandles();
        System.out.println(winIds);

        //Approach one
//		List<String> winIds = new ArrayList(winId);
//		String childId = winIds.get(1);
//		driver.switchTo().window(childId);
//		System.out.println(driver.getTitle());

        //Approach two

        for(String winId : winIds)
        {
            String title = driver.switchTo().window(winId).getTitle();
            System.out.println(title);
            //add some validation for change in window
            if(title.equals("OrangeHRM")) {
                driver.close();
            }
        }
    }
}
