package Java_cert;

import java.util.function.Predicate;

public interface Question25 extends Predicate<String> {
    @Override
    public default boolean test(String str) {
        return str.equals("Java");
    }
}
