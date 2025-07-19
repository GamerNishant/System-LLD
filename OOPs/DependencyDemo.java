package OOPs;
// inheritance, polymorphism, access modifiers, abstract class (interface), generics & wildcards (optional)

// Design a ATM : Try to implement all connections discussed today
/* Baatchit
* 0. Swipe Card
* 1. Menu : savings, current,
* 1a. Deposit, withdraw, block,
* 2. Enter Amount
* 3. Enter Pin
* 4. Makes noise, and withdraw cash
* 5. Cancel, or withdraw more
* 6. Exit
* */

class Printer{
    void print(String message){
        System.out.println("Printer Exists Printing: " + message);
    }
}

class Document{
    String content;
    Document(String content){
        this.content = content;
    }

    //Dependency :

    void printDocument(Printer printer){
        printer.print(content);
    }

    void print(){
        System.out.println("Document exists");
    }
}

//Document doesn't store a printer, it simply uses one when needed.
// I said for printer to exist, we need document.

public class DependencyDemo {
    public static void main(String[] args) {
        Document doc = new Document("Hello World");
        Printer printer = new Printer();
        doc.printDocument(printer);

        doc.print();
    }
}
