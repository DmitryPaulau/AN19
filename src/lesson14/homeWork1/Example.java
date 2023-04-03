package lesson14.homeWork1;

public class Example {

    public static void main(String[] args) throws InterruptedException {
        MyTread myTread1 = new MyTread();
        MyTread myTread2 = new MyTread();
        MyTread myTread3 = new MyTread();

        myTread1.start();
        myTread1.join();
        myTread2.start();
        myTread2.join();
        myTread3.start();
    }
}
