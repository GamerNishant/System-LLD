package ATM;

// Account.java (Aggregation part - Can live inside BankDatabase)
public class Account {
    private String accNumber;
    private double balance;
    private String pin;
    private boolean blocked;
    private int pinTries;

    public Account(String accNumber, double balance, String pin) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.pin = pin;
        this.blocked = false;
        this.pinTries = 0;
    }

    public boolean validatePin(String enteredPin) {
        if (blocked) return false;

        if (this.pin.equals(enteredPin)) {
            pinTries = 0;
            return true;
        } else {
            pinTries++;
            System.out.println("Incorrect PIN.");
            if (pinTries >= 3) {
                block();
                System.out.println("Too many attempts. Account is blocked.");
            }
            return false;
        }
    }

    public void credit(double amt) { balance += amt; }
    public void debit(double amt) { balance -= amt; }
    public double getBalance() { return balance; }
    public void block() { this.blocked = true; }
    public boolean isBlocked() { return blocked; }
    public String getAccNumber() { return accNumber; }
}

