package ss11_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiNhiPhuongSangHeThapPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số bạn muốn chuyển đổi :");
        int inputNumber = Integer.parseInt(scanner.nextLine());
        int soDu = 0;
        Stack<Integer> stack = new Stack<>();
        while (inputNumber > 0) {
            soDu = inputNumber % 2;
            stack.push(soDu);
            inputNumber = inputNumber / 2;
        }
        while (!stack.empty()) {

            System.out.print(stack.pop());
        }

    }
}
