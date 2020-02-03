package stepdefs;

import controllers.Controller;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
    Controller controller;

    public LoginSteps(Controller controller){
        this.controller = controller;
    }

    @When("^I access to Login Function$")
    public void goToLoginPage(){
        System.out.println("I am Dang");
    }

    @Then("^I login$")
    public void login(){
        System.out.println("Then I login");
    }
}
