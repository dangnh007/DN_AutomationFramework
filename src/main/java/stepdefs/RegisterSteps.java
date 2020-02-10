package stepdefs;

import controllers.Controller;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jdk.jfr.Description;
import workflows.RegisterPage;

public class RegisterSteps {
    RegisterPage registerPage;
    Controller controller;

    public RegisterSteps(Controller controller){
        this.controller = controller;
        registerPage = new RegisterPage(this.controller.getDriver());
    }
    @Description("Test 123212312312313")
    @When("^I access to Register Function$")
    public void gotoRegisterPage(){
        registerPage.clickOnAccountDropdown();
    }

    @Then("^I register$")
    public void iRegister(){
        registerPage.clickOnRegisterButton();
    }
}
