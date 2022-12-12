package ss7_truu_tuong;

public class Circle extends HinhHoc implements Resizeable{
    public double r;
    public double area;
    public double perimeter;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea() {
        return this.r*this.r*Math.PI;
    }

    public void setArea(double area) {
        this.area =area;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void resize(double percent) {
        System.out.println(getArea()*percent);

    }
}
