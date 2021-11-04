import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {

        leapYearProgram();

    }

    private static void leapYearProgram() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int userInput = sc.nextInt();

        boolean isLeapYear = false;

        if (userInput % 4 == 0) {
            if (userInput % 100 == 0) {
                if (userInput % 400 == 0) {
                    isLeapYear = true;
                } else {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = true;
            }
        } else {
            isLeapYear = false;
        }

        if (isLeapYear == true) {
            System.out.println("The number you have entered is a leap year.");
        } else {
            System.out.println("The number you have entered is not a leap year.");
        }

        sc.close();

    }
}
