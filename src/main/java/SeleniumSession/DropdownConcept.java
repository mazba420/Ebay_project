package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropdownConcept {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String webSite = "https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(webSite);

       WebElement course = driver.findElement(By.id("course"));
        Select select = new Select(course);
       // select.selectByIndex(1);
        //select.selectByValue("java");
        //select.selectByVisibleText("Python");
       // List<WebElement> all_option =  select.getOptions();
        WebElement ide_Names = driver.findElement(By.id("ide"));
        Select ideName_dd = new Select(ide_Names);
        ideName_dd.selectByIndex(0);
        ideName_dd.selectByValue("ij");
        ideName_dd.selectByVisibleText("Visual Studio");

        Thread.sleep(3000);

        //ideName_dd.deselectByIndex(1);
        //ideName_dd.deselectAll();

        List<WebElement> all_option =  select.getOptions();
        System.out.println("courses avaiable");

        for (WebElement course_List : all_option) {
            System.out.println(course_List.getText());

        }

        List<WebElement> all_option_for_IDE =  ideName_dd.getOptions();
        System.out.println("IDE LIST..............");

        for (WebElement webElement : all_option_for_IDE) {
            System.out.println(webElement.getText());
        }


    }
}
