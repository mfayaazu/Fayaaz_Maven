package Java_cert;

public class Question26I {

    String fName;
    String lname;

    public Question26I(String fName, String lname) {
        this.fName = fName;
        this.lname = lname;
    }

    public String toString(){
        return fName+":"+lname;
    }

    public String getfName() {
        return fName;
    }

    public String getLname() {
        return lname;
    }
}
