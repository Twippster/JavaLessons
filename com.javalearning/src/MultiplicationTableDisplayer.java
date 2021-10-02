import java.util.Scanner;
public class MultiplicationTableDisplayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int userInput = sc.nextInt();
        sc.close();

        for (int i = 1; i <= 10; i++) {
            System.out.print(userInput + " * " + i + " = ");
            System.out.printf("%2d\n", userInput * i);
        }
    }
}