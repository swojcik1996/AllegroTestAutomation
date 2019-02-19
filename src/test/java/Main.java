/**
 * @author  Sławomir Wójcik
 * @version 1.0
 */
import models.BaseTest;
import models.Order;
import models.Product;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.ProductListPage;
import pages.ProductPage;
import pages.menu.MenuPage;
import pages.RegulationsPage;

import java.math.BigDecimal;

public class Main extends BaseTest {
    private Order order;
    private RegulationsPage regulationsPage;
    private MenuPage menuPage;
    private ProductListPage productListPage;
    private ProductPage productPage;

    @BeforeEach
    public void checkoutSetup(){
        order = new Order();
        regulationsPage = new RegulationsPage(driver);
        menuPage = new MenuPage(driver);
        productListPage = new ProductListPage(driver);
        productPage = new ProductPage(driver);
    }

    @Test
    public void checkoutTest(){
        regulationsPage.accept();

        menuPage.chooseRandomCategory();
        productListPage.randProductPage().randProduct();
        productPage.addToBasket();

       // Product product = new Product("test",new BigDecimal(22), 2,new BigDecimal(44));
    }
}
