package lesson7.baseConverter;

import java.util.Scanner;

public class ConvertF implements BaseConverter {
    @Override
    public void convert(float tempC) {
        float tempF = (float) ((tempC * 1.8) + 32);
        System.out.println("Градус по Фаренгейту: " + tempF + "°F");
    }
}
