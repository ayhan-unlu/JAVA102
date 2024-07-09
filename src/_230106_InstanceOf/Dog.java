package _230106_InstanceOf;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }

    @Override
    public String makeSound(){
        return this.getName()+" barks.";
    }
    
}
