package ss13_thuat_toan_tim_kiem;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CalculateTheComplexityOfTheAlgorithm {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời nhập vào 1 chuổi :");
        String newString = scanner.nextLine().toLowerCase();
        Map<String,Integer> integerMap=new TreeMap<>();
        int count =0;
        for (int i = 0; i <newString.length() ; i++) {

            if (integerMap.containsKey(newString.charAt(i)+"")){
                integerMap.put(newString.charAt(i)+"",integerMap.get(newString.charAt(i) + "") + 1);
                count ++;
            }
            else {
                integerMap.put(newString.charAt(i) + "", 1);
            }
        }
        System.out.println("Số lần xuật hiện các từ :"+integerMap +"xuất hiện nhiều nhất"+count);
    }
}
