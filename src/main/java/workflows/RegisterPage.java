package workflows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageUIs.RegisterPageUI;
import utils.Commons.AbstractPage;

public class RegisterPage extends AbstractPage {

    public RegisterPage(WebDriver driver){
        super(driver);
    }

    public void clickOnAccountDropdown() {
        clickToElement(RegisterPageUI.ACCOUNT_BTN);
    }

    public void clickOnRegisterButton(){
        clickToElement(RegisterPageUI.REGISTER_BTN);
    }
}
