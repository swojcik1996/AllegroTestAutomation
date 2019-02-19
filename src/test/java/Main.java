/**
 * @author  Sławomir Wójcik
 * @version 1.0
 */
import models.BaseTest;
import org.junit.jupiter.api.Test;
import pages.menu.MenuPage;
import pages.RegulationsPage;

public class Main extends BaseTest {

    @Test
    public void checkoutTest(){
        new RegulationsPage(driver).accept();
        new MenuPage(driver).chooseRandomCategory();
    }
}
