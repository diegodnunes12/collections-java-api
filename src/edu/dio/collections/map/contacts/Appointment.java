package edu.dio.collections.map.contacts;

import java.util.HashMap;
import java.util.Map;

public class Appointment {
    private Map<String, Integer> contacts;

    public Appointment() {
        this.contacts = new HashMap<>();
    }

    public void addContact(String name, Integer phone) {
        contacts.put(name, phone);
    }

    public void removeContact(String name) {
        if(!contacts.isEmpty()) {
            contacts.remove(name);
        } 
    }

    public void showContacts() {
        System.out.println(contacts);
    }

    public Integer searchByName(String name) {
        Integer phone = null;

        if(!contacts.isEmpty()) {
            phone = contacts.get(name);
        } 

        return phone;
    }

    public static void main(String[] args) {
        Appointment appointment = new Appointment();

        appointment.addContact("Diego 1", 1111);
        appointment.addContact("Diego 2", 2222);
        appointment.addContact("Diego 3", 3333);
        appointment.addContact("Diego 4", 4444);

        appointment.showContacts();

        appointment.removeContact("Diego 2");

        appointment.showContacts();

        System.out.println(appointment.searchByName("Diego 3"));
    }
}
