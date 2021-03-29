package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class XpathConcept {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String webSite = "https://finance.yahoo.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(webSite);

      WebElement market = driver.findElement(By.xpath("//a[normalize-space()='Markets']/self::a"));

        Actions actions = new Actions(driver);
        actions.moveToElement(market).build().perform();
        driver.findElement(By.xpath("//a[text()='Stocks: Losers']")).click();
        driver.findElement(By.xpath("(//label[@class='Ta(c) Pos(r) Va(tb) Pend(5px) D(n)--print'])[3]")).click();






    }
}
