package OOPs;

class Animals{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animals{
    void bark(){
        System.out.println("Dog barks");
    }
}

public class AnimalInheritance {
    public static void main(String[] args) {
        System.out.println();
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
