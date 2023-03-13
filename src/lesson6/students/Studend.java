package lesson6.students;

import java.util.Random;

public class Studend {
    String name;
    String group;
    int grade;


    public Studend() {
    }

    public Studend(String group) {
        this.group = group;

    }

    public Studend(String group, String name, int grade) {
        this.name = name;
        this.group = group;
        this.grade = grade;
    }

    void displayInfo() {
        Random random = new Random();
        this.grade = random.nextInt(11);
        System.out.println("Группа: " + group + "\n" + "Отметка: " + grade);
    }

    void fullDisplayInfo() {
        System.out.println("Студент: " + name + "\n" + "Группа: " + group + "\n" + "Отметка: " + grade);
    }

}


