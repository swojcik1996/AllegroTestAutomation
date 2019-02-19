/**
 * @author  Sławomir Wójcik
 * @version 1.0
 */
package models;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import providers.DriverFactory;
import utilities.Configuration;

public abstract class BaseTest {
    protected WebDriver driver;

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    @BeforeEach
    public void setUp(){
        driver = DriverFactory.getManager(new Configuration().loadConfigurationFromPropertiesFile("typeBrowser"));
        driver.manage().window().maximize();
        driver.get(new Configuration().loadConfigurationFromPropertiesFile("baseUrl"));
    }
}
