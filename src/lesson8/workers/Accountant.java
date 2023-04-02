package lesson8.workers;

public class Accountant implements Worker{
    @Override
    public void postWithdrawal() {
        System.out.println("Должность: Бухгалтер");
    }
}
