/**
 * @author  Sławomir Wójcik
 * @version 1.0
 */
package pages;

import models.Order;
import models.Product;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Configuration;

public class ProductPage extends BasePage {
    @FindBy(xpath = "//h1[@class='fb442b3f']")
    private WebElement name;

    @FindBy(xpath = "//div[@class='_7c5a1027 _578d07cf cf7a65ff']")
    private WebElement price;

    @FindBy(xpath = "//div[@class='_3def0f7a ad311378']//input")
    private WebElement quantity;

    @FindBy(xpath = "//button[@id='add-to-cart-button']")
    private WebElement addTobasket;

    @FindBy(xpath = "//button[@class='btn btn-link']")
    private WebElement continueShoppingNewProducts;

    private Order order;

    public ProductPage(WebDriver driver, Order order) {
        super(driver);
        PageFactory.initElements(driver,this);
        this.order = order;
    }

    public ProductPage continueShopping(){
        order.addProduct(new Product(name.getText(),getDecimal(price),Integer.parseInt(quantity.getAttribute("value"))));
        addTobasket.click();
        wait.until(ExpectedConditions.elementToBeClickable(continueShoppingNewProducts));
        continueShoppingNewProducts.click();
        driver.get(new Configuration().loadConfigurationFromPropertiesFile("baseUrl"));
        return this;
    }
}
