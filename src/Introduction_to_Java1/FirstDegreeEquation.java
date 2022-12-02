package Introduction_to_Java1;

import java.util.Scanner;

public class FirstDegreeEquation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("a :");
        double a = scanner.nextDouble();
        System.out.println("b :");
        double b = scanner.nextDouble();
        System.out.println("c :");
        double c = scanner.nextDouble();
        if (a != 0){
            double answer =(c -b)/a;
            System.out.println(answer);
        }
        else {
            if (b ==c){
                System.out.println("Phương trình vô số nghiệm");
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
