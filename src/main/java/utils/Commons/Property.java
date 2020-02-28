package utils.Commons;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class Property {
    String location;
    private static final int DEFAULT_WAIT = 5;
    private static String DEFAULT_BROWSER = "chrome";

    public Property(String location) {
        this.location = location;
    }

    /**
     * Gets the maximum wait time the application should wait until an element is present/visible/etc. This default
     * to 5, unless otherwise provided via cmd
     *
     * @return int - the maximum number of seconds to wait
     */
    public static int getDefaultWait() {
        if (System.getProperty("default.wait") != null) {
            try {
                return Integer.valueOf(System.getProperty("default.wait"));
            } catch (Exception e) {
                return DEFAULT_WAIT;
            }
        }
        return DEFAULT_WAIT;
    }

    /**
     * Gets browser. The default is Chrome
     * unless otherwise provided via cmd
     */
    public static String getDefaultBrowser() {
        String browser = System.getProperty("browser");
        if (browser != null) {
            try {
                switch (browser) {
                    case "firefox":
                        DEFAULT_BROWSER = "firefox";
                        break;
                    case "ie":
                        DEFAULT_BROWSER = "ie";
                        break;
                }
            } catch (Exception e) {
                return DEFAULT_BROWSER;
            }
        }
        return DEFAULT_BROWSER;
    }

    public String getPropertyValue(String key){
        Properties prop = new Properties();
        try {
            InputStream input = new FileInputStream(location);
            prop.load(input);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}
