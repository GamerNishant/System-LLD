package ATM;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.startSession();
    }
}

// List<Person>

// Design a ATM : Try to implement all connections discussed today
/* Requirements: (This won't be original order) but we have this much requirements
 * 0. Swipe Card
 * 1. Menu : savings, current,
 * 1a. Deposit, withdraw, block,
 * 2. Enter Amount
 * 3. Enter Pin
 * 4. Makes noise, and withdraw cash
 * 5. Cancel, or withdraw more
 * 6. Exit
 */

/*
* Combine all these features : ATM
* 1. Account Details
* 2. Transaction Log - Either withdraw, or deposit (Database gives read method)
* 4. Deposit
* 5. Cash Dispenser
* 6. Withdraw
* 7. Block Account
*
*
* */