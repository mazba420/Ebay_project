package SeleniumSession;

import Util.BrowserUtil;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FindElementConcept {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

//     List<WebElement> element = driver.findElements(By.tagName("a"));
//        System.out.println("Total link_list "+element.size());

//        for (int i = 0; i <element.size() ; i++) {
//           String link_name = element.get(i).getText();
//           if (!link_name.isEmpty());
//            System.out.println(i+"==>>>>>>"+link_name);
//        }

//
//        for (WebElement webElement : element) {
//            System.out.println(webElement.getText());
//        }


       String aaaa =  driver.findElement(By.id("nav-logo-sprites")).getText();
        System.out.println(aaaa);


       // Select select = new Select();
        driver.switchTo().defaultContent();

        Actions actions = new Actions(driver);
        actions.contextClick().perform();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);




                  By email =  By.id("username");
                  By pass =By.id("pass");
                  By login = By.id("loginbtn");
              WebDriverWait wait = new WebDriverWait(driver,10);
              WebElement element_email = wait.until(ExpectedConditions.presenceOfElementLocated(email));
              element_email.sendKeys("test@gmail.com");

              driver.findElement(pass).sendKeys("abcs");



    }





}
