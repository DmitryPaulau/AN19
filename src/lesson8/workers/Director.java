package lesson8.workers;

public class Director implements Worker {
    @Override
    public void postWithdrawal() {
        System.out.println("Должность: Директор");
    }
}
