import java.util.Scanner;

public class IncreasingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим количество чисел в последовательности
        System.out.print("Введите количество чисел в последовательности: ");
        int n = scanner.nextInt();

        int[] sequence = new int[n];
        // Вводим числа последовательности
        System.out.println("Введите числа последовательности:");
        for (int i = 0; i < n; i++) {
            sequence[i] = scanner.nextInt();
        }

        boolean isIncreasing = true;
        // Проверяем каждое число последовательности
        for (int i = 0; i < n - 1; i++) {
            if (sequence[i] >= sequence[i + 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing) {
            System.out.println("Последовательность является возрастающей.");
        } else {
            System.out.println("Последовательность не является возрастающей.");
        }
    }
}
