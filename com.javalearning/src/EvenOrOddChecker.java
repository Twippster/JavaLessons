import java.util.Scanner;

public class EvenOrOddChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int userInput = sc.nextInt();

        if (userInput % 2 == 0) {
            System.out.println("This number is even.");
        } else {
            System.out.println("This number is odd.");
        }

        sc.close();
    }
}
