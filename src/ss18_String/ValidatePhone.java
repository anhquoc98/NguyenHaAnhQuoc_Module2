package ss18_String;

import java.util.Scanner;

public class ValidatePhone {
    private static String VALIDATEPHONE ="^[(]+[0-9]{2}+[)]+[-]+[(]+[0]+[0-9]{9}+[)]$";
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String phone =scanner.nextLine();
        System.out.println(phone.matches(VALIDATEPHONE));
    }
}
