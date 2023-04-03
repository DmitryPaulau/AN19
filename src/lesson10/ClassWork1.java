package lesson10;

import java.util.Scanner;

public class ClassWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк: ");
        int arrLenth = scanner.nextInt();
        String[] arr = new String[arrLenth];
        StringBuilder sb = new StringBuilder();
        int mid;
        int sum = 0;
        System.out.println("Введите значения массива: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.next();
            sum += arr[i].length();
        }
        mid = sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= mid) {
                sb.append("[").append(arr[i]).append(": ").append(arr[i].length()).append("]");
            }
        }
        System.out.println("Среднее значение: " + mid);
        System.out.println(sb);
    }
}
