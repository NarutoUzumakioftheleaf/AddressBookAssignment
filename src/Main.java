import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("WelCome to AddressBook Program");
        AddBook a1 = new AddBook();
        int i = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu:");
            System.out.println("1. Create Contact");
            System.out.println("2. Display All Contacts");
            System.out.println("3. Update Contact Details");
            System.out.println("4. Delete Contact");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int userInput = sc.nextInt();
            switch (userInput) {
                case 1 -> a1.create();
                case 2->  a1.display();
                case 3->a1.editContact();
                case 4->a1.deleteContact();
                default -> System.out.println("Wrong Input");
            }
            System.out.println("Enter 0 to exit");
            i = sc.nextInt();
        } while (i != 0);
        System.out.println("Thankyou for using address book");
        sc.close();
    }




}