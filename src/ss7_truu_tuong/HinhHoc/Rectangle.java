package ss7_truu_tuong.HinhHoc;

public class Rectangle extends Shape implements Colorable {
    public double x;
    public double y;

    public Rectangle(String color, boolean fill, double x, double y) {
        super(color, fill);
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
    public double getArea(){
        return this.x*this.y;
    }

    @Override
    public void howToColor() {
        if (isFill()){
            System.out.println(this.color+"Color all four sides");
        }
        else {
            System.out.println("No Color");
        }
    }

}
