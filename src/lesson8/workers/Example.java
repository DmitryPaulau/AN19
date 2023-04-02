package lesson8.workers;

public class Example {
    public static void main(String[] args) {
        Worker director = new Director();
        Worker workman = new Workman();
        Worker accountant = new Accountant();

        director.postWithdrawal();
        workman.postWithdrawal();
        accountant.postWithdrawal();
    }
}
