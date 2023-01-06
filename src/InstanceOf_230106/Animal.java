package InstanceOf_230106;

public class Animal {
    private String name;

    public Animal(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }

    public String makeSound(){
        return "The animal makes sound.";
    }
}
