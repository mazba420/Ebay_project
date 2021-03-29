package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String webSite = "https://www.hyrtutorials.com/p/basic-controls.html";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        driver.get(webSite);
//        driver.findElement(By.id("firstName")).sendKeys("Mazbah");
//
//        By lastName = By.id("lastName");
//        driver.findElement(lastName).sendKeys("Ahamed");
//
//        By radioButton = By.id("femalerb");
//        driver.findElement(radioButton).click();
//
//        By lastNameText = By.xpath("//b[normalize-space()='Last Name']/self::b");
//        String lastNameTextVerify =  driver.findElement(lastName).getText();
//
//        if (lastNameTextVerify.contains("last Name")){
//            System.out.println("true text");
//        }else{
//            System.out.println("false text");
//        }
//
//
//        driver.findElement(By.linkText("Click here to navigate to the home page")).click();







    }
}
