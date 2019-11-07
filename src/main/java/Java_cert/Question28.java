package Java_cert;

public class Question28 {

    public static void main(String[] args) {
        try
        {
            Q28_ImageScanner ir=new Q28_ImageScanner();
            Q28_ImagePrinter iw =new Q28_ImagePrinter();

            ir.scanImage();
            iw.printImage();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

//output :
//      Scan.
//      Unable to Scan.

// correct answer is C
//Scanner Code will throw exception thats why code will skip printer code and go to catch block directly. try reversing the flow of execution
