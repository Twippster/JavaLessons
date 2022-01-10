package src;
import java.util.Scanner;

public class StringSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("How many words would you like to enter?:");
        int un = sc.nextInt();

        String[] storage = new String[un];
        System.out.println("Enter words:");

        for (int i = 0; i < storage.length; i++) {
            storage[i] = sc2.nextLine();
        }

        sc.close();
        sc2.close();

        String temp;

        for (int i = 0; i < storage.length; i++) {
            for (int j = i + 1; j < storage.length; j++) {
                
                if(storage[i].compareTo(storage[j]) > 0) {
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

