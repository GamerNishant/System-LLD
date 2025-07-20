package ATM;

import java.util.*;

// Association, (Dependency), (Aggregation), Compostion, Inheritance

class BankDatabase {
    private Map<String, Account> accounts;

    public BankDatabase() {
        accounts = new HashMap<>();
        accounts.put("1001", new Account("1001", 5000, "1234"));
        accounts.put("1002", new Account("1002", 10000, "5678"));
    }

    // Read Only Permissions
    public Account getAccount(String accNumber) {
        return accounts.get(accNumber);
    }
}

