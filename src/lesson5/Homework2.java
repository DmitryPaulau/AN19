package lesson5;

import java.util.Arrays;

public class Homework2 {
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arr1 = {{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        int[][] arr3 = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        for (int y = 0; y < arr1.length; y++) {
            for (int z = 0; z < arr1[y].length; z++) {
            }
            System.out.println(Arrays.toString(arr1[y]));
        }
        for (int i = 0; i < 3; i++) {
            for (int u = 0; u < 3; u++) {
                for (int s = 0; s < 4; s++) {
                    arr3[i][u] += arr[i][s] * arr1[s][u];
                }
            }
        }
        for (int i = 0; i< 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(Arrays.toString(new int[]{arr3[i][j]}));
            }
            System.out.println();
        }
    }
}
