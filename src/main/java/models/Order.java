/**
 * @author  Sławomir Wójcik
 * @version 1.0
 */
package models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public Product getProduct(int i) {
        return products.get(i);
    }

    public void addProduct(Product productToAdd) {
        products.add(productToAdd);
    }
}
