/**
 * @author  Sławomir Wójcik
 * @version 1.0
 */
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BasePage {
    @FindBy(xpath = "//h1[@class='fb442b3f']")
    private WebElement name;

    @FindBy(xpath = "//div[@class='_7c5a1027 _578d07cf cf7a65ff']")
    private WebElement price;

    @FindBy(xpath = "//div[@class='_3def0f7a ad311378']//input")
    private WebElement quantity;

    @FindBy(xpath = "//button[@id='add-to-cart-button']")
    private WebElement addTobasket;

    @FindBy(xpath = "//div[@id='modal-footer_I9K2diEIAl']")
    private WebElement dialogGoToBasket;

    public ProductPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public ProductPage addToBasket(){
        System.out.println(name.getText());
        System.out.println(price.getText());
        System.out.println(quantity.getAttribute("value"));
        addTobasket.click();
        return this;
    }
}
