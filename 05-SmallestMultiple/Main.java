import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter max divisor: ");
        int maxDiv = scanner.nextInt();
        scanner.close();

        int n = 1;
        int i = 1;

        while (i <= maxDiv) {
            if (n % i == 0) {
                i++;
            } else {
                n++;
                i = 1;
            }
        }

        System.out.println(n);
    }
}