package src;
import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?:");
        int un = sc.nextInt();

        int[] storage = new int[un];
        System.out.println("Enter numbers:");

        for (int i = 0; i < storage.length; i++) {
            storage[i] = sc.nextInt();
        }

        sc.close();

        int temp;

        for (int i = 0; i < storage.length; i++) {
            for (int j = i + 1; j < storage.length; j++) {
                
                if(storage[i] > storage[j]) {
                    temp = storage[i];
                    storage[i] = storage[j];
                    storage[j] = temp;
                }

            }

        }

        System.out.printf("\n");
        
        for (int i = 0; i < storage.length; i++) {
            System.out.println(storage[i]);
        }

    }
}
