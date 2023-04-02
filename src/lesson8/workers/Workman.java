package lesson8.workers;

public class Workman implements Worker{
    @Override
    public void postWithdrawal() {
        System.out.println("Должность: Рабочий");
    }
}
