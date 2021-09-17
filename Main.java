//import java.util.Scanner;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        String rollAgain;

        int numOfDie = 0;
        int dieSides = 0;
        
        do {
            System.out.println("Enter the number and type of die you wish to roll in XdY format. e.g 2d6.");
            try {
                String Str = input.next();
                numOfDie = Integer.parseInt(Str.split("d")[0]);
                dieSides = Integer.parseInt(Str.split("d")[1]);
              } catch (Exception e) {
                System.out.println("That is not valid input");
              }

            int[] dice = new int[numOfDie];

            for(int i = 0; i < numOfDie; i++) {
                Random rand = new Random();
                dice[i] = rand.nextInt(dieSides) + 1;
            }
            for (int die: dice) {
                System.out.println("You rolled a " + die + " on a " + dieSides + " sided die\n");
                total += die;
            }
            System.out.println("You rolled a total of " + total + "\n");

            System.out.println("Do you want to roll again? Plase enter y/n");
            rollAgain = input.next();
        }
        while(rollAgain.contains("y"));
        
        input.close();
    }
}
