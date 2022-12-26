package ss18_String;

import java.util.Scanner;

public class ValidateNameClass {
    private static String VALIDATENAMECLASS = "^[CAP][0-9]{4}[GHIKLM]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameClass = scanner.nextLine();
        System.out.println(nameClass.matches(VALIDATENAMECLASS));
    }
}
