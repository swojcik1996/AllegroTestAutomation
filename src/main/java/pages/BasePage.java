/**
 * @author  Sławomir Wójcik
 * @version 1.0
 */
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.math.BigDecimal;
import java.util.Random;

public abstract class BasePage {
    public WebDriver driver;
    protected WebDriverWait wait;
    private Actions actions;
    protected Random random;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
        this.actions = new Actions(driver);
        this.random = new Random();
    }

    protected void moveToElement(WebElement element) {
        actions.moveToElement(element).perform();
    }

    protected void moveToElementAndClick(WebElement element) {
        actions.moveToElement(element).click().perform();
    }

    protected BigDecimal getDecimal(WebElement element){
        return new BigDecimal( element.getText().replace("zł","").replace(",",".").replace(" ","").trim());
    }
}
