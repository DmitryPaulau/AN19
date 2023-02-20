package lesson2;

import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < x; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
