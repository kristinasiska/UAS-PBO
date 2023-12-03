public class User {
    public String name;
    public String email;
    public String address;
    public String phoneNumber;

    public User(String name, String email, String address, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
    public String getName(){ return name; }
    public String getEmail(){ return email; }
    public String getAddress(){ return address; }
    public String getPhoneNumber(){ return phoneNumber; }
}