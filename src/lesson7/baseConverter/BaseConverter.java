package lesson7.baseConverter;

import java.util.Scanner;

public class BaseConverter {

     static void convert() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру по Цельсию: ");
        float tempC = scanner.nextInt();
        float tempF = (float) ((tempC * 1.8) + 32);
        float tempK = (float) (tempC + 273.15);
        System.out.println("Температура: " + "\n" + "Градус по Цельсию: " + tempC + "°C" + "\n" + "Градус по Фаренгейту: " + tempF + "°F" + "\n" + "Градус по Кельвину: " + tempK + "°K");
    }
}
