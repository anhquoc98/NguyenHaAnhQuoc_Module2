package ss11_stack_queue;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocCacPhanTuTrongStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        int []array = new int[stack.size()];
        for (int i = 0; i <array.length ; i++) {
            array[i]=stack.pop();
        }
        System.out.println(Arrays.toString(array));
    }
}
