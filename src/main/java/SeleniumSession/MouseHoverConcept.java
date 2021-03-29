package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class MouseHoverConcept {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String webSite = "https://www.hyrtutorials.com/p/alertsdemo.html";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(webSite);

      WebElement seleniumPractice = driver.findElement(By.xpath("//a[normalize-space()='Selenium Practice']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(seleniumPractice).build().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Alerts']")).click();
      String title =  driver.getTitle();
        System.out.println(title);


    }
}
