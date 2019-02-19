/**
 * @author  Sławomir Wójcik
 * @version 1.0
 */
package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {

    private Properties properties;
    private InputStream inputStream;

    public Configuration() {
        this.properties = new Properties();
    }

    public String loadConfigurationFromPropertiesFile(String key){
        try{
            inputStream = new FileInputStream("src/main/resources/config.properties");
            properties.load(inputStream);
            return properties.getProperty(key);

        }catch (IOException ex) {
            ex.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}