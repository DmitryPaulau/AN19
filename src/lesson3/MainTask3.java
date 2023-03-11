package lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class MainTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размеры массивов");
        int arrSize = scanner.nextInt();

        System.out.println("Введите допустимые значения массивов");
        int maxArrayValue = scanner.nextInt();
        int sum = 0;
        int sum1 = 0;
        float mid = 0;
        float mid1 = 0;

        int arr[] = new int[arrSize];
        int arr1[] = new  int[arrSize];
         for (int i = 0; i < arr.length; i++){
             arr[i] = (int) (Math.random() * maxArrayValue);
             sum += arr[i];
             mid = (float) sum / arr.length;
         }
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = (int) (Math.random() * maxArrayValue);
            sum1 += arr1[i];
            mid1 = (float) sum1 / arr1.length;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(" Среднее значение массива arr: " +  mid);
        System.out.println(" Среднее значение массива arr1: " +  mid1);
        if (mid > mid1){
            System.out.println("Среднее значение массива arr больше");
        }else if (mid < mid1){
            System.out.println("Среднее значение массива arr1 больше");
        }else {
            System.out.println("Средние значения массивов arr и arr1 равны");
        }


    }
}
