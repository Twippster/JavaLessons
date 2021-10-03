public class MultiiplicationTablesDisplayer {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            for (int n = 1; n <= 10; n++) {
                System.out.print(n + " * " + i + " = ");
                System.out.printf("%2d\t", n * i);            
            }

            System.out.println();

        }
    }
}