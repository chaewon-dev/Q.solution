package algorithm.problem.inflearnKimTaeWon.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class IronBar {

    private static int solution(String str) {
        int answer = 0;
        int n = 0;
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                if (stack.peek() == '(') {
                    stack.push(x);
                    n--;
                    answer += n;
                } else {
                    stack.push(x);
                    n--;
                    answer++;
                }
            } else {
                stack.push(x);
                n++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));

    }
}
