import java.util.Scanner;

public class CheckPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int userInput = sc.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < userInput; i++) {
            if (userInput % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime == true) {
            System.out.println("The number you have entered is a prime number.");
        } else {
            System.out.println("The number you have entered is not a prime number.");
        }

        sc.close();
    }
}
