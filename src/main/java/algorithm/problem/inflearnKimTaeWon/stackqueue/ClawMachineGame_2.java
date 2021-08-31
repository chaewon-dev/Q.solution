package algorithm.problem.inflearnKimTaeWon.stackqueue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ClawMachineGame_2 {
    private static int solution(int n, int[][] board, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> result = new Stack<>();

        for (int x : moves) {
            for (int y = 0; y < n; y++) {
                if (board[y][x-1] != 0) {
                    if (!result.isEmpty() && board[y][x-1] == result.peek()) {
                        result.pop();
                        answer += 2;
                    } else {
                        result.push(board[y][x-1]);
                    }
                    board[y][x-1] = 0;
                    break;
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
