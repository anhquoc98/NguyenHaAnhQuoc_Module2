package ss7_truu_tuong.HinhHoc;

public class Square extends Shape implements Colorable{
    public double x;

    public Square(String color, boolean fill, double x) {
        super(color, fill);
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
    public double getArea(){
        return this.x*this.x;
    }

    @Override
    public void howToColor() {
        if (isFill()){
            System.out.println(this.color+"Color all four sides Area:"+getArea());
        }
        else {
            System.out.println("No Color Area:"+getArea());
        }
    }
}
