package Day3_Review;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;

public class HandlingLastTwoCheckBoxes {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://itera-qa.azurewebsites.net/home/automation");

        List<WebElement> days =driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
        for(int i=5; i<=days.size(); i++)
        {
            days.get(i).click();
        }

    }
}
