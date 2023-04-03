package lesson14.homeWork3;

public class Example3 {
    public static int count = 0;

    public static void main(String[] args) throws InterruptedException {

        Main3 main1 = new Main3();
        Main3 main2 = new Main3();
        Main3 main3 = new Main3();

        main1.start();
        main2.start();
        main3.start();
        main1.join();
        main2.join();
        main3.join();

        System.out.println(count);
    }
}
