/**
 * @author  Sławomir Wójcik
 * @version 1.0
 */
package models;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;
    private int quantity;
    private BigDecimal totalPrice;

    public Product(String name, BigDecimal price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.totalPrice = price.multiply(new BigDecimal(quantity));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
