package edu.dio.collections.set.products;

import java.util.Comparator;

public class Product implements Comparable<Product> {
    private String name;
    private long code;
    private double price;
    private int amount;

    public Product(String name, long code, double price, int amount) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.amount = amount;
    }

    @Override
    public int compareTo(Product product) {
        return name.compareToIgnoreCase(product.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (code ^ (code >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (code != other.code)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", code=" + code + ", price=" + price + ", amount=" + amount + "]";
    }
}

class ComparatorByPrice implements Comparator<Product> {

    @Override
    public int compare(Product arg0, Product arg1) {
        return Double.compare(arg0.getPrice(), arg1.getPrice());
    }

}
