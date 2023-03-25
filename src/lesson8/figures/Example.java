package lesson8.figures;

public class Example {
    public static void main(String[] args) {
        Circle circle = new Circle(13.5F);
        Rectangle rectangle = new Rectangle(10);
        Triangle triangle = new Triangle(10.2F, 15.4F, 12.1F);
        Object[] arr = new Object[5];
        arr[0] = circle;
        arr[1] = rectangle;
        arr[2] = circle;
        arr[3] = triangle;
        arr[4] = rectangle;
        float sumPer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == circle) {
                arr[i] = circle.perimeter();
            } else if (arr[i] == rectangle) {
                arr[i] = rectangle.perimeter();
            } else {
                arr[i] = triangle.perimeter();
            }
            sumPer += (float) arr[i];
        }
        System.out.println("Сумма периметров: " + sumPer);
    }
}
