package lesson14.homeWork1;

public class MyTread extends Thread {
    public int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            count++;
            System.out.println("Работа" + getName());
        }
    }
}
