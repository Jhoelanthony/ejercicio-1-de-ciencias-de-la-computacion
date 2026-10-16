import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero no negativo (N): ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("El número debe ser no negativo.");
        } else {
            // A. Usando FOR
            long factorialFor = 1;
            for (int i = 1; i <= n; i++) {
                factorialFor *= i;
            }
            System.out.println("Factorial con FOR: " + factorialFor);

            // B. Usando WHILE
            long factorialWhile = 1;
            int j = 1;
            while (j <= n) {
                factorialWhile *= j;
                j++;
            }
            System.out.println("Factorial con WHILE: " + factorialWhile);

            // C. Usando DO-WHILE
            long factorialDoWhile = 1;
            int k = 1;
            if (n == 0) {
                factorialDoWhile = 1;
            } else {
                do {
                    factorialDoWhile *= k;
                    k++;
                } while (k <= n);
            }
            System.out.println("Factorial con DO-WHILE: " + factorialDoWhile);
        }
    }
}