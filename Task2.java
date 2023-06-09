public class Task2 {
    public static void PrintTask2() {
        int[] numbers = {2, 17, 13, 6, 22, 31, 45, 66, 100, -18};
        int i = 0;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i++;

        }
        System.out.println("Результат перебору його циклом for");

        for (int j = 0; j < numbers.length; j++) {
            System.out.println(numbers[j]);
        }

        System.out.println("Результат перебору циклом while та вивести  числа тільки з непарним індексом");

        i = 1;
        while (i < numbers.length) {
            System.out.println(numbers[i]);
            i += 2;
        }

        System.out.println("Результат перебору циклом for та вивести  числа тільки з парним індексом");


        for (int j = 0; j < numbers.length; j += 2) {
            System.out.println(numbers[j]);
        }

        System.out.println("Результат перебору масив в зворотньому порядку");


        for (int j = numbers.length - 1; j >= 0; j--) {
            System.out.println(numbers[j]);
        }
    }
}



