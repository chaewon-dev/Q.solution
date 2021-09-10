package algorithm.problem.inflearnKimTaeWon.DFS_BFS_examples;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CoinExchange {
    static int n,m;
    static int[] nArr;
    static int answer = Integer.MAX_VALUE;

    public static void BFS() {
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(0);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int cur = Q.poll();
                for (int j = 0; j < nArr.length; j++) {
                    int nv = cur+nArr[j];
                    if (nv == m) {
                        answer = L + 1;
                        return;
                    } else {
                        Q.offer(cur+nArr[j]);
                    }

                }
            }
            L++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }
        m = sc.nextInt();

        BFS();
        System.out.println(answer);
    }
}
