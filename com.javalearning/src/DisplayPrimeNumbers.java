public class DisplayPrimeNumbers {
    public static void main(String[] args) {

        int counter = 0;

        for (int i = 2; i < 100; i++) {

            boolean isPrime = true;

            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime == true) {
                counter++;
                System.out.printf(i + "\t");
                if (counter == 5) {
                    counter = 0;
                    System.out.println();
                }
            }

        }

    }
}