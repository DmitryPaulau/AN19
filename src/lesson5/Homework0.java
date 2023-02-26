package lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Homework0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число на которое нужно увеличить элементы: ");
        int num = scanner.nextInt();
        int[][][] arr = {{{1, 5, 7}, {1, 7, 13}, {5, 5, 13}}, {{1, 9, 12}, {8, 4, 15}, {0, 8, 13}}, {{2, 12, 54}, {7, 7, 11}, {1, 9, 11}}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int z = 0; z < arr[i][j].length; z++) {
                    arr[i][j][z] = arr[i][j][z] + num;
                }
                System.out.println(Arrays.toString(arr[i][j]));
            }
            System.out.println();
        }
    }
}
