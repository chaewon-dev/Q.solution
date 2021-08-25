package algorithm.problem.inflearnKimTaeWon.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSequence {
    public static ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        fibonacci(n, answer);
        return answer;
    }

    public static void fibonacci(int n, ArrayList<Integer> answer) {

        if (n == 2) {
            answer.add(1);
            fibonacci(n - 1, answer);
        } else if (n == 1) {
            answer.add(1);
        } else if (n > 2) {
            fibonacci(n - 1, answer);
            answer.add(answer.get(n - 2) + answer.get(n - 3));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> answer = solution(n);
        for (int i = 0; i < n; i++) {
            System.out.print(answer.get(i) + " ");

        }
    }
}
