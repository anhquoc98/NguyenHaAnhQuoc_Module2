package lop_va_doi_tuong_java.QuadraticEquation.quadratic_equation;

public class QuadraticEquation1 {
    //    public static void ptBacHai(double a, double b, double c) {
//        double delta = b * b - 4 * a * c;
//        if (delta == 0) {
//            System.out.println("Phương trình có 1 nghiệm" + ((-b) / 2 * a));
//        } else if (delta > 0) {
//            double x1 = ((-b + Math.sqrt(delta)) / (2 * a));
//            double x2 = ((-b - Math.sqrt(delta)) / (2 * a));
//            System.out.println("Phương trình có 2 nghiệm: x1=" + x1 + " x2=" + x2);
//        } else {
//            System.out.println("Phương trình vô nghiệm");
//        }
//    }
    private double a;
    private double b;
    private double c;
    public double delta;
    public double x1;
    public double x2;

    public QuadraticEquation1(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public double delta(){
        return (delta=Math.pow(this.b,2)-4*this.a*this.c);
    }
    public double getX1(){
        return x1=(-this.b+Math.sqrt(delta())/2*this.a);
    }
    public double getX2(){
        return x2=(-this.b-Math.sqrt(delta())/2*this.a);
    }
    public double getX(){
        return -this.b/2*this.a;
    }

}
