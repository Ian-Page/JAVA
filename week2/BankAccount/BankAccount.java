class BankAccount {
    // instances
    private double checkingBalance;
    private double savingsBalance;
    // static
    public static int numberOfAccounts = 0;
    public static double totalHoldings = 0;

    public BankAccount() {
        BankAccount.numberOfAccounts += 1;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    }

    public void depositMoney(double amount, String account) {
        if (account == "checking") {
            this.checkingBalance += amount;
        } else {
            this.savingsBalance += amount;
        }
        totalHoldings += amount;
    }

    public void withdrawMoney(double amount, String account) {
        if (account == "checking") {
            if (amount > this.checkingBalance) {
                System.out.println("insufficient Funds fool");
                return;
            }
            this.checkingBalance -= amount;
        } else {
            if (amount > this.savingsBalance) {
                System.out.println("insufficient funds fool");
                return;
            }
            this.savingsBalance -= amount;
        }
        totalHoldings -= amount;
    }

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }
}
