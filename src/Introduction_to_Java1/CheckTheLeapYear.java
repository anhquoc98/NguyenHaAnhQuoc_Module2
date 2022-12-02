package Introduction_to_Java1;

import java.util.Scanner;

public class CheckTheLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("kiểm tra năm nhuận");
        int year = scanner.nextInt();
        boolean isLeapYear =false;
        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
                    isLeapYear =true;
//                }
//            }
        } else {
            isLeapYear =false;
        }
        if (isLeapYear){
            System.out.println("năm nhuận");
        }else {
            System.out.println("năm không nhuận");
        }
    }
}

