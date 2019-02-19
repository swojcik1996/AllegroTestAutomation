/**
 * @author  Sławomir Wójcik
 * @version 1.0
 */
package pages.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

import java.util.List;

public class HouseAndGardenSubPage extends BasePage {

    @FindBy(xpath = "//div[@class='_1yyhi _e8a20_2W-QV']//div[@class='_e8a20_1IYug _3kk7b _e8a20_3aPTv _e8a20_3O-It _1755t _alw8w _m44ca _e8a20_27-2B _35enf']//div//div[@class='opbox-sheet-wrapper _7qjq4 _phls7 _1yhvf _7ccvy _26e29_87AsS _26e29_WHtG1']//div//div[1]//div//div[@class='_1yyhi _fcb4d_32L_I _1ybp0 _fcb4d_G9DSe']")
    private List<WebElement> houseAndGardenList;

    public HouseAndGardenSubPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public HouseAndGardenSubPage randomSubcategory(){
        houseAndGardenList.get(random.nextInt(houseAndGardenList.size())).click();
        return this;
    }
}
