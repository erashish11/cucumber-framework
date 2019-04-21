package driverconfig;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.concurrent.TimeUnit;


public class Drivers {

    public static Logger log = LogManager.getLogger(Drivers.class);
    public WebDriver driver;
    String browserType = "chrome";
    String headless =  "false" ;
    public WebDriver getWebDriver() {
        if (driver == null || driver.toString().contains("null")) {
            driver = getDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.manage().timeouts().setScriptTimeout(50, TimeUnit.SECONDS);
            log.info("Browser is opened in the maximized state");
            return driver;
        }
        return driver;
    }

    public WebDriver getDriver() {
        if (browserType.equalsIgnoreCase("chrome") ) {
            ChromeOptions options = new ChromeOptions();
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/drivers/chromedriver.exe");
            options.setAcceptInsecureCerts(true);
            options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
            if (headless.equalsIgnoreCase("true")){
                options.addArguments("--headless");
            }
            driver = new ChromeDriver(options);
            return driver;
        }
         return driver;
    }
}
