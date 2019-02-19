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

public class ElectronicSubPage extends BasePage {
    @FindBy(xpath = "//div[@class='_1yyhi _e8a20_2W-QV']//div[@class='_e8a20_1IYug _3kk7b _vnd3k _1h8s6 _1755t _1nucm _m44ca _e8a20_1Ok_X _e8a20_Bpdkd _e8a20_27-2B _35enf']//div[@class='opbox-sheet-wrapper _7qjq4 _phls7 _1yhvf _7ccvy _26e29_87AsS _9huvz _26e29_3C2Q6 _26e29_3daUY _26e29_WHtG1']//div[@class='opbox-sheet _26e29_1YmVC card _1sd8w _13i5k']//div[2]//div[@class='_1yyhi _e8a20_2W-QV _e8a20_1BFGg']//div[4]//div//div[@class=' _2508c_2ILa7 _2508c_1c8bP js-navigation-links ']//ul//li//a[not(@title='więcej kategorii')]")
    private List<WebElement> electronicList;

    public ElectronicSubPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public ElectronicSubPage randomSubcategory(){
        electronicList.get(random.nextInt(electronicList.size())).click();
        return this;
    }
}
