/**
 * @author  Sławomir Wójcik
 * @version 1.0
 */
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegulationsPage extends BasePage{

    @FindBy(xpath = "//*[@data-role='accept-consent']")
    private WebElement acceptRegulation;

    public RegulationsPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public RegulationsPage accept(){
        driver.switchTo().activeElement();
        acceptRegulation.click();
        return this;
    }
}
