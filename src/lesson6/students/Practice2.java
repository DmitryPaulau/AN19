package lesson6.students;

import java.util.Random;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Studend studend = new Studend();
        System.out.println("Введите количество студентов: ");
        int numberOfStudends = scanner.nextInt();
        System.out.println("Введите номер группы");
        studend.group = scanner.next();
        for (int i = 0; i < numberOfStudends; i++) {
            studend.name = "Какое то имя студента";
            Random random = new Random();
            studend.grade = random.nextInt(11);
            if (studend.grade >= 9) {
                studend.fullDisplayInfo();
            }
        }
    }
}
