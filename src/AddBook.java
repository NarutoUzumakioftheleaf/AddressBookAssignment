import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddBook {
List<Contacts> Book=new ArrayList<>();
public void display(){
    System.out.println(Book);
}
public void editContact(){
    System.out.println("Enter name To edit contact details");;
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    boolean found=false;
    for(Contacts c:Book){
        if(c.getFirstName().equalsIgnoreCase(name)){
            found=true;
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
            System.out.println("updated Successfully!");
            break;

        }
    }
    if(!found){
        System.out.println("Contact namenot found");
    }

}



    public void create(){
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
        Book.add(c1);
        System.out.println("Contact is added");



    }

}
