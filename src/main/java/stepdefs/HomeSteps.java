package stepdefs;

import controllers.DriverController;
import workflows.HomePage;

public class HomeSteps {
    private final DriverController controller;
    private final HomePage homePage;

    public HomeSteps(DriverController controller){
        this.controller = controller;
        this.homePage = new HomePage(this.controller.getDriver());
    }
}
