package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class MainTask0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int num = scanner.nextInt();
        int[] arr = {2, 12, 5, 15, 13, 54, 7};
        System.out.println(Arrays.toString(arr));
        boolean found = Arrays.stream(arr).anyMatch(i -> i == num);
        for (int i = 0; i < arr.length; i++)
            if (found == true) {
                System.out.println("Число входит в массив");
                break;
            } else {
                System.out.println("Число не входит в массив");
                break;
            }
    }
}
