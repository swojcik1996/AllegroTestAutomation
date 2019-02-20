/**
 * @author  Sławomir Wójcik
 * @version 1.0
 */
import models.BaseTest;
import models.Order;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.*;
import utilities.Configuration;

public class Main extends BaseTest {
    private Order order;
    private RegulationsPage regulationsPage;
    private MenuPage menuPage;
    private ProductListPage productListPage;
    private ProductPage productPage;
    private Configuration configuration;
    private BasketPage basketPage;

    @BeforeEach
    public void checkoutSetup(){
        order = new Order();
        regulationsPage = new RegulationsPage(driver);
        menuPage = new MenuPage(driver);
        productListPage = new ProductListPage(driver);
        productPage = new ProductPage(driver, order);
        configuration = new Configuration();
        basketPage = new BasketPage(driver);
    }

    @Test
    public void checkoutTest(){
        regulationsPage.accept();

        for(int i=0; i < Integer.parseInt(configuration.loadConfigurationFromPropertiesFile("countProduct")); i++){
            menuPage.randomCategory();
            productListPage.randProductPage();
            productListPage.randProduct();
            productPage.continueShopping();
        }
        
        basketPage.goToBasket();
        basketPage.validateBasket();
    }
}
