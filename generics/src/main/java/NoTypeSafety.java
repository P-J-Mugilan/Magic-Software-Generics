import java.util.ArrayList;
import java.util.List;

/**
 * - No type safety
 * - compiler cannot stop wrong data insertion
 * - error happens at runtime
 * - it is dangerous in enterprise applications or any
 */

public class NoTypeSafety {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Mugilan");
        list.add(10);

        String name =  (String)list.get(1); // Runtime error
    }

}
