public class SavingsAccount extends Account {
    private double rate;

    public SavingsAccount(String accountNo, double opening, double rate) {
        super(accountNo, opening);
        this.rate = rate;
    }

    public boolean withdraw(double cash) {
        boolean allowed = false;

        if (cash > 0) {
            if (this.balance >= cash) {
                this.balance = this.balance - cash;
                allowed = true;
            }
        }

        return allowed;
    }

    public void addInterest() {
        this.balance = this.balance + ((this.rate * this.balance) / 100);
    }
}
