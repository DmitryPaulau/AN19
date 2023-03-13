package lesson5;

import java.util.Arrays;

public class Homework4 {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int index = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 20);
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int i = 0; i <= index; i++) {
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
        for (int i = 0; i <= index; i++) {
            System.out.print(arr[index - i][i] + " ");
        }
        System.out.println();
    }
}