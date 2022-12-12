package ss7_truu_tuong.Geometry;

public class Square extends HinhHoc implements Resizeable {
    public double x;
    public double area;
    public double perimeter;

    public Square(String color, double x) {
        super(color);
        this.x = x;
    }

    public Square() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getArea() {
        return this.x*this.x;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + x +
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
