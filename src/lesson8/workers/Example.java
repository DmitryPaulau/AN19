package lesson8.workers;

public class Example {
    public static void main(String[] args) {
        Director director = new Director();
        Workman workman = new Workman();
        Accountant accountant = new Accountant();

        director.postWithdrawal();
        workman.postWithdrawal();
        accountant.postWithdrawal();
    }
}
