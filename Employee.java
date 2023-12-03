public class Employee extends User {
    public String position;

    public Employee(String name, String email, String address, String phoneNumber, String position) {
        super(name, email, address, phoneNumber);
        this.position = position;
    }

    // Getters and setters
}