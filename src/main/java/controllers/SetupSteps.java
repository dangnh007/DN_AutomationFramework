package controllers;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import utils.Commons.Constans;
import utils.Commons.Property;
import utils.Commons.ReadProperties;

public class SetupSteps {
    private DriverController driverController;
    WebDriver driver;
    private ReadProperties systemProperties = new ReadProperties(Constans.SYSTEM_PROPERTIES_LOCATION);
    String url = "";

    @Before
    public void setup() {
        url = systemProperties.getPropertyValue("url");
        driverController = DriverControllerFactory.getBrowserDriver(Property.getDefaultBrowser());
        driver = driverController.getDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    @After
    public void teardown(Scenario scenario) throws Exception {
        driverController.teardownController(scenario);
    }
}