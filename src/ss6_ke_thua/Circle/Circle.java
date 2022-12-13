package ss6_ke_thua.Circle;

public class Circle {
    private float banKinh;
    private String color;

    public Circle(float banKinh, String color) {
        this.banKinh = banKinh;
        this.color = color;
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
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
                "r=" + banKinh +
                ", color='" + color + '\'' +
                '}';
    }
}
