import java.util.Scanner;

public class VowelOrConsonantChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a letter:");
        char userInput = sc.next().charAt(0);

        // if (userInput == 'a' || userInput == 'e' || userInput == 'i' || userInput == 'o' || userInput == 'u' || userInput == 'A' || userInput == 'E' || userInput == 'I' || userInput == 'O' || userInput == 'U') {
        //     System.out.println("This is a vowel.");
        // } else {
        //     System.out.println("This is a consonant.");
        // }

        boolean isVowel = false;
        switch (userInput) {
            case 'a': isVowel = true;
                
            case 'A': isVowel = true;

            case 'e': isVowel = true;

            case 'E': isVowel = true;

            case 'i': isVowel = true;

            case 'I': isVowel = true;

            case 'o': isVowel = true;

            case 'O': isVowel = true;

            case 'u': isVowel = true;

            case 'U': isVowel = true;
        }

        if (isVowel == true) {
            System.out.println("This is a vowel.");
        } else if (isVowel == false) {
            System.out.println("This is a consonant.");
        }

        sc.close();
    }
}
