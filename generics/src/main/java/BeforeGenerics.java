import java.util.ArrayList;
import java.util.List;

/**
 * Before java 5, developers used collections like this
 */

public class BeforeGenerics {

    public static void main(String[] args) {
        List list = new ArrayList();


        // Everything was stored as Object
        list.add("magicsoftware");
        list.add(2.00);
        list.add('S');
        list.add(true);

        // What happens if I expect only Strings?
        String value1 = (String)list.get(0); // will print magicsoftware
        String value2 = (String)list.get(1); // we ClassCastException


    }
}
