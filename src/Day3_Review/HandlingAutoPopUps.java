package Day3_Review;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingAutoPopUps {


        public static void main(String[] args) {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            WebDriver driver = new ChromeDriver(options);
            driver.get("https://the-internet.herokuapp.com/basic_auth");
            driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        }
}
