package Object;

public class EmployeeEncap {

    //Global Variable
    private String firstName; //"Fayaaz"
    private String lastName;    //"Priyanka"
    private int employeeID;     //1234

    public EmployeeEncap(String fName, String lName, int eID) {
        this.firstName = fName;
        this.lastName = lName;
        this.employeeID = eID;
    }

    public EmployeeEncap() {
    }

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

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }
}
