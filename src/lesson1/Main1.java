package lesson1;

import java.io.Console;

public class Main1 {
    public static void main(String[] args) {
        Console con = System.console();
        String name = con.readLine( "Введите свое имя: ");
        System.out.println("Добро пожаловать, " + name);
    }
}
