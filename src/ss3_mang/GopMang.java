package Mang;

import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int []arrA={1,2,3,4};
        int []arrB={5,6,7,8};
        int []arrC = new int[arrA.length+arrB.length];
        int count =0;
        for (int i = 0; i < arrA.length; i++) {
            arrC[count]=arrA[i];
            count++;
        }
        for (int i = 0; i < arrB.length; i++) {
            arrC[count]=arrB[i];
            count++;
        }
        System.out.println(Arrays.toString(arrC));
    }
}
