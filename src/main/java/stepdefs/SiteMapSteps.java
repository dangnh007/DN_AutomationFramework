package stepdefs;

import controllers.DriverController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import workflows.HomePage;
import workflows.SiteMapPage;

public class SiteMapSteps {

    private SiteMapPage siteMapPage;
    private HomePage homePage;
    private DriverController controller;

    public SiteMapSteps(DriverController controller){
        this.controller = controller;
        this.siteMapPage = new SiteMapPage(this.controller.getDriver());
        this.homePage = new HomePage(this.controller.getDriver());
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
