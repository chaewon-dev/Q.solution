package algorithm.problem.inflearnKimTaeWon.DFS_BFS_examples;

import java.util.Scanner;

public class Combination {

    static int[][] nrArr;

    static int comb(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        } else {
            if (nrArr[n][r] > 0) {
                return nrArr[n][r];
            } else {
                return nrArr[n][r] = comb(n - 1, r - 1) + comb(n - 1, r);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        nrArr = new int[n + 1][r + 1];
        System.out.println(comb(n, r));

    }
}
