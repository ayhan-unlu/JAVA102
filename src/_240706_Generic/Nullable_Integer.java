package _240706_Generic;

public class Nullable_Integer {

    public final Integer value;

    public Nullable_Integer (Integer value){
        this.value=value;
    }

    public Integer getValue(){
        return value;
    }

    public boolean isNull(){
        return this.getValue()==null;
    }

    public void run(){
        if(isNull()){
            System.out.println("No integer is assigned to this variable(Null)");
        }else{
            System.out.println(this.getValue());
        }
    }
}
