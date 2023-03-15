package lesson6.students;

import java.util.Arrays;

public class Practice0 {
    public static void main(String[] args) {
        Studend studend = new Studend();
        String[] arr = new String[14];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = studend.name;
        }
        System.out.println(Arrays.toString(arr));
    }

}
