package lesson14.homeWork2;

import lesson14.homeWork3.Example3;

public class Main2 extends Thread {
    @Override
    public void run() {
        count();
    }

    private static void count() {
        synchronized (Example2.syncObject) {
            for (int i = 0; i < 1000000; i++) {
                Example2.count++;
            }
        }
    }
}
