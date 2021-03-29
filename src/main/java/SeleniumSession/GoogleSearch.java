package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GoogleSearch {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String webSite = "https://www.google.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(webSite);
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("testing");
      List<WebElement> seleniumOption = driver.findElements(By.xpath("//ul[@class='erkvQe']//li"));

        for (WebElement webElement : seleniumOption) {
          String option =  webElement.getText();
          if (option.equalsIgnoreCase("selenium vitamin")){
              webElement.click();
              break;
          }
        }


        GoogleSearch.googleSearch(seleniumOption,"testing mom");

    }

    public static void googleSearch(List<WebElement> option , String value){

        for (WebElement webElement : option) {
          String allOption =  webElement.getText();
          if (allOption.equalsIgnoreCase(value)){
              webElement.click();
              break;
          }
        }


    }



}
