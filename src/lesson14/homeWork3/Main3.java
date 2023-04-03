package lesson14.homeWork3;

public class Main3 extends Thread {

    @Override
    public void run() {
        count();
    }
    private static void count(){
        synchronized (Example3.class){
            for (int i = 0; i < 1000000; i++)
            {
                Example3.count++;
            }
        }
    }
}
