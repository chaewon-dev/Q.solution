package algorithm.problem.inflearnKimTaeWon.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class PostfixOperation {
    private static int solution(String str) {
        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == '+') {
                stack.push(stack.pop() + stack.pop());
            } else if (x == '-') {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if (x == '*') {
                stack.push(stack.pop() * stack.pop());
            } else if (x == '/') {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b / a);
            } else {
                stack.push(x-'0');
            }
        }

        return stack.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));

    }


}
