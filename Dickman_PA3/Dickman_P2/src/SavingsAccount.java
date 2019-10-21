public class SavingsAccount {

    public static double annualInterestRate = 0.0; // Interest rate for all account holders

    private double savingsBalance; // Indicates the amount the saver currently has on deposit

    // Set Saver Balance
    public SavingsAccount(double amount){
        this.savingsBalance = amount;
    }

    // Calculate Monthly Interest
    public void calculateMonthlyInterest (){
        savingsBalance += ( (savingsBalance * (annualInterestRate / 100) ) / 12 );
    }

    // Print Balance
    public void printBalance(){
        System.out.printf("$%.2f", this.savingsBalance);
    }

    // Modify Interest Rate
    public static void modifyInterestRate (double modifiedRate){
        annualInterestRate = modifiedRate;
    }

}
