/**
 * @author  Sławomir Wójcik
 * @version 1.0
 */
package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductListPage extends BasePage {

    @FindBy(xpath = "//div[@class='m-pagination m-pagination--left']//span[@class='m-pagination__text']")
    private WebElement countPage;

    @FindBy(xpath = "//div[@class='m-pagination m-pagination--left']//input")
    private WebElement fieldCountPage;

    @FindBy(xpath = "//div[contains(@class,'_1e83564')]//section[2]//section[@class='cb528e8']//article//div[@class='edfdbf1 ']")
    private List<WebElement> productsList;

    public ProductListPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public ProductListPage randProductPage(){
        int randomPage = random.nextInt(Integer.parseInt(countPage.getText()));
        fieldCountPage.clear();
        fieldCountPage.sendKeys(Integer.toString(randomPage)+ Keys.ENTER);
        return this;
    }

    public ProductListPage randProduct(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        moveToElementAndClick(productsList.get(random.nextInt(60)));
        return this;
    }
}
