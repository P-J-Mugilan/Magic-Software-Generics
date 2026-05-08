/**
 * here the generics class work with String
 * restricting that class of the fields only assign of String value
 * so we have the flexible to work with any wrapper class work on same code function and type safety
 */
public class TestGenericsWithString {

    public static void main(String[] args) {
        WithGenerics<String> w = new WithGenerics<>();
        w.setValue("Hello");
        System.out.println(w.getValue());
    }
}
