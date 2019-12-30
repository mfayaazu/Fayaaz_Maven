package Java_cert;

public class Question114_Alpha {
    int ns;
    static int s;
    Question114_Alpha(int ns){
        if(s<ns){
            s=ns;
            this.ns=ns;
        }
    }
    void doPrint(){
        System.out.println("ns ="+ns+"s ="+s);
    }
}
