package Vong_lap_java;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn Cần bao nhiêu số nguyên tố");
        int count1 = Integer.parseInt(scanner.nextLine());
        int dem = 0;
        int snt = 2;
        while (dem < count1) {
            int count = 0;
            for (int i = 1; i <= snt; i++) {
                if (snt % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(snt);
                dem++;
            }
            snt++;
        }
    }
}
