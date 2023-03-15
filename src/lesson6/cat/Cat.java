package lesson6.cat;

public class Cat {
    String name;
    int fullYears;
    int saturationOfTheCat;

    public Cat() {
    }

    public Cat(int saturationOfTheCat) {
        this.saturationOfTheCat = saturationOfTheCat;
    }

    void feeding(int saturationOfTheCat) {
        if (saturationOfTheCat <= 100) {
            System.out.println(name + " не наелся");
        } else {
            System.out.println(name + " наелся");
        }
    }
}

