package BasicsReview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

    public static void main(String[] args) {

        // 1.Open the Browser
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Maryam Rahimi\\IdeaProjects\\SeleniumReview\\Driver\\chromedriver.exe");


        // create an instance of WedDriver
        WebDriver driver=new ChromeDriver();
       // driver.get("https://www.facebook.com/");


    }
}
