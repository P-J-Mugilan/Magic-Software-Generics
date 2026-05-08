public class WithGenerics<T>{
    T value;
    void setValue(T value){
        this.value = value;
    }
    T getValue(){
        return value;
    }
}
