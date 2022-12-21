package ss15_xu_ly_ngoai_le_debug;

import java.util.Scanner;

public class IllegalTriangleException {
    static void resultIllegalTriangleException(double a,double b,double c){
        try {
            if (a +b>c&&a+c>b&&b+c>a){
                System.out.println("Là cạnh tam giác");
            }
            else {
                throw new NewIllegalTriangleException();
            }
        }catch (NewIllegalTriangleException newIllegalTriangleException){
            System.out.println("không phải là cạnh tam giác");
        }finally {
            System.out.println("Kết thúc chương trình truyền hình tới đây kết thúc :)))");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a");
        int a = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập cạnh b");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cạnh c");
        int c = Integer.parseInt(scanner.nextLine());
    resultIllegalTriangleException(a,b,c);
    }
}
