/**
 * @author  Sławomir Wójcik
 * @version 1.0
 */
import models.BaseTest;
import models.Order;
import org.junit.jupiter.api.Test;
import pages.ProductListPage;
import pages.menu.MenuPage;
import pages.RegulationsPage;

public class Main extends BaseTest {

    @Test
    public void checkoutTest(){
        Order order = new Order();

        new RegulationsPage(driver).accept();
        new MenuPage(driver).chooseRandomCategory();

        new ProductListPage(driver).randProductPage().randProduct();
    }
}
