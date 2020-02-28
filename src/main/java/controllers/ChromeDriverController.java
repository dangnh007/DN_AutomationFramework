package controllers;

import org.openqa.selenium.chrome.ChromeDriver;
import utils.Commons.Constans;

public class ChromeDriverController extends DriverController {
    @Override
    protected void createDriver() {
        System.setProperty("webdriver.chrome.driver", Constans.DRIVER_LOCATION + "chromedriver.exe");
        driver = new ChromeDriver();
    }
}
