package OOPs;
// kind of relnship, with no ownship
// objects will simply interact
class Car{
    String model;
    Car (String model){
        this.model = model;
    }

    void drive(){
        System.out.println("Driving...");
    }
}


class Persons{
    String name;
    Car toy;

    Persons(String name, Car car){
        this.name = name;
        this.toy = car;
    }

    void goForDrive(){
        System.out.println(name + " is going drive");
        toy.drive();
        toy.model = "ferrari"; //CRUD : Create, Read, update, delete
        System.out.println(toy.model);
    }

}

public class AssociationDemo {
    public static void main(String[] args) {
        System.out.println();
        Car car = new Car("Tesla");
        Persons b = new Persons("B1", car);
        b.goForDrive();
    }
}

/*
*
* a = 3
* b = a
*
* b = value ? 3
*
* car = tesla
* toy = car
*
* toy = value ?
*
* */
