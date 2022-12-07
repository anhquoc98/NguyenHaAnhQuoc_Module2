package Mang;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TimPhanTuLonNhatMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int row,cos;
        System.out.println("Nhập dòng trong mảng");
        row =Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số cột trong mảng");
        cos =Integer.parseInt(scanner.nextLine());
        int [][]arr3= new int[row][cos];
        for (int i = 0; i <row ; i++) {
            for (int j = 0; j < cos; j++) {
                System.out.println("dòng"+i+"cột"+j);
                arr3[i][j]=Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(arr3));
        int max =arr3[0][0];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if (max<arr3[i][j]){
                    max =arr3[i][j];
                }
            }
        }
        System.out.println("The largest element in the array"+max);
    }
}
