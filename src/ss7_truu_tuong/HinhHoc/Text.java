package ss7_truu_tuong.HinhHoc;

public class Text {
    public static void main(String[] args) {
        Shape[] shape = new Shape[3];

        Shape shape1 = new Circle("yellow", false, 9);
        shape[0] = shape1;
        Circle shape11 = (Circle) shape1;
        shape11.howToColor();
        shape[1] = new Rectangle("black", true, 5,10 );
        shape[2] = new Square("red",true,5);
        shape[1].howToColor();
        shape[2].howToColor();

    }
}
