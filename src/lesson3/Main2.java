package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива ");
        int size = scanner.nextInt();
        int arr[] = new int[size];
        System.out.println("Введите элементы массива");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Вывод массива");
        for (int i = 0; i < size; i++) {
            System.out.println(" " + arr[i]);
        }
    }
}
