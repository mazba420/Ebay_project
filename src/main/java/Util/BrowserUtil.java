package Util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
    private WebDriver driver;

    /**
     * This method is used to launch browser
     * @param browserName
     * @return this returns driver
     */
    public WebDriver init_driver(String browserName ){

        if (browserName.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if(browserName.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else {
            System.out.println("you pass wrong browser name "+browserName);
        }
        return driver ;
    }

    /**
     * This is used to launch Url
     * @param url
     */
    public void launchUrl(String url){
        driver.get(url);
    }

    /**
     * This Method is used to get page Tile
     * @return
     */
    public String getPageTile(){
        return  driver.getTitle();

    }

    /**
     * This Method is used to get Page source
     * @return pagesource
     */
    public String getPageSource(){
        return driver.getPageSource();
    }

    /**
     * This Method is used to get CurrentPageUrl
     * @return
     */
    public String getCurrentUrl(){
        return driver.getCurrentUrl();

    }

    /**
     * This Method is Used to Any page refresh
     */
    public void pageRefresh(){
        driver.navigate().refresh();
    }

    /**
     * This is used to go next Url.
     * @param url
     */
    public void navigateNextUrl(String url){
        driver.navigate().to(url);
    }

    /**
     * This Method used to Forward Url
     */
    public void navigateForwardUrl(){
        driver.navigate().forward();
    }

    /**
     * This method used to go back
     */
    public void navigateBack(){
        driver.navigate().back();
    }

    /**
     * This Method use for close Browser
     */
    public void close(){
        driver.close();
    }

    /**
     * This Method used for quite any browser
     */
    public void quite(){
        driver.quit();
    }





}
