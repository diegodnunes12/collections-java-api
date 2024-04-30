package edu.dio.collections.products;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Register {
    private Set<Product> products;

    public Register() {
        this.products = new HashSet<>();
    }

    public void addProduct(long code, String name, double price, int amount) {
        products.add(new Product(name, code, price, amount));
    }

    public Set<Product> showProductByName() {
        Set<Product> productsByName = new TreeSet<>(products);

        return productsByName;
    }

    public Set<Product> showProductByPrice() {
        Set<Product> productsByPrice = new TreeSet<>(new ComparatorByPrice());
        productsByPrice.addAll(products);

        return productsByPrice;
    }

    public static void main(String[] args) {
        Register register = new Register();

        register.addProduct(1, "product 1", 20, 5);
        register.addProduct(2, "product 2", 50, 15);
        register.addProduct(4, "product 3", 60, 55);
        register.addProduct(6, "product 4", 30, 15);

        System.out.println(register.showProductByName());
        System.out.println(register.showProductByPrice());
    }
}
