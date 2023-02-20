package lesson2;

import java.util.Scanner;

public class Main15 {
    static final float INTEREST_RATE = 1.07F;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        float depositАmount = scanner.nextFloat();
        System.out.println("Введите количество месяцев");
        float numberOfMonths = scanner.nextFloat();
        float finalCost;

        for (float i = 0; i < numberOfMonths; i++) {
            finalCost = (float) (depositАmount * INTEREST_RATE);
            System.out.println(finalCost);
            depositАmount = finalCost;
        }
    }
}
