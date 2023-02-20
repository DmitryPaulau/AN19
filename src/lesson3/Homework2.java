package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите чило: ");

        int arr[] = {0, 5, 15, 4, 78, 6, 28};
        int newArr[] = null;
        int elementToBeDel = scanner.nextInt();

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == elementToBeDel) {
                newArr = new int[arr.length - 1];
                for (int index = 0; index < i; index++) {
                    newArr[index] = arr[index];
                }
                for (int j = i; j < arr.length - 1; j++) {
                    newArr[j] = arr[j + 1];
                }
                break;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
