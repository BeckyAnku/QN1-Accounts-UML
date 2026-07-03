import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<Account>();
    }

    public void addAccount(Account a) {
        this.accounts.add(a);
    }

    public double totalWorth() {
        double netWorth = 0;
        int counter = 0;

        while (counter < this.accounts.size()) {
            Account oneAccount = this.accounts.get(counter);
            netWorth = netWorth + oneAccount.getBalance();
            counter = counter + 1;
        }

        return netWorth;
    }

    public String getName() {
        return this.name;
    }
}
