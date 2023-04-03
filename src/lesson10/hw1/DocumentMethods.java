package lesson10.hw1;

public class DocumentMethods {
    public static void output2Blocks(String document) {
        String[] text = document.split("-");
        System.out.println(text[0] + text[1]);
    }

    public static void changeToStars(String document) {
        StringBuilder sb = new StringBuilder(document);
        System.out.println(sb.replace(5, 8, "***").replace(14, 17, "***"));
    }

    public static void letterOutput(String document) {
        String[] text = document.split("-");
        StringBuilder sb = new StringBuilder(document);
        System.out.println(sb.delete(0, document.length()).append(text[1].toLowerCase()).append("/").append(text[3].toLowerCase()).append("/").append(text[4].toLowerCase().charAt(1)).append("/").append(text[4].toLowerCase().charAt(3)));
    }

    public static void outputInUpperCase(String document) {
        String[] text = document.split("-");
        StringBuilder sb = new StringBuilder(document);
        System.out.println(sb.replace(0, document.length(), "Letters:").append(text[1].toUpperCase()).append("/").append(text[3].toUpperCase()).append("/").append(text[4].toUpperCase().charAt(1)).append("/").append(text[4].toUpperCase().charAt(3)));
    }

    public static void sequenceCheck(String document) {

        if (document.regionMatches(true, 5, "abc", 0, 3) || document.regionMatches(true, 14, "abc", 0, 3)) {
            System.out.println("Сочетание есть в строке");
        } else {
            System.out.println("Сочетаний нет");
        }
    }

    public static void checkSequenceOfNumbers(String document) {
        if (document.regionMatches(0, "555", 0, 3)) {
            System.out.println("Номер начинается на 555");
        } else {
            System.out.println("Совпадения нет");
        }
    }
    public static void matchCheck(String document){
        if (document.regionMatches(18, "1a2b", 0, 4)) {
            System.out.println("Номер заканчивается на 1a2b");
        } else {
            System.out.println("Совпадения нет");
        }
    }
}
