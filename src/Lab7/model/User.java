package Lab7.model;

public class User {
    private String firstName;
    private String lastName;
    private String iban;

    public User(String firstName, String lastName, String iban) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.iban = iban;
    }

    public void setFirstName(String firstName) { this.firstName = firstName; }

    public void setLastName(String lastName) { this.lastName = lastName; }

    public void setIban(String iban) { this.iban = iban; }


    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getIban() { return iban; }
}
