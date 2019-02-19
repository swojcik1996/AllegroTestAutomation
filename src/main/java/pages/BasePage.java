/**
 * @author  Sławomir Wójcik
 * @version 1.0
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

    protected void waitForVisibilityElements(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    protected void waitForClickableElements(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    protected void moveToElement(WebElement element) {
        actions.moveToElement(element).perform();
    }
}
