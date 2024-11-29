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
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getAddress() { return Address; }
    public void setAddress(String address) { this.Address = address; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
    public String getState() { return state; }
    public void setState(String state) { this.state = state; }
    public String getZip() { return zip; }
    public void setZip(String zip) { this.zip = zip; }
    public int getPhone() { return phone_number; }
    public void setPhone(int phone) { this.phone_number = phone_number; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

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
