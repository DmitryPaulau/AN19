package lesson6.computer;

public class HDD {
    String name;
    float capacity;
    String type;

    public HDD() {
    }

    public HDD(String name, float capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }
    void show(){
        System.out.println("HDD: " + name + " " + capacity + " " + type + " ");
    }
}
