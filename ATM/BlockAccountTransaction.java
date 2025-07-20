package ATM;

class BlockAccountTransaction extends Transaction {
    public BlockAccountTransaction(Account acc, BankDatabase db) {
        super(acc, db);
    }

    @Override
    public void execute() {
        account.block();
        System.out.println("Your account has been blocked.");
    }
}

