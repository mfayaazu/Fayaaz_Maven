package Java_cert;

public class Q28_ImagePrinter implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Printer Closed.");
    }

    public void printImage(){
        System.out.println("Print.");
    }
}
