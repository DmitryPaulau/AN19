package lesson5;

import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        String[][] arr = new String[8][8];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int sumIndex = i + j;
                if (sumIndex % 2 == 0) {
                    arr[i][j] = "W";
                } else {
                    arr[i][j] = "B";
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}

