package src;

import java.util.Scanner;

public class Calculator {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
    
        System.out.println("If you want to add numbers, type 1. If you want to subtract numbers, type 2. If you want to multiply numbers, type 3. If you want to divide numbers, type 4.");
        int userInput = sc.nextInt();

        if (userInput == 1) {
            add();
        } else if (userInput == 2) {
            sub();
        } else if (userInput == 3) {
            multiply();
        } else if (userInput == 4) {
            division();
        }

        sc.close();
    }

    static void add() {

        System.out.println("Enter a number:");
        int userInput = sc.nextInt();
        System.out.println("Enter a number:");
        int userInput2 = sc.nextInt();

        int sum = userInput + userInput2;

        System.out.println("The sum is " + sum);

        sc.close();
    }

    static void sub() {

        System.out.println("Enter a number:");
        int userInput = sc.nextInt();
        System.out.println("Enter a number:");
        int userInput2 = sc.nextInt();

        int diff = userInput - userInput2;

        System.out.println("The difference is " + diff);

        sc.close();
    }

    static void multiply() {

        System.out.println("Enter a number:");
        int userInput = sc.nextInt();
        System.out.println("Enter a number:");
        int userInput2 = sc.nextInt();

        int product = userInput * userInput2;

        System.out.println("The product is " + product);

        sc.close();
    }

    static void division() {

        System.out.println("Enter a number:");
        int userInput = sc.nextInt();
        System.out.println("Enter a number:");
        int userInput2 = sc.nextInt();

        int quotient = userInput / userInput2;

        System.out.println("The quotient is " + quotient);

        sc.close();
    }

}
