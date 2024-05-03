package edu.dio.collections.map.products;

import java.util.HashMap;
import java.util.Map;

/**
 * Stock
 */
public class Stock {
    private Map<Long, Product> products;

    public Stock() {
        this.products = new HashMap<>();
    }

    public void addProduct(long code, String name, double price, int amount) {
        products.put(code, new Product(name, price, amount));
    }

    public void showProducts() {
        System.out.println(products);
    }

    public double stockTotalValue() {
        double total = 0;

        if(!products.isEmpty()) {
            for (Product product : products.values()) {
                total += product.getAmount() * product.getPrice();
            }
        }

        return total;
    }

    public Product mostExpansive() {
        Product productExpansive = null;
        double price = Double.MIN_VALUE;

        if(!products.isEmpty()) {
            for (Product product : products.values()) {
                if(product.getPrice() > price) {
                    productExpansive = product;
                }
            }
        }

        return productExpansive;
    }

    public static void main(String[] args) {
        Stock stock = new Stock();

        stock.addProduct(1, "Product 1", 100, 2);
        stock.addProduct(2, "Product 2", 300, 5);
        stock.addProduct(3, "Product 3", 150, 9);

        System.out.println(stock.stockTotalValue());
        System.out.println(stock.mostExpansive());
    }
}