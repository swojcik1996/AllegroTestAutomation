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

public class FashionSubPage extends BasePage {

    @FindBy(xpath = "//div[@class='_e8a20_1IYug _3kk7b _e8a20_3aPTv _e8a20_3O-It _fdr6w _umw2u _n7a9y _35enf']//div[1]//div[@class='opbox-sheet-wrapper _7qjq4 _phls7 _1yhvf _7ccvy _26e29_87AsS _9huvz']//div[@class='opbox-sheet _26e29_1YmVC card _1sd8w _13i5k']//div[2]//div[@class='_fcb4d_3GFB3 image-tiles _fcb4d_5nMNz']//div[@class='_1yyhi _fcb4d_32L_I']//div[@class='_3kk7b _fcb4d_39F9a _vnd3k _1yzj2 _n1rmb _1nucm _1iuj2']")
    private List<WebElement> sexType;

    @FindBy(xpath = "//div[@class='opbox-sheet-wrapper _7qjq4 _phls7 _1yhvf _7ccvy _26e29_87AsS _9huvz']//div[@class='opbox-sheet _26e29_1YmVC card _1sd8w _13i5k _1bwbg']//div[2]//div[@class=' _2508c_2ILa7 _2508c_1c8bP js-navigation-links ']//ul//li")
    private List<WebElement> fashionSubList;


    public FashionSubPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public FashionSubPage randomSubcategory(){
        sexType.get(random.nextInt(sexType.size())).click();

        fashionSubList.get(random.nextInt(fashionSubList.size())).click();
        return this;
    }
}
