package lesson7.phone;

public class Phone {
    private String number;
    private String model;
    private float weight;

    private String callerName;

    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, float weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getCallerName() {
        return callerName;
    }

    public void setCallerName(String callerName) {
        this.callerName = callerName;
    }

    public void display() {
        System.out.println("Номер: " + number + "\n" + "Модель: " + model + "\n" + "Масса: " + weight + "гр.");
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void getNumberPhone() {
        System.out.println(number);
    }

    public void receiveCall(String callerName, String number) {
        System.out.println("Звонит " + callerName);
    }

    public void sendMessage(String number, String... message) {
        for (String str : message) {
            System.out.print(str);
        }
        System.out.println(number);
    }
}
