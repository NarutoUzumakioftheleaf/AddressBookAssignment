import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("WelCome to AddressBook Program");
        AddBook a1 = new AddBook();
        int i = 1;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter 1 to create contact");
            int userInput = sc.nextInt();
            switch (userInput) {
                case 1 -> create(a1);
                default -> System.out.println("Wrong Input");
            }
            System.out.println("Enter 0 to exit");
            i = sc.nextInt();
        } while (i != 0);
        System.out.println("Thankyou for using address book");
        sc.close();
    }
        static void create(AddBook a1){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter First Name");
            String f=sc.next();
            System.out.println("Enter Last Name");
            String l=sc.next();
            System.out.println("Enter Address");
            String a=sc.next();
            System.out.println("Enter City");
            String c=sc.next();
            System.out.println("Enter State");
            String s=sc.next();
            System.out.println("Enter Zip");
            String z=sc.next();
            System.out.println("Enter Phone Number");
            int x=sc.nextInt();
            System.out.println("Enter email");
            String e=sc.next();
            Contacts c1=new Contacts();
            c1.createContact(f,l,a,c,s,z,x,e);
            a1.addContact(c1);




        }




}