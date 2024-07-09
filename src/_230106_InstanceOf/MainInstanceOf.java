package _230106_InstanceOf;

/**
 * MainInstanceOf
 */
public class MainInstanceOf {

    public static void makeItMakeSound(Object object){
        if (object instanceof Cat){
            Cat catTest = (Cat)object;
            System.out.println(catTest.makeSound());
        }else if (object instanceof Dog){
            Dog dogTest = (Dog)object;
            System.out.println(dogTest.makeSound());
        }else if (object instanceof Horse){
            Horse horseTest = (Horse)object;
            System.out.println(horseTest.makeSound());
        }else if (object instanceof Animal){
            Animal animalTest = (Animal)object;
            System.out.println(animalTest.makeSound());
        }
    }

    public static void main(String[] args) {
        
        Cat cat = new Cat("Kitty");
        if (cat instanceof Cat){
            System.out.println("This object is from Cat Class");
        }

        if (cat instanceof Animal){
            System.out.println("This object is instance of Cat Class");
        }
        
        Cat cat2=new Cat("Kitty");
        Dog dog =new Dog("Doggy");
        Horse horse = new Horse("Bo Jack");
        Animal animal = new Animal("Anime");

        makeItMakeSound(animal);
        makeItMakeSound(cat2);
        makeItMakeSound(dog);
        makeItMakeSound(horse);
    }
}