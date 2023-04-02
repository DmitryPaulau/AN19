package lesson8.figures;

public class Rectangle implements Figure {
    private float side;

    public Rectangle() {
    }

    public Rectangle(float side) {
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public float perimeter() {
        return 4 * side;
    }

    @Override
    public float area() {
        return side * side;
    }
}
