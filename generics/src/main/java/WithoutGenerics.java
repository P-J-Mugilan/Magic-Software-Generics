/**
 * accepts anything
 * unsafe casting
 */
public class WithoutGenerics {

    Object value;

    void setValue(Object value){
        this.value = value;
    }

    Object getValue(){
        return value;
    }
}
