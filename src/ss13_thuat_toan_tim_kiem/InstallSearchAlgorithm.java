package ss13_thuat_toan_tim_kiem;


import java.util.Arrays;
import java.util.Scanner;

public class InstallSearchAlgorithm {
    public static int binarySearch(int[] array, int value, int left, int right) {


        int middle = (left + right) / 2;
        if (value == middle) {
            return middle;
        } else if (value > array[middle]) {
            return binarySearch(array, value, middle + 1, right);
        } else if (value <array[middle]) {
            return binarySearch(array, value, left, middle -1);

        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều dài của mảng");
        int numberLength = Integer.parseInt(scanner.nextLine());
        int[] array = new int[numberLength];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử tại vị trí " + i);
            int value = Integer.parseInt(scanner.nextLine());
            array[i] = value;
        }
        Arrays.sort(array);
        System.out.println("Mảng có các phần tử đã sắp xếp :");
        System.out.println(Arrays.toString(array));
        System.out.println("Bạn kiếm phần tử số mấy");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("vị trí bạn tìm kiếm ở vị trí :");
        System.out.println(Arrays.binarySearch(array, number, 0, numberLength));
    }
}
