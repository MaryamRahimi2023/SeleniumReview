package BasicsReview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureUrl {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        System.out.println(driver.getCurrentUrl());// https://www.facebook.com/

        // usage to check if the page is opening so we can print the Url to make sure the page is opening
    }
}
