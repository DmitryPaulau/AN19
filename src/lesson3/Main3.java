package lesson3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вводи число");
        if (scanner.hasNextInt()){
            int a = scanner.nextInt();
            System.out.println("Вы ввели " + a);
        }else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
