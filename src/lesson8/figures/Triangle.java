package lesson8.figures;

public class Triangle implements Figure {
    private float sideA;
    private float sideB;
    private float sideC;

    public Triangle() {
    }

    public Triangle(float sideA, float sideB, float sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public float perimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public float area() {
        float per = perimeter();
       return (float) Math.sqrt(per * (per - sideA) * (per - sideB) * (per - sideC));


    }
}

