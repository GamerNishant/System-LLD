package ATM;

import java.util.Scanner;

class ATM {
    private BankDatabase db;
    private CashDispenser cashDispenser;
    private DepositSlot depositSlot;

    public ATM() {
        db = new BankDatabase();
        cashDispenser = new CashDispenser(); // Composition
        depositSlot = new DepositSlot();     // Composition
    }

    public void startSession() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        Account user = db.getAccount(accNo);

        if (user == null) {
            System.out.println("Account not found.");
            return;
        }

        if (user.isBlocked()) {
            System.out.println("Account is blocked.");
            return;
        }

        // Prompt PIN
        boolean authenticated = false;
        int tries = 0;
        while (tries < 3) {
            System.out.print("Enter PIN: ");
            String pin = sc.nextLine();
            if (user.validatePin(pin)) {
                authenticated = true;
                break;
            }
            tries++;
        }

        if (!authenticated) {
            System.out.println("Authentication failed.");
            return;
        }

        // Menu
        while (true) {
            System.out.println("\n== MENU ==");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Block Account");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");
            int ch = Integer.parseInt(sc.nextLine());

            if (user.isBlocked()) {
                System.out.println("Account is blocked.");
                break;
            }

            Transaction txn = null;

            switch (ch) {
                case 1:
                    System.out.print("Enter amount: ");
                    double amt = Double.parseDouble(sc.nextLine());
                    txn = new WithdrawTransaction(user, db, amt, cashDispenser);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double dAmt = Double.parseDouble(sc.nextLine());
                    txn = new DepositTransaction(user, db, dAmt, depositSlot);
                    break;

                case 3:
                    txn = new BlockAccountTransaction(user, db);
                    break;

                case 4:
                    System.out.println("Balance: Rs." + user.getBalance());
                    continue;

                case 5:
                    System.out.println("Thank you. Please take your card.");
                    return;

                default:
                    System.out.println("Invalid option.");
                    continue;
            }

            txn.execute();
        }

        sc.close();
    }
}
