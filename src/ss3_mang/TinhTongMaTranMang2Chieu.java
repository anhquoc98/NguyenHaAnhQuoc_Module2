package Mang;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongMaTranMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("input Length :");
        int length =Integer.parseInt(scanner.nextLine());
        int []arr1 =new int[length];
        System.out.println("Array 1:");
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println("Input number at Index ["+i+"]");
            int value =Integer.parseInt(scanner.nextLine());
            arr1[i]=value;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("Array 2:");
        int []arr2=new int[length];
        for (int i = 0; i <arr2.length ; i++) {
            System.out.println("Input number at Index ["+i+"]");
            int value =Integer.parseInt(scanner.nextLine());
            arr2[i]=value;
        }
        System.out.println(Arrays.toString(arr2));
        int sum =0;
        int [][]arr ={arr1,arr2};
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i ==j){
                    sum +=arr[i][i];
                }

            }
        }
        System.out.println("sum ="+sum);
    }
}
