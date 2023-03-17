package BasicsReview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTitle {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");
        driver.navigate().to("https://www.facebook.com/"); // in the same chrome page first google will be lunched then navigate to
        // facebook and get the title

        System.out.println(driver.getTitle());// Facebook - log in or sign up
//      we can save in String as well as variable and print it
        // usage to check if the page is opening so we can print the title to make sure the page is opening
    }
}
