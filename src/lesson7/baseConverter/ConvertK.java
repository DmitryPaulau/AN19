package lesson7.baseConverter;

import java.util.Scanner;

public class ConvertK implements BaseConverter {
    @Override
    public void convert(float tempC) {
        float tempK = (float) (tempC + 273.15);
        System.out.println("Градус по Кельвину: " + tempK + "°K");
    }
}
