package ss7_truu_tuong;

public class Rectangle extends HinhHoc implements Resizeable{
    public double x;
    public double y;
    public double area;
    public double perimeter;

    public Rectangle(String color, double x, double y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public Rectangle() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea() {
        return this.x*this.y;
    }

    public void setArea(double area) {
        this.area = area;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
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
