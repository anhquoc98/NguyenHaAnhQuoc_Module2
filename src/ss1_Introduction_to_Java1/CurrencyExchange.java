package Introduction_to_Java1;

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("bạn chuyển tiền đô sang việt");
        float USA = scanner.nextFloat();
        float VND = USA*23000;
        System.out.println("Tiền :"+VND +"Đ");
    }
}
