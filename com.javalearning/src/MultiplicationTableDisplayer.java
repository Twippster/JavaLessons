package src;

import java.util.Scanner;

public class MultiplicationTableDisplayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int userInput = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print(userInput + " * " + i + " = ");
            System.out.printf("%2d\n", userInput * i);
        }

        // System.out.println(userInput + " * " + 1 + " = " + userInput * 1);
        // System.out.println(userInput + " * " + 2 + " = " + userInput * 2);
        // System.out.println(userInput + " * " + 3 + " = " + userInput * 3);
        // System.out.println(userInput + " * " + 4 + " = " + userInput * 4);
        // System.out.println(userInput + " * " + 5 + " = " + userInput * 5);
        // System.out.println(userInput + " * " + 6 + " = " + userInput * 6);
        // System.out.println(userInput + " * " + 7 + " = " + userInput * 7);
        // System.out.println(userInput + " * " + 8 + " = " + userInput * 8);
        // System.out.println(userInput + " * " + 9 + " = " + userInput * 9);
        // System.out.println(userInput + " * " + 10 + " = " + userInput * 10);

        sc.close();
    }
}
