import java.util.Scanner;

public class ReplaceNegativeElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вводим количество элементов в массиве
        System.out.print("Введите количество элементов в массиве: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        // Вводим элементы массива
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Находим сумму индексов двузначных элементов массива
        int sumOfIndices = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] >= 10 && array[i] <= 99) {
                sumOfIndices += i;
            }
        }

        // Заменяем отрицательные элементы на сумму индексов двузначных элементов
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                array[i] = sumOfIndices;
            }
        }

        // Выводим измененный массив
        System.out.println("Измененный массив:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
