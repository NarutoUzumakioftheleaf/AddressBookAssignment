public class Contacts {
    String firstName;
    String lastName;
    String Address;
    String city;
    String state;
    String zip;
    int phone_number;
    String email;


    public void createContact(String f,String l,String a,String c,String s,String z,int x,String e) {
        this.firstName = f;
        this.lastName = l;
        this.Address=a;
        this.city=c;
        this.state=s;
        this.zip=z;
        this.phone_number=x;
        this.email=e;

    }


    @Override
    public String toString() {
        return "Contacts{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Address='" + Address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", phone_number=" + phone_number +
                ", email='" + email + '\'' +
                '}';
    }
}
