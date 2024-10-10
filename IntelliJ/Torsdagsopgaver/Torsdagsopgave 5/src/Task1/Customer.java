package Task1;

public class Customer {

    private String firstName;
    private String lastName;
    private String userName;
    private int id;
    private static int counter;

    public Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.userName = userName;
        this.lastName = lastName;
        this.id = counter;
        counter++;
    }

    public String toString() {
    return "Customer details: " + "\n" +
            "First name: " + firstName + "\n" +
            "Last name: " + lastName + "\n" +
            "Username: " + userName + "\n";
    }

}
