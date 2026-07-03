public class Main {
    public static void main(String[] args) {
        Customer owner = new Customer("Grace Atim");

        SavingsAccount villageSavings = new SavingsAccount("GUL-SAV-501", 300000, 4);
        CurrentAccount marketCurrent = new CurrentAccount("GUL-CUR-640", 50000, 200000);

        owner.addAccount(villageSavings);
        owner.addAccount(marketCurrent);

        System.out.println("UGANDA COMMUNITY BANK");
        System.out.println("Account owner: " + owner.getName());
        System.out.println();

        System.out.println("Savings account before interest:");
        System.out.println(villageSavings.generateStatement());
        System.out.println("Withdraw UGX 100000: " + villageSavings.withdraw(100000));
        villageSavings.addInterest();
        System.out.println("Savings account after withdrawal and interest:");
        System.out.println(villageSavings.generateStatement());
        System.out.println();

        System.out.println("Current account test:");
        System.out.println("Withdraw UGX 240000: " + marketCurrent.withdraw(240000));
        System.out.println(marketCurrent.generateStatement());
        System.out.println();

        System.out.println("Total worth for customer: UGX " + owner.totalWorth());
    }
}
