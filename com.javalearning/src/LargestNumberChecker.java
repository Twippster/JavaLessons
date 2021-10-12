import java.util.Scanner;

public class LargestNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] storage = {};
        storage = new int[3];

        for(int i = 0; i <= 2; i++) {
            System.out.println("Enter a number:");
            storage[i] = sc.nextInt();
        }

        if(storage[0] > storage[1]) {
            if(storage[0] > storage[2]) {
                System.out.println(storage[0] + " is the largest number.");
            } else {
                System.out.println(storage[2] + " is the largest number.");
            }
        } else if(storage[1] > storage[2]) {
            System.out.println(storage[1] + " is the largest number.");
        } else {
            System.out.println(storage[2] + " is the largest number.");
        }

        sc.close();
    }
}
