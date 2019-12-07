package Java_cert;
public class Question102 {
    public static void main(String[] args) {
        int ivar = 100;
        float fvar = 100.100f;
        double dvar = 123;
        //ivar=fvar;
        fvar = ivar;
        dvar=fvar;
        //fvar=dvar;
        dvar=ivar;
        //ivar=dvar;
    }
}


/*Line 7/10/12 will fail
Correct option is A,E,F*/
