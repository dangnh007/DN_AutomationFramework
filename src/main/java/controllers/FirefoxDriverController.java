package controllers;

import org.openqa.selenium.firefox.FirefoxDriver;
import utils.Commons.Constans;

public class FirefoxDriverController extends DriverController {
    @Override
    protected void createDriver() {
        System.setProperty("webdriver.gecko.driver", Constans.DRIVER_LOCATION + "geckodriver.exe");
        System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, Constans.ROOT_LOCATION + "\\FireFoxLogs.txt");
        driver = new FirefoxDriver();
    }
}
