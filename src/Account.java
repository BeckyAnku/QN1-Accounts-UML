public abstract class Account implements Statement {
    protected String accountNo;
    protected double balance;

    public Account(String accountNo, double opening) {
        this.accountNo = accountNo;
        this.balance = opening;
    }

    public void deposit(double cash) {
        if (cash > 0) {
            this.balance = this.balance + cash;
        }
    }

    public abstract boolean withdraw(double cash);

    public double getBalance() {
        return this.balance;
    }

    public String generateStatement() {
        return "Statement for " + this.accountNo + ": balance is UGX " + this.balance;
    }
}
