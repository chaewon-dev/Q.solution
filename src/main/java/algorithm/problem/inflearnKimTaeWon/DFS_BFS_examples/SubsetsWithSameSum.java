package algorithm.problem.inflearnKimTaeWon.DFS_BFS_examples;

import java.util.Scanner;

public class SubsetsWithSameSum {
    static int[] nArr, ch;
    static int answer = 0;
    static int n;

    private static void solution(int L) {
        if (L == n) {
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    sum1 += nArr[i];
                } else {
                    sum2 += nArr[i];
                }
            }
            if (sum1 == sum2) {
                answer++;
                return;
            }

        } else {
            ch[L+1] = 0;
            solution(L+1);
            ch[L+1] = 1;
            solution(L+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        nArr = new int[n+1];
        ch = new int[n+1];
        for (int i = 1; i <= n; i++) {
            nArr[i] = sc.nextInt();
        }

        solution(0);
        if (answer == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }

    }


}

