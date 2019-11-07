package Java_cert;

import java.util.Optional;

public class Q30_Employee {
    Optional<Q30_Adress> adress;
    Q30_Employee(Optional<Q30_Adress> adress){
        this.adress=adress;
    }

    public Optional<Q30_Adress> getAdress(){
        return adress;
    }
}
