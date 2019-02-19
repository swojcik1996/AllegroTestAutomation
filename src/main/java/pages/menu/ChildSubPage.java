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

public class ChildSubPage extends BasePage {

    @FindBy(xpath = "//div[@class='opbox-sheet _26e29_1YmVC card _1sd8w _13i5k _1bwbg']//div//div[@class=' _2508c_2ILa7 _2508c_1c8bP js-navigation-links ']//ul[@class='_2508c_210Xp _2508c_3jx28 _3a4zn _1sql3 _1rj80 _ourew _12vfa']//li[@class='_1bmp9 _1tq4i _ourew  ']")
    private List<WebElement> childList;

    public ChildSubPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public ChildSubPage randomSubcategory(){
        childList.get(random.nextInt(childList.size())).click();
        return this;
    }
}
