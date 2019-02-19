/**
 * @author  Sławomir Wójcik
 * @version 1.0
 */
package providers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static WebDriver getManager(String type) {

        WebDriver driver = null;

        switch (type) {
            case "CHROME":
                driver = new ChromeDriver();
                break;
            case "FIREFOX":
                driver = new FirefoxDriver();
                break;
            case "IE":
                driver = new EdgeDriver();
                break;
        }
        return driver;
    }
}
