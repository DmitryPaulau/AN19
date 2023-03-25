package lesson7.clinic;

public class Surgeon implements Doctor {
    @Override
    public void treat() {
        System.out.println("Хирург что-то то там лечит хирургическое.");
    }
}
