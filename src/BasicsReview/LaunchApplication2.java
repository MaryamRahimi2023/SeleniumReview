package BasicsReview;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication2 {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        // working for selenium >4.6
        // they integrated the setProperty method inside the WebDrive

       driver.get("https://facebook.com/"); // https must but www not necessary

        // driver.get("//www.facebook.com/");

        driver.navigate().to(("https://facebook.com/")); // using the get method inside
        // Navigate uses the get method behind the scene

        // tab name is title of the page
    }

}
