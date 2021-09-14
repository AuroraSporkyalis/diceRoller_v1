import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to CISP 401 Simple Calculator");
        System.out.println("Please enter an integer:");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("Please enter another integer:");
        int num2 = input.nextInt();
        System.out.println("You input " + num1  + " and "+ num2 + ".");
        System.out.println("What do you want to do with those numbers? Enter 1=+, 2=-, 3=*, 4=/:");
        int operation = input.nextInt();
        
        int total;

        System.out.println("Now it prints here!\n");
        System.out.println("Now it prints here too!\n");

        switch(operation) {
            case 1: 
                total = num1 + num2;
                System.out.println("The sum of your numbers is " + total);
                break;
            case 2:
                total = num1 - num2;
                System.out.println("The difference between your numbers is " + total);
                break;
            case 3:
                total = num1 * num2;
                System.out.println("The product of your numbers is " + total);
                break;
            case 4:
                // check the divisor isn't 0
                if (num2 != 0) {
                    total = num1 / num2;
                    System.out.println("The quotient your numbers is " + total);
                }
                else {
                    System.out.println("Error, cannot divide by 0");

                }
            default:
                System.out.println("Invalid option."); 
        }

    }
}
