import java.util.Scanner;

public class SumOfPrimes {
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

        int sum = 0;
        // Проверяем каждое число последовательности на простоту и суммируем простые числа
        for (int num : sequence) {
            boolean isPrime = true;
            if (num > 1) {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            } else {
                isPrime = false;
            }

            if (isPrime) {
                sum += num;
            }
        }

        System.out.println("Сумма простых чисел: " + sum);
    }
}
