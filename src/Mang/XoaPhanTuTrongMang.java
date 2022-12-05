package Mang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input Length:");
        int length = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input number at Index [" + i + "]");
            int value = Integer.parseInt(scanner.nextLine());
            arr[i] = value;
        }
        System.out.println(Arrays.toString(arr));
        int remove =0;
        System.out.println("You want to remove in arr =");
        remove = Integer.parseInt(scanner.nextLine());
       ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == remove) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
