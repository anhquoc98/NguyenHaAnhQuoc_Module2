package lop_va_doi_tuong_java.QuadraticEquation.quadratic_equation;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a :");
        double a = Integer.parseInt(scanner.nextLine());
        System.out.println("Input b:");
        double b = Integer.parseInt(scanner.nextLine());
        System.out.println("Input c:");
        double c = Integer.parseInt(scanner.nextLine());
        lop_va_doi_tuong_java.QuadraticEquation.quadratic_equation.QuadraticEquation1 equation = new lop_va_doi_tuong_java.QuadraticEquation.quadratic_equation.QuadraticEquation1(a, b, c);
        if (equation.delta() >= 0) {
            System.out.println("Phương trình có 2 nghiệm x1 =" + equation.getX1() + "x2 =" + equation.getX2());
        } else if (equation.delta() == 0) {
            System.out.println("Phương trình có 1 nghiệm x ="+equation.getX());
        }
        else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
