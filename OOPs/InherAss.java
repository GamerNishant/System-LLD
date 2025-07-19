package OOPs;

// This is your question (You need to do this simultaneously):
// Animal->whale->eat() // khane k gun dega
// person->whale->play() // sath khelna chahta hai
/*
 *
 * merry.eat()
 * b1.play()
 * merry.eat()
 */
// Solution to Inheritance and Association Problem

class Animal{
    void eat(String item){
        System.out.println("Eating " + item);
    }
}

class Whale extends Animal{
    String name;

    void play(){
        System.out.println("Whale : Doing water splashes...");
    }

    void eat(String item){
        System.out.println("Whale Eating " + item);
    }

    Whale(String name){
        this.name = name;

    }
}

class Person{
    String name;
    Whale pet;

    Person(String name, Whale p){
        this.name = name;
        this.pet = p;
    }

    void play(){
        System.out.printf("Hi %s, I am %s show me some moves \n", this.pet.name, this.name);
        this.pet.play();
    }
}


public class InherAss {
    public static void main(String[] args) {
        System.out.println();
        Whale merry = new Whale("Merry");
        Person B1 = new Person("B1", merry);

        merry.eat("Fist");
        B1.play();
        merry.eat("Fish");

    }
}
