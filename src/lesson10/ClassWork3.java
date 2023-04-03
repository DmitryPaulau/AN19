package lesson10;

import java.util.Arrays;
import java.util.Scanner;

public class ClassWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[3];
        System.out.println("Введите значения массива: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
        }

        StringBuilder sb = new StringBuilder(Arrays.toString(arr));

        System.out.println(sb);
        System.out.println(sb.delete(0,sb.length()).insert(0, arr[2]));
        System.out.println(sb.delete(0,sb.length()).insert(0, arr[1]).toString().toUpperCase());
        System.out.println(sb.delete(0,sb.length()).insert(0, arr[0]).toString().toLowerCase());

    }
}
