package ss14_thuat_toan_tim_kiem;

import java.util.Arrays;
import java.util.Scanner;

public class MinhHoaThuatToanSapXep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberLength = Integer.parseInt(scanner.nextLine());
        int[] array = new int[numberLength];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập các phần tử trong mảng" + i);
            int value = Integer.parseInt(scanner.nextLine());
            array[i] = value;
        }
        for (int i = 0; i < array.length; i++) {
            int key = array[i];
            int j = i;
            for (; j > 0&&array[j - 1] > key; j--) {

                    array[j] = array[j - 1];
                System.out.println(Arrays.toString(array));

            } array[j] = key;
        }
        System.out.println(Arrays.toString(array));
    }
}
