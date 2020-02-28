package stepdefs;

import controllers.DriverController;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import workflows.RegisterPage;

public class RegisterSteps {
    private final RegisterPage registerPage;
    private final DriverController controller;

    public RegisterSteps(DriverController controller){
        this.controller = controller;
        registerPage = new RegisterPage(this.controller.getDriver());
    }

    @When("^I access to Register Function$")
    public void gotoRegisterPage(){
        registerPage.clickOnAccountDropdown();
        registerPage.clickOnRegisterButton();
    }

    @Then("^I register$")
    public void iRegister(){
    }

    @Then("^I access SiteMap Page$")
    public void accessToSiteMapPage() {
        registerPage.openSiteMapPage();
    }
}
