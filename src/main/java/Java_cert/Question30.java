package Java_cert;

import java.util.Optional;

public class Question30 {

    public static void main(String[] args) {
        Q30_Adress adress=null;
        Optional<Q30_Adress> addrs1=Optional.ofNullable(adress);
        Q30_Employee e1 = new Q30_Employee(addrs1);
        String eAdress =(addrs1.isPresent()) ? addrs1.get().getCity():"City not Availble";
    }
}

//Output:City not Availble
// Correct option is B

