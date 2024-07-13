package _240709_Exceptions;

public class AgeCheckException extends Exception{

    public AgeCheckException(String message){
        super(message);
        //System.out.println("Exception is caught");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "This is an exception of the AgeCheckException Class.";
    }

    

}
