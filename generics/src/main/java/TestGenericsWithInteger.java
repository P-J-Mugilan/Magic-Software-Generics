/**
 * here the generics class work with Integer
 * restricting that class of the fields only assign of Integer value
 */

public class TestGenericsWithInteger {


    public static void main(String[] args) {
        WithGenerics<Integer> w = new WithGenerics<>();
        w.setValue(2);

        System.out.println(w.getValue());
    }
}
