package com.cg.Enumeration;
import java.util.Hashtable;

import java.util.Enumeration;

class Contact {
    String name;
    int phoneNumber;
    String address;

    public Contact(String name, int phoneNumber, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
    }

}

public class ContactManager {
    Hashtable<String, Contact> contactTable = new Hashtable<>();

    public void addContact(String email, String name, int phoneNumber, String address) {
        Contact c = new Contact(name, phoneNumber, address);
        contactTable.put(email, c);
        System.out.println("Contact added: " + c);
    }

    public void getContact(String email) {
        Contact contact = contactTable.get(email);
        if (contact != null) {
            System.out.println(contact);
        } else {
            System.out.println("Contact not found for email: " + email);
        }
    }

    public void updateContact(String email, String name, int phoneNumber, String address) {
        if (contactTable.containsKey(email)) {
            Contact c = new Contact(name, phoneNumber, address);
            contactTable.put(email, c);
            System.out.println("Contact updated: " + c);
        } else {
            System.out.println("Contact not found for email: " + email);
        }
    }

    public void deleteContact(String email) {
        if (contactTable.remove(email) != null) {
            System.out.println("Contact deleted for email: " + email);
        } else {
            System.out.println("Contact not found for email: " + email);
        }
    }

    public void listContacts() {
        Enumeration<String> emails = contactTable.keys();
        while (emails.hasMoreElements()) {
            String email = emails.nextElement();
            System.out.println(email + ": " + contactTable.get(email));
        }
    }

    public static void main(String[] args) {
        ContactManager cm = new ContactManager();

        cm.addContact("aarti@gmail.com", "Aarti Swami", 888800711, "Maharashtra");
        cm.addContact("swami@gmail.com", "swami aa", 999900012, "Delhi");

        cm.getContact("aarti@gmail.com");

       // cm.updateContact("aarti@gmail.com", "Aarti Sharma", 888800712, "Maharashtra Updated");
        
        //cm.deleteContact("swami@gmail.com");
        
        cm.listContacts();
    }
}
