package pages.menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

import java.util.List;

public class MenuPage extends BasePage {

    @FindBy(xpath = "//div[@class='_882d6_1Ba5t']//div[@class='_r5ckd _882d6_cQRcd']")
    private List<WebElement> menuList;

    public MenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public MenuPage chooseRandomCategory(){

        int randomCategory = 1;
        menuList.get(randomCategory).click();

        switch (randomCategory){
            case 0:
                new ElectronicSubPage(driver).randomSubcategory();
                break;
            case 1:
                new FashionSubPage(driver).randomSubcategory();
                break;
            case 2:
                new HouseAndGardenSubPage(driver).randomSubcategory();
                break;
            default:
                System.out.println("Incorrect category!");
                break;
        }
        return this;
    }
}
