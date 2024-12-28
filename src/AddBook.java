import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddBook {
    List<Contacts> Book = new ArrayList<>(); // Stores all contacts

    // Display all contacts
    public void display() {
        if (Book.isEmpty()) {
            System.out.println("No contacts to display.");
            return;
        }
        System.out.println("All Contacts:");
        for (Contacts c : Book) {
            System.out.println(c);
        }
    }

    // Edit an existing contact
    public void editContact() {
        System.out.println("Enter the first name to edit contact details:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        boolean found = false;

        for (Contacts c : Book) {
            if (c.getFirstName().equalsIgnoreCase(name)) {
                found = true;

                System.out.println("Enter New First Name:");
                c.setFirstName(sc.next());
                System.out.println("Enter New Last Name:");
                c.setLastName(sc.next());
                System.out.println("Enter New Address:");
                c.setAddress(sc.next());
                System.out.println("Enter New City:");
                c.setCity(sc.next());
                System.out.println("Enter New State:");
                c.setState(sc.next());
                System.out.println("Enter New Zip:");
                c.setZip(sc.next());
                System.out.println("Enter New Phone Number:");
                c.setPhone(sc.nextInt());
                System.out.println("Enter New Email:");
                c.setEmail(sc.next());
                System.out.println("Contact updated successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Contact name not found.");
        }
    }

    // Delete a contact
    public void deleteContact() {
        System.out.println("Enter the first name to delete contact details:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        boolean found = false;

        for (int i = 0; i < Book.size(); i++) {
            if (Book.get(i).getFirstName().equalsIgnoreCase(name)) {
                Book.remove(i);
                found = true;
                System.out.println("Contact deleted successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    // Create a new contact
    public void create() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Name:");
        String f = sc.next();
        System.out.println("Enter Last Name:");
        String l = sc.next();
        System.out.println("Enter Address:");
        String a = sc.next();
        System.out.println("Enter City:");
        String c = sc.next();
        System.out.println("Enter State:");
        String s = sc.next();
        System.out.println("Enter Zip:");
        String z = sc.next();
        System.out.println("Enter Phone Number:");
        int x = sc.nextInt();
        System.out.println("Enter Email:");
        String e = sc.next();

        Contacts c1 = new Contacts();
        c1.createContact(f, l, a, c, s, z, x, e);
        Book.add(c1);

        System.out.println("Contact added successfully!");
    }
}
