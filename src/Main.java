import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBookSystem system = new AddressBookSystem();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to the Multi-Address Book Program");
        do {
            System.out.println("Enter 1 to add a new Address Book, 2 to access an Address Book, 3 to display all Address Books, 0 to exit:");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> system.addAddressBook();
                case 2 -> system.selectAndOperateAddressBook();
                case 3 -> system.displayAllAddressBooks();
                case 0 -> System.out.println("Exiting the program. Thank you!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        sc.close();
    }
}
