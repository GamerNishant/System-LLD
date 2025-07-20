package ATM;

// WithdrawTransaction.java (Inheritance + Dependency + Association)
class WithdrawTransaction extends Transaction {
    private double amount;
    private CashDispenser cashDispenser;

    public WithdrawTransaction(Account acc, BankDatabase db, double amount, CashDispenser dispenser) {
        super(acc, db);
        this.amount = amount;
        this.cashDispenser = dispenser;
    }

    @Override
    public void execute() {
        if (account.getBalance() >= amount) {
            account.debit(amount);
            cashDispenser.dispenseCash(amount); // Dependency
            System.out.println("Please collect your cash.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}


