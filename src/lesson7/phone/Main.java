package lesson7.phone;

public class Main {
    public static void main(String[] args) {
        Phone phone0 = new Phone("+375291112233", "Samsung", 210.3F);
        Phone phone1 = new Phone("+375294445566", "Xiaomi", 315.4F);
        Phone phone2 = new Phone("+375297778899", "Nokia", 999.9F);

        phone0.display();
        phone1.display();
        phone2.display();

        phone0.receiveCall("Наруто");
        phone1.receiveCall("Саске");
        phone2.receiveCall("Сакура");

        phone0.getNumberPhone();
        phone1.getNumberPhone();
        phone2.getNumberPhone();

        phone0.receiveCall("Наруто", "+375291112233");
        phone1.receiveCall("Саске", "+375294445566");
        phone2.receiveCall("Сакура", "+375297778899");


        phone0.sendMessage("+375291112233", "Привет ", "Что куда зачем ");
        phone1.sendMessage("+375294445566", "Привет ", "Кто ты? ");
        phone2.sendMessage("+375297778899", "Куда ", "несет ", "дым ", "куда ", "бегут ", "все ", "эти ", "люди ");
    }
}
