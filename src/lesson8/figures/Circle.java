package lesson8.figures;

public class Circle implements Figure {
    private float rad;

    public Circle() {
    }

    public Circle(float rad) {
        this.rad = rad;
    }

    public float getRad() {
        return rad;
    }

    public void setRad(float rad) {
        this.rad = rad;
    }

    @Override
    public float perimeter() {
        return 2 * 3.14F * rad;
    }

    @Override
    public float area() {
        return 3.14F * rad * rad;
    }
}
