package lop_va_doi_tuong_java.QuadraticEquation.quadratic_equation;

import java.util.Scanner;

import static lop_va_doi_tuong_java.QuadraticEquation.quadratic_equation.QuadraticEquation1.ptBacHai;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a :");
        double a = Integer.parseInt(scanner.nextLine());
        System.out.println("Input b:");
        double b = Integer.parseInt(scanner.nextLine());
        System.out.println("Input c:");
        double c = Integer.parseInt(scanner.nextLine());
        ptBacHai( a, b, c);
        System.out.println();
    }
}
