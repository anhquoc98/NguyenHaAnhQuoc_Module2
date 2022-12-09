package ss6_ke_thua.Circle;

public class Circle {
    private float r;
    private String color;

    public Circle(float r, String color) {
        this.r = r;
        this.color = color;
    }

    public float getR() {
        return r;
    }

    public void setR(float r) {
        this.r = r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle() {
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", color='" + color + '\'' +
                '}';
    }
}
