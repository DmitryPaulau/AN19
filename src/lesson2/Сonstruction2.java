package lesson2;

import java.util.Scanner;

public class Сonstruction2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int num = scanner.nextInt();
        if (num == 1 || num == 2 || num == 12) {
            System.out.println("Зима");
        } else if (num == 3 || num == 4 || num == 5) {
            System.out.println("Весна");
        } else if (num == 6 || num == 7 || num == 8) {
            System.out.println("Лето");
        } else if (num == 9 || num == 10 || num == 11) {
            System.out.println("Осень");
        }
    }
}
