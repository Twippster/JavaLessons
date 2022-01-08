package src;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter multiple numbers:");
        int n = sc.nextInt();

        sc.close();

        int re = 0;

        for (; n != 0;) {
            int rm = n % 10;

            re = re * 10 + rm;

            n = n / 10;
        }

        System.out.println(re);

    }
}
