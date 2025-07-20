package ATM;

class DepositTransaction extends Transaction {
    private double amount;
    private DepositSlot depositSlot;

    public DepositTransaction(Account acc, BankDatabase db, double amount, DepositSlot slot) {
        super(acc, db);
        this.amount = amount;
        this.depositSlot = slot;
    }

    @Override // Abstract function that is already present, We are modifying it's work here
    public void execute() {
        if (depositSlot.receiveEnvelope()) {
            account.credit(amount);
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Deposit failed.");
        }
    }
}
