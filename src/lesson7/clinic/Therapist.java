package lesson7.clinic;

public class Therapist implements Doctor {
    @Override
    public void treat() {
        System.out.println("Терапевт смотрит значит на тебя и как-то определяет, что с тобой не так");
    }
}
