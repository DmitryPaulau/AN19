package lesson10;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        System.out.println("Введите текст:");
        Scanner scanner = new Scanner(System.in);
        String [] strings = scanner.nextLine().split("[ /.,]");
        String maxWord = strings[0];
        String minWord = strings[0];
        for (String string : strings) {
            if (maxWord.length() <= string.length()) {
                maxWord = string;
            }
            if (minWord.length() >= string.length()) {
                minWord = string;
            }
        }
        System.out.println("Max слово: " + maxWord );
        System.out.println("Min слово: " + minWord);
    }
}
