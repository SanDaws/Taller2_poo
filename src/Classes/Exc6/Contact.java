package Classes.Exc6;

import java.util.ArrayList;
import java.util.List;

class Contact {
    // Attributes
    private String name;
    private String phone;
    private String email;

    // Constructor
    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // toString method to print contact details
    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}

class AddressBook {
    // List to hold contacts
    private List<Contact> contacts;

    // Constructor
    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    // Method to add a contact
    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added: " + contact.getName());
    }

    // Method to remove a contact by name
    public void removeContact(String name) {
        Contact contactToRemove = findContactByName(name);
        if (contactToRemove != null) {
            contacts.remove(contactToRemove);
            System.out.println("Contact removed: " + name);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    // Method to find a contact by name
    public Contact findContactByName(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                return contact;
            }
        }
        return null; // Returns null if no contact is found
    }

    // Method to display all contacts
    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("The address book is empty.");
        } else {
            System.out.println("Contacts in the Address Book:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
}

