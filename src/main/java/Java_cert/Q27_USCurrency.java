package Java_cert;

public enum Q27_USCurrency {
    PENNY(1),
    NICKLE(5),
    DIME(10),
    QUATER(25);

    private int value;

    Q27_USCurrency(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }
}
