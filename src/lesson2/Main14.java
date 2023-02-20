package lesson2;

public class Main14 {
    public static void main(String[] args) {
        int i = 0;
        int x = 1;
        int z;
        System.out.println(i + "\n" + x + " ");
        for (int y = 3; y <= 11; y++) {
            z = i + x;
            System.out.println(z);
            i = x;
            x = z;

        }
    }
}



