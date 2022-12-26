package ss18_String;

import java.util.Scanner;

public class ValidatePhone {
    private static String VALIDATEPHONE ="^(090|091|\\\\(84\\\\)\\\\+90|\\\\(84\\\\)\\\\+91)[\\\\d]{7}$";
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String phone =scanner.nextLine();
        System.out.println(phone.matches(VALIDATEPHONE));
    }
}
