package Day3_Review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

public class HandlingSelectiviteCheckBoxes {

    public static void main(String[] args) {

        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver=new ChromeDriver(options);
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
       List<WebElement> days= driver.findElements(By.xpath("//input[@type='checkbox' and  @class='form-check-input']"));
        for (WebElement day : days) {
            if(day.getAttribute("id").equalsIgnoreCase("tuesday")||day.getAttribute("id").equalsIgnoreCase("thursday")
                    ||day.getAttribute("id").equalsIgnoreCase("saturday"))
            {
                day.click();
            }
        }

    }
}
