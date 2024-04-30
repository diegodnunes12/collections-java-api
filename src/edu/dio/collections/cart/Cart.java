package edu.dio.collections.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items;

    public Cart() {
        this.items = new ArrayList<>();
    }
    
    private void addItem(String name, double price, int amount) {
        Item item = new Item(name, price, amount);

        items.add(item);
    }

    private void removeItem(String name) {
        List<Item> forRemove = new ArrayList<>();

        for (Item item : items) {
            if(item.getName().equalsIgnoreCase(name)) {
                forRemove.add(item);
            }
        }

        items.removeAll(forRemove);
    }

    private void showItems() {
        for (Item item : items) {
            System.out.println(item.toString());
        }
    }

    private void totalPrice() {
        double value = 0;

        for (Item item : items) {
            value += item.getPrice() * item.getAmount();
        }

        System.out.println("Total value: " + value);
    }

    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.addItem("Produto 1", 500, 2);
        cart.addItem("Produto 2", 300, 1);
        cart.addItem("Produto 3", 100, 1);

        cart.removeItem("Produto 3");

        cart.showItems();

        cart.totalPrice();
    }
}
