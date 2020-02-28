package controllers;

public class DriverControllerFactory {

    public static DriverController getBrowserDriver(String browser) {
        DriverController driverController;
        switch (browser) {
            case "firefox":
                driverController = new FirefoxDriverController();
                break;
            case "ie":
                driverController = new IEDriverController();
                break;
            default:
                driverController = new ChromeDriverController();
                break;
        }
        return driverController;
    }
}
