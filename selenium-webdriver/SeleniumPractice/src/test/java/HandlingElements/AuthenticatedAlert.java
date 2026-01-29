package HandlingElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedAlert {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //actual url
//        driver.get("https://the-internet.herokuapp.com/digest_auth");
        //injected url with username and password -- https://username:password@restOfTheURl
        driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
    }
}
