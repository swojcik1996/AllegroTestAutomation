/**
 * @author  Sławomir Wójcik
 * @version 1.0
 */
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasketPage extends BasePage {

    @FindBy(xpath = "//div[@class='_ourew _1bo4a _sm3us _1241k']")
    private WebElement basket;

    @FindBy(xpath = "//section[@class='m-card m-margin-top-16']")
    private List<WebElement> products;

    public BasketPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public BasketPage goToBasket(){
        basket.click();
        return this;
    }

    public BasketPage validateBasket(){
        System.out.println(products.size());

        return this;
    }
}
