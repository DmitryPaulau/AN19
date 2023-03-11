package lesson5;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 50);
                System.out.print(Arrays.toString(new int[]{arr[i][j]}));
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Сумма массива: " + sum);
    }
}
