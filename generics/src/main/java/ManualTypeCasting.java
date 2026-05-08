import java.util.ArrayList;
import java.util.List;

/**
 * Developer had to cast manually everywhere
 */
public class ManualTypeCasting {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("MCA");

        // messy code
        // runtime bugs
        String course =  (String)list.get(0);


    }
}
