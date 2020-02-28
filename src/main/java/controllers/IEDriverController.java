package controllers;

import org.openqa.selenium.ie.InternetExplorerDriver;
import utils.Commons.Constans;

public class IEDriverController extends DriverController {
    @Override
    protected void createDriver() {
        System.setProperty("webdriver.ie.driver", Constans.DRIVER_LOCATION + "IEDriverServer.exe");
        driver= new InternetExplorerDriver();
    }
}
