package ss5_access_modifier.Student.AccessModifier;

public class AccessModifier {
    public String color;

    public double getArer() {
        return Arer=this.radius*this.radius*Math.PI;
    }

    public double Arer;
    private double radius;

    public AccessModifier(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public AccessModifier() {
        this("red",1);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "AccessModifier{" +
                "color='" + color + '\'' +
                ", Arer=" + Arer +
                ", radius=" + radius +
                '}';
    }
}
