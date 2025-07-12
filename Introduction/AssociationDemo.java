package Introduction;

// use object of one class into another class

class BeCar{
    String model;
    BeCar(String model){
        this.model = model;
    }

    void drive(){
        System.out.println("Driving " + this.model);
    }
}



class Person{
    String name;
    BeCar BeCar; // object

    Person(String name, BeCar BeCar){
        this.name = name;
        this.BeCar = BeCar;
    }

    void goDrive(){
        System.out.println(name + " is going for drive");
        BeCar.drive();
    }
}


public class AssociationDemo {
    
}
