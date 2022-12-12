package ss7_truu_tuong.HinhHoc;

public abstract class Shape implements Colorable{
public String color ;
public boolean fill;

    public Shape(String color, boolean fill) {
        this.color = color;
        this.fill = fill;
    }

    public Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", fill=" + fill +
                '}';
    }
}
