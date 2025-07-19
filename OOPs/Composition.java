package OOPs;

// Made for each other, one can't exist without other.

// House : LivingRoom, kitchen

class Room{
    String name;
    Room(String name){
        this.name = name;
    }
}

class House{
    // Composition : A House if composed of Rooms.
    private Room livingRoom;
    private Room kitchen;

    House(){
        livingRoom = new Room("Living Room");
        kitchen = new Room("Kitchen");
    }

    void showHouse(){
        System.out.println(
                "House made of : " + livingRoom.name + " and " + kitchen.name
        );
    }
}

public class Composition {
    public static void main(String[] args) {
        System.out.println();
        House house = new House();
        house.showHouse();
    }
}
