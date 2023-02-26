package lesson2;

import java.util.Scanner;

public class Сonstruction4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Что там на улице сейчас?");
        int temp = scanner.nextInt();
        if (temp > -5) {
            System.out.println("Тепло");
        } else if (temp > -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }
    }
}
