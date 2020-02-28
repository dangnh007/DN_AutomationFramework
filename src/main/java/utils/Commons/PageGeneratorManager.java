package utils.Commons;

import org.openqa.selenium.WebDriver;
import workflows.HomePage;
import workflows.LoginPage;
import workflows.RegisterPage;
import workflows.SiteMapPage;

public class PageGeneratorManager {

    public static HomePage getHomePage (WebDriver driver) {
        return new HomePage(driver);
    }

    public static LoginPage getLoginPage (WebDriver driver) {
        return new LoginPage(driver);
    }

    public static RegisterPage getRegisterPage (WebDriver driver) {
        return new RegisterPage(driver);
    }

    public static SiteMapPage getSiteMapPage (WebDriver driver) {
        return new SiteMapPage(driver);
    }
}
