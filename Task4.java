import java.util.Scanner;
public class Task4 {
    public static void PrintTask4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість елементів масиву: ");
        int n = scanner.nextInt();

        double[] massive = new double[n];

        System.out.println("Введіть елементи масиву:");

        for (int i = 0; i < n; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            massive[i] = scanner.nextDouble();
        }

        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += massive[i];
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                massive[i] = -massive[i];
            }
        }

        System.out.println("Масив після зміни знаку непарних елементів:");
        for (int i = 0; i < n; i++) {
            System.out.println(massive[i]);

        }
    }
}

