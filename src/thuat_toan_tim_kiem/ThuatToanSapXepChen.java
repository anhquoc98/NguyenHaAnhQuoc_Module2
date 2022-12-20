package thuat_toan_tim_kiem;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ThuatToanSapXepChen {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > key) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = key;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberLength = Integer.parseInt(scanner.nextLine());
        int[] array = new int[numberLength];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập các phần tử trong mảng" + i);
            int value = Integer.parseInt(scanner.nextLine());
            array[i] = value;
        }
        sort(array);
    }
}
