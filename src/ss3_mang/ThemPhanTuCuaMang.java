package Mang;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTuCuaMang {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input Length:");
        int length =Integer.parseInt(scanner.nextLine());
        int []arr = new int[length];
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Input number at Index [" + i + "]");
            int value =Integer.parseInt(scanner.nextLine());
            arr[i]=value;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Input add arr:");
        int arr1 =Integer.parseInt(scanner.nextLine());
        arr =Arrays.copyOf(arr,arr1 +1);
        //arr[arr1]=Integer.parseInt(scanner.nextLine());
        System.out.println("Index arr");
        int inputIndexAdd =Integer.parseInt(scanner.nextLine());
        for (int i = arr.length-1; i >inputIndexAdd ; i--) {
            arr[i]=arr[i-1];
        }
        arr[inputIndexAdd]=arr1;
        System.out.println(Arrays.toString(arr));
    }
}
