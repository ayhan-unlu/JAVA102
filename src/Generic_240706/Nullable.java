package Generic_240706;

public class Nullable<T extends B> {
//    public class Nullable<T extends Number> {
        private final T value;

    public Nullable(T value) {
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public boolean isNull(){
        return this.getValue()==null;
    }
    public void run(){
        if (isNull()){
            System.out.println("Nothing is assigned for this variable (Null)");
        }else{
            System.out.println(this.getValue());
        }
    }

}