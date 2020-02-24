package utils.Commons;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
    String location;
    public ReadProperties(String location) {
        this.location = location;
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
