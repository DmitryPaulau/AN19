package lesson6.computer;

public class ObjectComputer {
    public static void main(String[] args) {
        Computer computer1 = new Computer(156F, "Lenovo");
        computer1.show();
        HDD hdd = new HDD("Samsung",128F, "SSD");
        RAM ram = new RAM("Kingston", 8F);
        Computer computer2 = new Computer(3547F,"ACER", ram, hdd);
        computer2.show();
    }
}
