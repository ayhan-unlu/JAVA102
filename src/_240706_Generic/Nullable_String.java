package _240706_Generic;

public class Nullable_String {
    private final String value;

    public Nullable_String(String value) {
        this.value = value;
    }

    public String getValue(){
        return value;
    }

    public boolean isNull(){
        return this.getValue()==null;
    }

    public void run(){
        if(isNull()){
            System.out.println("No value is assigned for this variable (Null)");
        }else{
            System.out.println(this.getValue());
        }
    }

}
