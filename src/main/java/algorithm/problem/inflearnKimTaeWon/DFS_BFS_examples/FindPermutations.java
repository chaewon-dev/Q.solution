package algorithm.problem.inflearnKimTaeWon.DFS_BFS_examples;

import java.util.Scanner;

public class FindPermutations {

    static int n, m;
    static int[] nArr;
    static int[] answer;
    static int[] ch;

    static void DFS(int L) {
        if (L == m) {
            for (int i = 0; i < answer.length; i++) {
                System.out.print(answer[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < nArr.length; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    answer[L] = nArr[i];
                    DFS(L+1);
                    ch[i] = 0;
                }

            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        nArr = new int[n];
        answer = new int[m];
        ch = new int[n+1];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        DFS(0);
    }
}
