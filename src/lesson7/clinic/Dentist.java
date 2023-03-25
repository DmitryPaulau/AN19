package lesson7.clinic;

public class Dentist implements Doctor {
    @Override
    public void treat() {
        System.out.println("Стоматолог рот тебе открывает значит, копается там, тебе больно, но в итоге ходишь и улыбаешься");
    }
}
