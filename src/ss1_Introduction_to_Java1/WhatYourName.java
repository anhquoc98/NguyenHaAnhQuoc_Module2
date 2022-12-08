package Introduction_to_Java1;

import java.util.Scanner;

public class WhatYourName {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Tên Bạn Là Gì");
        String name =scanner.nextLine();
        System.out.println("Hello :"+name);
    }
}
