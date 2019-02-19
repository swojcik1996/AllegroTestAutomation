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

public class MenuPage extends BasePage {

    @FindBy(xpath = "//div[@class='_882d6_1Ba5t']//div[@class='_r5ckd _882d6_cQRcd']")
    private List<WebElement> menuList;

    public MenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public MenuPage chooseRandomCategory(){

        int randomCategory = 0;
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
            case 3:
                System.out.println("Supermarket");
                break;
            case 4:
                System.out.println("Dziecko");
                break;
            case 5:
                System.out.println("Uroda");
                break;
            case 6:
                System.out.println("Zdrowie");
                break;
            case 7:
                System.out.println("Kultura i Rozrywka");
                break;
            case 8:
                System.out.println("Sport i turystyka");
                break;
            case 9:
                System.out.println("Motoryzacja");
                break;
            case 10:
                System.out.println("Ogłoszenia i usługi");
                break;
            case 11:
                System.out.println("Kolekcje i sztuka");
                break;
            case 12:
                System.out.println("Firma");
                break;
            default:
                System.out.println("Incorrect category!");
                break;
        }
        return this;
    }
}
