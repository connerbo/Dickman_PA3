public class Application {

    public static void main(String[] args){

        // Set Account Amounts
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);

        // Set Interest Rate
        SavingsAccount.modifyInterestRate(4.0);

        // Print Screen
        System.out.println("Month \t Saver 1 \t Saver 2");

            // Rate of 4.0% for First 12 Months
            for(int i = 1; i <= 12; i++){

                System.out.print(i + "\t\t");

                saver1.calculateMonthlyInterest();
                saver2.calculateMonthlyInterest();

                saver1.printBalance();
                System.out.print("\t");
                saver2.printBalance();

                System.out.println("\n");

            }

            // Rate of 5.0% for 13th Month
            System.out.println("Alert: Interest Rate Now 5.0% \n");
            SavingsAccount.modifyInterestRate(5.0);

            System.out.print(13 + "\t\t");

            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            saver1.printBalance();
            System.out.print("\t");
            saver2.printBalance();

            System.out.println("\n");

    }

}
