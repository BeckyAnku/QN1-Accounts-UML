public class CurrentAccount extends Account {
    private double overdraft;

    public CurrentAccount(String accountNo, double opening, double overdraft) {
        super(accountNo, opening);
        this.overdraft = overdraft;
    }

    public boolean withdraw(double cash) {
        boolean done = false;

        if (cash > 0) {
            double afterWithdrawal = this.balance - cash;

            if (afterWithdrawal >= -this.overdraft) {
                this.balance = afterWithdrawal;
                done = true;
            }
        }

        return done;
    }
}
