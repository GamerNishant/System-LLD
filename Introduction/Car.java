package Introduction;

public class Car {
    
    // Attributes
    String model;
    int year;
    String color;

    // constructor : memory allocation & by default values

    public Car(String model, int yr, String cl){
        this.model = model;
        this.year = yr;
        this.color = cl;
    }

    // Methods

    public void print(){
        System.out.println("Info : " + this.model + " And " + this.color + " And " + this.year);
    }

    public static void main(String[] args) {
        System.out.println();
        Car toyta = new Car("Base", 2026, "black");
        toyta.print();
    }
}


  // car => toyota.model = base
  // (obj)model = model(base)
