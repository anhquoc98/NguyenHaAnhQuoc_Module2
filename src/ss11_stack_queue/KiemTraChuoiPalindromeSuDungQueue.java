package ss11_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class KiemTraChuoiPalindromeSuDungQueue {
    public static void main(String[] args) {
        Queue<String> elementQ= new LinkedList<>();
        Stack<String> elementS =new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Người dùng nhập vào 1 chuổi");
        String string =scanner.nextLine().toLowerCase();
        for (int i = 0; i <string.length() ; i++) {
            elementQ.offer(string.charAt(i)+"");
            elementS.push(string.charAt(i)+"");
        }
        boolean result =true;
        for (int i = 0; i <string.length() ; i++) {
            String queue =elementQ.poll();
            String stack =elementS.pop();
            if (!queue.equals(stack)){
                result =false;
            }
        }
        if (result){
            System.out.println("Là chuỗi palindrome");
        }
        else {
            System.out.println("Không phải là chuỗi palindrome");
        }
    }
}
