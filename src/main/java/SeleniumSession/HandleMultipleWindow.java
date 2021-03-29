package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HandleMultipleWindow {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String webSite = "https://www.hyrtutorials.com/p/window-handles-practice.html";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(webSite);

        //parentsWindow
        driver.findElement(By.id("newWindowBtn")).click();

        //we are get two window handle ID
        Set<String> windowshandle = driver.getWindowHandles();
        System.out.println(windowshandle);
         Iterator<String> iterator =  windowshandle.iterator();

         //transfer Webdriver parents to child
          String parentWindow = iterator.next();
          String childWindow = iterator.next();

          driver.switchTo().window(childWindow);

        //childWindow Information
        driver.findElement(By.id("firstName")).sendKeys("Bangladesh");
        driver.findElement(By.id("lastName")).sendKeys("tom");

        //child window close
       // driver.close();

        //back to the driver in parents window
         driver.switchTo().window(parentWindow);
         driver.findElement(By.id("name")).sendKeys("im come back");



    }
}
