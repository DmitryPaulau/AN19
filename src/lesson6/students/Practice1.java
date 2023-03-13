package lesson6.students;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Studend studend = new Studend();
        System.out.println("Введите количество студентов: ");
        int numberOfStudents = scanner.nextInt();
        System.out.println("Введите номер группы: ");
        studend.group = scanner.next();
        for (int i = 0; i < numberOfStudents; i++) {
            studend.displayInfo();
        }
    }
}


