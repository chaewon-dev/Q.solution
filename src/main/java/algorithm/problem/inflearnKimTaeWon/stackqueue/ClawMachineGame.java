package algorithm.problem.inflearnKimTaeWon.stackqueue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ClawMachineGame {
    private static int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        ArrayList<Stack<Integer>> bStack = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            bStack.add(new Stack<Integer>());
            for (int j = n-1; j >= 0; j--) {
                if (board[j][i] != 0) {
                    bStack.get(i).add(board[j][i]);
                }
            }
        }
        Stack<Integer> result = new Stack<>();

        for (int x : moves) {
            if (!bStack.get(x - 1).isEmpty()) {
                result.add(bStack.get(x - 1).pop());
                int resultLen = result.size();
                if (resultLen >= 2 && result.get(resultLen - 2) == result.get(resultLen - 1)) {
                    result.pop();result.pop();
                    answer += 2;
                }
            }

        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(solution(n, board, m, moves));


    }


}
