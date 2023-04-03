package lesson10;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int arrLenth = scanner.nextInt();
        String[] arr = new String[arrLenth];
        System.out.println("Введите значения массива: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
        }
        String min = arr[0];
        String max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min.length() > arr[i].length()) {
                min = arr[i];
            }
            if (max.length() < arr[i].length()) {
                max = arr[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(min).append(": ").append(min.length()).append(", ").append(max).append(": ").append(max.length());
        System.out.println(sb);
    }
}
