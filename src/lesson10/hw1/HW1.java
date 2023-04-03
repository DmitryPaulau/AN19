package lesson10.hw1;

import java.util.Scanner;

public class HW1 extends DocumentMethods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String documentNumber;
        System.out.println("Введите номер документа формата xxxx-yyy-xxxx-yyy-xyxy  (x- число, y- буква)");
        documentNumber = scanner.next();
        DocumentMethods.output2Blocks(documentNumber);
        DocumentMethods.changeToStars(documentNumber);
        DocumentMethods.letterOutput(documentNumber);
        DocumentMethods.outputInUpperCase(documentNumber);
        DocumentMethods.sequenceCheck(documentNumber);
        DocumentMethods.checkSequenceOfNumbers(documentNumber);
        DocumentMethods.matchCheck(documentNumber);
    }
}