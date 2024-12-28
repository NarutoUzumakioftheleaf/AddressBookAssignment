import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookSystem {
    private final Map<String, AddBook> addressBooks = new HashMap<>();

    public void addAddressBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a unique name for the Address Book:");
        String name = sc.nextLine();

        if (addressBooks.containsKey(name)) {
            System.out.println("An Address Book with this name already exists. Try a different name.");
        } else {
            addressBooks.put(name, new AddBook());
            System.out.println("Address Book '" + name + "' has been added.");
        }
    }

    public void selectAndOperateAddressBook() {
        if (addressBooks.isEmpty()) {
            System.out.println("No Address Books available. Please create one first.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Available Address Books: " + addressBooks.keySet());
        System.out.println("Enter the name of the Address Book you want to access:");
        String name = sc.nextLine();

        AddBook selectedBook = addressBooks.get(name);
        if (selectedBook == null) {
            System.out.println("No Address Book found with the name '" + name + "'.");
        } else {
            operateOnAddressBook(selectedBook);
        }
    }

    private void operateOnAddressBook(AddBook book) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter 1 to create contact, 2 to display all contacts, 3 to update contact details, 4 to delete contact");
            int userInput = sc.nextInt();
            switch (userInput) {
                case 1 -> book.create();
                case 2 -> book.display();
                case 3 -> book.editContact();
                case 4 -> book.deleteContact();
                default -> System.out.println("Wrong Input");
            }
            System.out.println("Enter 0 to exit Address Book operations");
            i = sc.nextInt();
        } while (i != 0);
    }

    public void displayAllAddressBooks() {
        if (addressBooks.isEmpty()) {
            System.out.println("No Address Books available.");
        } else {
            System.out.println("Address Books: " + addressBooks.keySet());
        }
    }
}
