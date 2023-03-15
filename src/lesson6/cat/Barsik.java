package lesson6.cat;

import java.util.Scanner;

public class Barsik {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Scanner scanner = new Scanner(System.in);
        cat.name = "Barsik";
        System.out.println("Введите количество корма в граммах: ");
        cat.saturationOfTheCat = scanner.nextInt();
        cat.feeding(cat.saturationOfTheCat);
    }


}
