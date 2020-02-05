package controllers;

import cucumber.api.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import utils.ReadProperties;

import java.io.File;

public class Controller {
    String browser = "";
    String url = "";
    private WebDriver driver;
    private ReadProperties systemProperties = new ReadProperties(".\\src\\test\\resources\\config\\system.properties");
    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void setupController() {
        browser = System.getProperty("browser");
//        browser = systemProperties.getPropertyValue("browser");
        url = systemProperties.getPropertyValue("url");
        if (browser == null){
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver\\chromedriver.exe");
                driver = new ChromeDriver();
        }
        else {
            switch (browser) {
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver\\geckodriver.exe");
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\drivers\\iedriver\\IEDriverServer.exe");
                    driver= new InternetExplorerDriver();
                default:
                    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver\\chromedriver.exe");
                    driver = new ChromeDriver();
            }
        }
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void teardownController(Scenario scenario) throws Exception {
        if (scenario.isFailed()){
            try {
                byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                File screenshot_with_scenario_name = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(screenshot_with_scenario_name, new File("./target/failed/" + scenario.getSourceTagNames() + " " + scenario.getName() + ".png"));
                System.out.println(scenario.getSourceTagNames());
                scenario.embed(screenshot, "image/pgn");
            } catch (WebDriverException somePlatformDontSupportScreenshots) {
                System.out.println(somePlatformDontSupportScreenshots.getMessage());
            }
        }
        if (driver != null) {
            driver.quit();
        }
    }
}
