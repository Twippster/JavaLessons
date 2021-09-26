import java.util.Scanner;
public class CubeCreator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter height in units:");
        int heightValue = sc.nextInt();

        System.out.println("Enter width in units:");
        int widthValue = sc.nextInt();

        String s = "";
        for (int w = 1; w <= widthValue; w++) {
            s += "#";
        }

        for (int i = 1; i <= heightValue; i++) {
            System.out.println(s);
        }

        sc.close();
    }
}
