import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner entScanner = new Scanner(System.in);

        int a;
        int b;

        a = entScanner.nextInt();
        b = entScanner.nextInt();

        int x;
        x = a + b;

        System.out.printf("X = %d\n", x);

        entScanner.close();
    }
}
