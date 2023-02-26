package lesson3;

import java.util.*;

public class MainTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер массива");
        int arraySize = scanner.nextInt();
        System.out.println("Введите максимальное значение");
        int maxArrayValue = scanner.nextInt();
        int sum = 0;
        int mid = 0;

        int[] arr = new int[arraySize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * maxArrayValue);
            sum += arr[i];
            mid = sum / arr.length;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Среднее значение: " + mid);
        System.out.println("Mаксимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
    }
}

