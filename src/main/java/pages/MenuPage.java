/**
 * @author  Sławomir Wójcik
 * @version 1.0
 */
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MenuPage extends BasePage {

    @FindBy(xpath = "//div[@class='_882d6_1Ba5t']//div[@class='_r5ckd _882d6_cQRcd']")
    private List<WebElement> category;

    @FindBy(xpath = "//div[@class='_882d6_1HSgB']//div//div[@class='opbox-sheet-wrapper _7qjq4 _phls7 _1yhvf _7ccvy _26e29_87AsS']//div[@class='opbox-sheet _26e29_1YmVC']//div//div[@class='_1yyhi _e8a20_2W-QV _e8a20_1BFGg']//div[@class='_e8a20_1IYug _3kk7b _vnd3k _1plx6']//div//div[@class='_1yyhi _e8a20_2W-QV']//div[@class='_e8a20_1IYug _3kk7b _vnd3k _35enf']//div//div[@class='_1yyhi _e8a20_2W-QV']//div[@class='_e8a20_1IYug _3kk7b _1h80j _35enf']//div//div[@class=' _2508c_1EK8h _2508c_1c8bP js-navigation-links ']//ul[@class='_2508c_210Xp _2508c_3jx28 _3a4zn _1sql3 _1rj80 _ourew _12vfa']//li[@class='_1bmp9 _1tq4i _ourew  ']//ul[@class=' _2508c_3jx28 _3a4zn _12vfa ']//li[@class='_1bmp9 _1tq4i _ourew  ']")
    private List<WebElement> subcategory;

    public MenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public MenuPage randomCategory(){
        moveToElement(category.get(random.nextInt(category.size())));
        wait.until(ExpectedConditions.visibilityOfAllElements(subcategory));
        moveToElementAndClick(subcategory.get(random.nextInt(subcategory.size())));
        return this;
    }
}
