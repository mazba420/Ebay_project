package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CalenderConcept {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String webSite = "https://www.expedia.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(webSite);
        Thread.sleep(2000);



        driver.findElement(By.xpath("//button[text()='Apr 12']")).click();
        driver.findElement(By.xpath("(//td[@class='uitk-date-picker-day-number'])[13]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//td[@class='uitk-date-picker-day-number'])[20]")).click();

        driver.findElement(By.xpath("//span[text()='Done']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[text()='Search']")).click();

    }
}
