package lesson6.computer;

public class Computer {
    float price;
    String model;
    RAM ram;
    HDD hdd;

    public Computer() {
    }

    public Computer(float price, String model) {
        this.price = price;
        this.model = model;
    }

    public Computer(float price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    void show() {
        System.out.println("Computer: " + price + " " + model + " ");
        if (ram != null) {
            ram.show();
        }
        if (hdd != null) {
            hdd.show();
        }
    }
}
