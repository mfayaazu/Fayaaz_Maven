package Java_cert;

public class Q28_ImageScanner implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Scanner Closed.");
    }

    public void scanImage() throws Exception{
        System.out.println("Scan.");
        throw new Exception("Unable to Scan.");
    }
}
