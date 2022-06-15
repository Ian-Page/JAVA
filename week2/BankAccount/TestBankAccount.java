public class TestBankAccount {
    public static void main(String[] args) {

        BankAccount rodgerBankAccount = new BankAccount();
        rodgerBankAccount.depositMoney(4500, "checking");
        rodgerBankAccount.depositMoney(500, "savings");
        rodgerBankAccount.withdrawMoney(100, "checking");
        rodgerBankAccount.withdrawMoney(5000, "Checking");
        rodgerBankAccount.withdrawMoney(550, "savings");

        BankAccount sebastianBankAccount = new BankAccount();
        sebastianBankAccount.depositMoney(3500, "checking");
        sebastianBankAccount.depositMoney(550, "savings");
        sebastianBankAccount.withdrawMoney(100, "checking");
        sebastianBankAccount.withdrawMoney(500, "savings");

        // rodgerBankAccount.displayAccountBalance();
        // sebastianBankAccount.displayAccountBalance();

        System.out.println(rodgerBankAccount.getCheckingBalance());
        System.out.println(rodgerBankAccount.getSavingsBalance());

        System.out.println(sebastianBankAccount.getCheckingBalance());
        System.out.println(sebastianBankAccount.getSavingsBalance());

        System.out.println(BankAccount.totalHoldings);
    }
}
