package algorithm.problem.inflearnKimTaeWon.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class IronBar2 {

    private static int solution(String str) {
        int answer = 0;
        Stack<Character> layer = new Stack<>();

        for (int i=0; i<str.toCharArray().length; i++) {
            if (str.charAt(i) == '(') {
                layer.push(str.charAt(i));
            } else {
                layer.pop();
                if (str.charAt(i - 1) == '(') {
                    answer += layer.size();
                } else {
                    answer ++;
                }
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
