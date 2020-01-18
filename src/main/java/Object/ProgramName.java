package Object;

public class ProgramName {

    private String firstName;
    private String lastName;
    private int accountNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAccountNumber() {
        System.out.println("Account number passed is: "+ accountNumber);
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        System.out.println("Argument Passed is: "+ accountNumber);
        this.accountNumber = accountNumber;
    }
}
