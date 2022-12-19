package ss13_thuat_toan_tim_kiem;


import java.util.Arrays;
import java.util.Scanner;

public class InstallSearchAlgorithm {
    public static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        while (left > right) {
            int middle = (left + right) / 2;
            if (value == middle) {
                return middle;
            } else if (value > array[middle]) {
                left = middle + 1;
            } else if (value < array[middle]) {
                left = middle - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int numberLength =Integer.parseInt(scanner.nextLine());
        int[] array = new int[numberLength];
        for (int i = 0; i <array.length ; i++) {
            int value =Integer.parseInt(scanner.nextLine());
            array[i]=value;
        }
        Arrays.sort(array);
        System.out.println("Mảng có các phần tử");
        System.out.println(Arrays.toString(array));
        System.out.println("Bạn kiếm phần tử số mấy");
        int number =Integer.parseInt(scanner.nextLine());
        System.out.println("vị trí bạn tìm kiếm ở vị trí :");
        System.out.println(Arrays.binarySearch(array,number));
    }
}
