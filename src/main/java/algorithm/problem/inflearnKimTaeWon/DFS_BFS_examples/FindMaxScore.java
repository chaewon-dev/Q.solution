package algorithm.problem.inflearnKimTaeWon.DFS_BFS_examples;

import java.util.Scanner;

public class FindMaxScore {
    static int n, m;
    static int[][] nArr;
    static int answer = 0;

    static void DFS(int L, int s, int t) {
        if (t > m) {
            return;
        }
        if (L == n) {
            answer = Math.max(s, answer);
        } else {

            DFS(L + 1, s, t);
            DFS(L + 1, s + nArr[L][0], t + nArr[L][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        nArr = new int [n][2];
        for (int i = 0; i < n; i++) {
            nArr[i][0] = sc.nextInt();
            nArr[i][1] = sc.nextInt();
        }

        DFS(0,0,0);
        System.out.println(answer);

    }
}
