package ss11_stack_queue;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DemSoXuatHienGiuaCacPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập văn bản muốn hiển thị");
        String string = scanner.nextLine().toLowerCase();
        Map<String, Integer> integerMap = new TreeMap<>();
        for (int i = 0; i < string.length(); i++) {
            if (integerMap.containsKey(string.charAt(i) + "")) {
                integerMap.put(string.charAt(i) + "", integerMap.get(string.charAt(i) + "") + 1);
            } else {
                integerMap.put(string.charAt(i) + "", 1);
            }
        }
        System.out.println("Số lần xuất hiện của các từ: ");
        System.out.println(integerMap);
    }
}

