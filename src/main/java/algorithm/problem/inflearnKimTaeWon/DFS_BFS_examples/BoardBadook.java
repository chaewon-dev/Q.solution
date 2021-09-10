package algorithm.problem.inflearnKimTaeWon.DFS_BFS_examples;

import java.util.Scanner;

public class BoardBadook {
    static int answer = 0;
    static int c, n;
    static int[] nArr;

    static void DFS(int L, int s){
        if (s > c) {
            return;
        } else if (L == n) {
            if (s > answer) {
                answer = s;
            }
            return;
        } else {
            DFS(L + 1, s + nArr[L + 1]);
            DFS(L + 1, s);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        nArr = new int[n+1];
        for (int i = 1; i <= n; i++) {
            nArr[i] = sc.nextInt();
        }
        DFS(0,0);
        System.out.println(answer);

    }
}
