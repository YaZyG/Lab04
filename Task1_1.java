public class Task1_1 {
    public static void PrintTask1_1() {
        int[] massive = new int[50];
        int number = 0;
        for (int i = 0; i < massive.length; i++) {
            massive[i] = number;
            number += 2;
        }

        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
    }
}