import java.util.Scanner; // Allows User Input
import java.security.SecureRandom; // Import Secure Random

public class P1_Code {

    public static void main(String[] args){

        // Scanner for User Input
        Scanner scanner = new Scanner(System.in);

        // Secure Random Class (Used to Generate Random Numbers Below)
        SecureRandom rand = new SecureRandom();

        // Stats
        int correct = 0;

        // Questions
        int resetProgram = 1;
        while (resetProgram == 1) {

            // Welcome Screen
            System.out.println("--- Welcome to CAI! --- \n");

            // Difficulty
            System.out.println("Enter Difficulty (1 to 4): ");
            int diff = scanner.nextInt();

            int bounds = 0;
            switch(diff){
                case 1:
                    bounds = 10;
                    break;
                case 2:
                    bounds = 100;
                    break;
                case 3:
                    bounds = 1000;
                    break;
                case 4:
                    bounds = 10000;
                    break;
            }

            // Problem Type
            System.out.println("Enter Problem Type: ");
            System.out.println("1: Addition \n2: Multiplication \n3: Subtraction \n4: Division \n5: Random Mix \n");
            int type = scanner.nextInt();
            int firstType = type;

            for (int i = 0; i <= 9; i++) {

                // Generate Random Numbers
                int num1 = rand.nextInt(bounds);
                int num2 = rand.nextInt(bounds);

                // Question and Calculation
                int ans = -1;
                int randQuestion = 1;

                type = firstType;
                while(randQuestion == 1) {

                    switch (type) {
                        case 1:
                            System.out.println("Hi! What is " + num1 + " plus " + num2 + "?");
                            ans = num1 + num2;
                            randQuestion = 0;
                            break;
                        case 2:
                            System.out.println("Hi! What is " + num1 + " times " + num2 + "?");
                            ans = num1 * num2;
                            randQuestion = 0;
                            break;
                        case 3:
                            System.out.println("Hi! What is " + num1 + " minus " + num2 + "?");
                            ans = num1 - num2;
                            randQuestion = 0;
                            break;
                        case 4:
                            System.out.println("Hi! What is " + num1 + " divided by " + num2 + "?");
                            ans = num1 / num2;
                            randQuestion = 0;
                            break;
                        case 5:
                            type = rand.nextInt(4) + 1;
                            randQuestion = 1;
                    }
                }

                // Student Answer
                int userAns = scanner.nextInt();

                // Check Answer

                // Correct
                if (userAns == ans) {
                    correct++;
                }

            }

            // Percentages
            int percent = (correct / 10) * 100;

            if (percent < 75) System.out.println("Please ask your teacher for extra help.");
            else System.out.println("Congratulations, you are ready to go to the next level!");

        }


    }

}
