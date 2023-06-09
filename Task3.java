import java.util.Scanner;
public class Task3 {
    public static void PrintTask3() {
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

        System.out.println("Сума елементів масиву: " + sum);
    }
}

