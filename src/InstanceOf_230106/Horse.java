package InstanceOf_230106;

public class Horse extends Animal{
    public Horse(String name){
        super(name);
    }

    @Override
    public String makeSound(){
        return this.getName()+" neighs.";
    }
    
}
