package stepdefs;

import controllers.DriverController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import workflows.HomePage;
import workflows.SiteMapPage;

public class SiteMapSteps {

    private SiteMapPage siteMapPage;
    private HomePage homePage;
    private DriverController driverController;

    public SiteMapSteps(DriverController driverController){
        this.driverController = driverController;
        this.siteMapPage = new SiteMapPage(this.driverController.getDriver());
        this.homePage = new HomePage(this.driverController.getDriver());
    }

    @Given("^I access Login Page$")
    public void accessToLoginPage() {
        homePage.openLoginPage();
    }

    @Then("^I access HomePage Page$")
    public void accessToHomePage() {
        siteMapPage.openHomePage();
    }

}
