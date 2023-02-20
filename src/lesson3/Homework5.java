package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int arrSize = scanner.nextInt();
        System.out.println("Введите макс. значение массива");
        int num = scanner.nextInt();

        int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * num);
            if (arrSize > 5 && arrSize <= 10) {

            }else {

            }
        }
    }
}
