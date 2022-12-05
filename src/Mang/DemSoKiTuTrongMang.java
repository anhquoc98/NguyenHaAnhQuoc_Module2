package Mang;

import java.util.Scanner;

public class DemSoKiTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input sysmbol: ");
        String str = scanner.nextLine();
        char[] str1 = str.toCharArray();
        char m = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str1.length; i++) {
            if (str1[i] == m) {
                count++;
            }
        }
        System.out.println("số lần kí tự"+m+"xuất hiện trong chuổi"+count);
    }
}
