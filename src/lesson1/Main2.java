package lesson1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кто ты, чел? ");
        String name = scanner.next();
        System.out.println("Здарова, " + name + '\u2755');

    }
}
