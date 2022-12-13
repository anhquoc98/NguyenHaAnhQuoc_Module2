package ss7_truu_tuong.HinhHoc;

public  class Circle extends Shape implements Colorable{
    public double r;

    public Circle(String color, boolean fill, double r) {
        super(color, fill);
        this.r = r;
    }

    public Circle() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double getArea(){
        return this.r*this.r*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                ", color='" + color + '\'' +
                ", fill=" + fill +
                '}';
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
