import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodPractice {
    public static void main(String[] args) {
        addTwoIntegers();
    }

    public static void printWelcomeMessage() {
        System.out.println("Welcome! I am a machine that adds two cards. ");
    }

    public static void printGoodBye() {
        System.out.println("Goodbye!");
    }

    public static boolean closeProgram(int number1, int number2) {
        if (number1 == 0 && number2 == 0) {
            return true;
        } else return false;
    }

    public static void addTwoIntegers() {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2, sum;
//        try {System.out.print("Please input the first number: ");
//            num1 = sc.nextInt();}
//        catch (InputMismatchException e) {
//            num1 = 21;
//            sc.nextLine();
//        }
        System.out.print("Please input the first number: ");
        num1 = sc.nextInt();
        System.out.print("Please input the second number: ");
        num2 = sc.nextInt();
        if (closeProgram(num1, num2) == true) {
            printGoodBye();
        } else {
            sum = num1 + num2;
            if (sum == 21) {
                System.out.println("The sum of " + num1 + " and " + num2
                + " is " + sum + "*");
            } else {
                System.out.println("The sum of " + num1 + " and " + num2
                        + " is " + sum);
            }
        }
    }


}
