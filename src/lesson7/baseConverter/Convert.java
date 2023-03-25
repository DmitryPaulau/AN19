package lesson7.baseConverter;

import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        ConvertF convertF = new ConvertF();
        ConvertK convertK = new ConvertK();
        convertK.convert(15);
        convertF.convert(54);
    }
}
