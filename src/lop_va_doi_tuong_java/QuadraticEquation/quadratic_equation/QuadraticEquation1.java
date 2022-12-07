package lop_va_doi_tuong_java.QuadraticEquation.quadratic_equation;

public class QuadraticEquation1 {
    public static void ptBacHai(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta == 0) {
            System.out.println("Phương trình có 1 nghiệm" + ((-b) / 2 * a));
        } else if (delta > 0) {
            double x1 = ((-b + Math.sqrt(delta)) / (2 * a));
            double x2 = ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phương trình có 2 nghiệm: x1=" + x1 + " x2=" + x2);
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
