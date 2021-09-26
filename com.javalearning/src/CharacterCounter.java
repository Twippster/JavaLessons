import java.util.Scanner;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence or word.");
        String userInput = sc.nextLine();

        char[] ch = userInput.toCharArray();
        
        int counter = 0;

        for (char i : ch) {
            if (i == 'a') {
                counter++;
            }
        }

        System.out.println("The number of a's in this sentence/word is " + counter);
        sc.close();
    }
}
