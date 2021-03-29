package SeleniumSession;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumAlertConcept {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String webSite = "https://www.hyrtutorials.com/p/alertsdemo.html";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(webSite);

        //simple_alert
//        driver.findElement(By.id("alertBox")).click();
//        Thread.sleep(3000);
//        Alert alert =   driver.switchTo().alert();
//        System.out.println(alert.getText());
//        alert.dismiss();

        //Confirmations_Alert
        driver.findElement(By.id("confirmBox")).click();
        Thread.sleep(3000);
        Alert alert_confirm =   driver.switchTo().alert();
        System.out.println(alert_confirm.getText());
        alert_confirm.accept();


        //Promt_Alert
        driver.findElement(By.id("promptBox")).click();
        Thread.sleep(3000);
        Alert promt_confirm =   driver.switchTo().alert();
        System.out.println(promt_confirm.getText());
        promt_confirm.sendKeys("My name is tommy");
        promt_confirm.accept();



    }
}
