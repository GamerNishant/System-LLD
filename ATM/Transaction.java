package ATM;

// Transaction.java (Abstract Class - Inheritance)
abstract class Transaction {
    protected Account account;
    protected BankDatabase bankDatabase;

    public Transaction(Account account, BankDatabase bankDatabase) {
        this.account = account;
        this.bankDatabase = bankDatabase;
    }

    abstract void execute();
}

/*
*
* class Shape{
*   int sides
*
*   int area(){
*       if(sides == 3)
*       {
*           return sides*sides*sides;
*       }
*
*       else if(sides == 4)
 *       {
 *           return sides*sides*sides*sides;
 *       }
 *      else return 0;
*   }
* }
*
*
*   Shape tri = new Shape(3);
*   Shape sq = new Shape(4);
*
*
*   tri.area(); = (27)
*   sq.area(); = (256)
*
* */