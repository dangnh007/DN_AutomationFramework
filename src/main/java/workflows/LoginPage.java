package workflows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

    private final WebDriver driver;
    WebElement accountBtn;
    WebElement loginBtn;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        this.accountBtn = driver.findElement(By.xpath("//span[contains(text(),'Account')]"));
        this.loginBtn = driver.findElement(By.xpath("//a[contains(text(),'Log In')]"));
    }

    public void clickOnAccountDropdown(){
        accountBtn.click();
    }
    public void clickOnLoginButton(){
        loginBtn.click();
    }

}
