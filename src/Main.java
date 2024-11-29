import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("WelCome to AddressBook Program");
        AddBook a1 = new AddBook();
        int i = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter 1 to create contact or 2 to display all contacts or 3 to update contact details");
            int userInput = sc.nextInt();
            switch (userInput) {
                case 1 -> a1.create();
                case 2->  a1.display();
                case 3->a1.editContact();
                default -> System.out.println("Wrong Input");
            }
            System.out.println("Enter 0 to exit");
            i = sc.nextInt();
        } while (i != 0);
        System.out.println("Thankyou for using address book");
        sc.close();
    }




}