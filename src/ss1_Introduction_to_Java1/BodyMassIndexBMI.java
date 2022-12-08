package Introduction_to_Java1;

import java.util.Scanner;

public class BodyMassIndexBMI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập Cân nặng");
        double weight =Double.parseDouble(scanner.nextLine());
        System.out.println("nhập chiều cao");
        double height =Double.parseDouble(scanner.nextLine());
        double bmi =weight/(height*2);
        System.out.println("chỉ số BMI :"+bmi);
        if (bmi<18.5){
            System.out.println("underweight");
        } else if (bmi<25) {
            System.out.println("nomal");
        } else if (bmi<30) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}
