package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AmazonConcept {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println("TotalList "+linkList.size());

        for (int i = 0; i < linkList.size(); i++) {
           String text = linkList.get(i).getText();
         //  System.out.println(text);
           if (!text.isEmpty()){
               System.out.println(i+"------>"+text);

           }
        }


        for (WebElement webElement : linkList) {
          String text =  webElement.getText();
        }

       //Streams
        linkList.stream().forEach(ele ->{
            if(!ele.getText().isEmpty()){
                System.out.println(ele.getText());
            }
        });


    }
}
