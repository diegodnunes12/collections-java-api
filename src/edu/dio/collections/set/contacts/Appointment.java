package edu.dio.collections.set.contacts;

import java.util.HashSet;
import java.util.Set;

public class Appointment {
    private Set<Contact> contacts;

    public Appointment() {
        this.contacts = new HashSet<>();
    }

    public void addContact(String name, int number) {
        contacts.add(new Contact(name, number));
    }

    public void showContacts() {
        System.out.println(contacts);
    }

    public Set<Contact> searchName(String name) {
        Set<Contact> contactsByName = new HashSet<>();

        for (Contact contact : contacts) {
            if(contact.getName().startsWith(name)) {
                contactsByName.add(contact);
            }
        }

        return contactsByName;
    }

    public Contact updateContact(String name, int number) {
        Contact contactUpdated = null;

        for (Contact contact : contacts) {
            if(contact.getName().equalsIgnoreCase(name)) {
                contact.setNumber(number);
                contactUpdated = contact;
                break;
            }
        }

        return contactUpdated;
    }

    public static void main(String[] args) {
        Appointment appointment = new Appointment();

        appointment.addContact("Diego 1", 12345);
        appointment.addContact("Diego 2", 12346);
        appointment.addContact("Diego 3", 12347);
        appointment.addContact("Diego 4", 12348);

        appointment.showContacts();

        System.out.println(appointment.searchName("Diego 1"));
        System.out.println(appointment.updateContact("Diego 1", 33333));

        appointment.showContacts();
    }
}
