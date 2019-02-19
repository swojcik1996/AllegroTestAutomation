package pages.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

import java.util.List;

public class SupermarketSubPage extends BasePage {

    @FindBy(xpath = "//div[@class='opbox-sheet-wrapper _7qjq4 _phls7 _1yhvf _7ccvy _26e29_87AsS _9huvz']//div[@class='opbox-sheet _26e29_1YmVC']//div[@data-box-name='grid']//div[@class='_1yyhi _e8a20_2W-QV']//div[@class='_e8a20_1IYug _3kk7b _e8a20_3aPTv _e8a20_3O-It _1755t _alw8w _1iuj2 _e8a20_27-2B _35enf']//div//div[@class='opbox-sheet-wrapper _7qjq4 _phls7 _1yhvf _7ccvy _26e29_87AsS _26e29_WHtG1']//div[@class='opbox-sheet _26e29_1YmVC']//div[@class='_fcb4d_3GFB3 image-tiles _fcb4d_gyp9U']")
    private List<WebElement> supermarketList;

    public SupermarketSubPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public SupermarketSubPage randomSubcategory(){
        supermarketList.get(random.nextInt(supermarketList.size())).click();
        return this;
    }
}
