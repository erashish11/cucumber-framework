package actions;

import driverconfig.Drivers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class UIActions  {


    Drivers drivers = new Drivers();

    public WebDriver getBrowser() throws Exception {
        return drivers.getWebDriver();

    }


    public WebElement find(By locator) throws Exception {
        return getBrowser().findElement(locator);

    }

    public void navigateTO(String URL) throws Exception {
        getBrowser().get(URL);


    }
}
