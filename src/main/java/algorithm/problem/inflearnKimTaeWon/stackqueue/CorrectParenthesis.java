package algorithm.problem.inflearnKimTaeWon.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class CorrectParenthesis {
    private static String solution(String str) {
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            }else{
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }
        String answer = "YES";
        if (!stack.isEmpty()) {
            answer = "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));

    }


}
