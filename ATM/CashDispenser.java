package ATM;

// CashDispenser.java
public class CashDispenser {
    private final static int INITIAL_BILLS = 500; // for example
    private int billCount;

    public CashDispenser() {
        this.billCount = INITIAL_BILLS;
    }

    // Simulate the cash dispensing mechanism
    public void dispenseCash(double amount) {
        // Assume denominations of 500 for simplicity
        int billsRequired = (int)(amount / 500);
        if (billCount >= billsRequired) {
            billCount -= billsRequired;
            System.out.println("Dispensing Rs. " + amount + "...");
            System.out.println("DagaDagaDagaDaga.... Khhachhh...");
        } else {
            System.out.println("Unable to dispense cash: Insufficient bills in dispenser.");
        }
    }

    // Optionally, check if sufficient cash is available
    public boolean isSufficientCashAvailable(double amount) {
        int billsRequired = (int)(amount / 500);
        return billCount >= billsRequired;
    }
}

