package utils.Commons;

public class Property {

    private static final int DEFAULT_WAIT = 5;
    private static String DEFAULT_BROWSER = "chrome";

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
}
