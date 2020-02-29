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
import utils.Commons.Property;
import utils.Commons.ReadProperties;

import java.io.File;

<<<<<<< HEAD:src/main/java/controllers/Controller.java

public class Controller {
    String url = "";
    private WebDriver driver;
    private ReadProperties systemProperties = new ReadProperties(".\\src\\test\\resources\\config\\system.properties");
=======
public class Controller {
    String url = "";
    private WebDriver driver;
    private Property systemProperties = new Property(Constans.SYSTEM_PROPERTIES_LOCATION);
>>>>>>> parent of deaaf8a... Completed:src/main/java/controllers/DriverController.java
    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

<<<<<<< HEAD:src/main/java/controllers/Controller.java

=======
>>>>>>> parent of deaaf8a... Completed:src/main/java/controllers/DriverController.java
    /***
     * Day la commit 1 and 2
     */

    public void setupController() {
        url = systemProperties.getPropertyValue("url");
<<<<<<< HEAD:src/main/java/controllers/Controller.java
        String rootFolder = System.getProperty("user.dir");
            switch (Property.getDefaultBrowser()) {
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", rootFolder + "\\resources\\drivers\\geckodriver.exe");
                    System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
                    System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, rootFolder + "\\FireFoxLogs.txt");
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    System.setProperty("webdriver.ie.driver", rootFolder + "\\resources\\drivers\\IEDriverServer.exe");
                    driver= new InternetExplorerDriver();
                    break;
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", rootFolder + "\\resources\\drivers\\chromedriver.exe");
=======
            switch (Property.getDefaultBrowser()) {
                case "firefox":
                    System.setProperty("webdriver.gecko.driver", Constans.DRIVER_LOCATION + "geckodriver.exe");
                    System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
                    System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, Constans.ROOT_LOCATION + "\\FireFoxLogs.txt");
                    driver = new FirefoxDriver();
                    break;
                case "ie":
                    System.setProperty("webdriver.ie.driver", Constans.DRIVER_LOCATION + "IEDriverServer.exe");
                    driver= new InternetExplorerDriver();
                    break;
                case "chrome":
                    System.setProperty("webdriver.chrome.driver", Constans.DRIVER_LOCATION + "chromedriver.exe");
>>>>>>> parent of deaaf8a... Completed:src/main/java/controllers/DriverController.java
                    driver = new ChromeDriver();
                    break;
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
