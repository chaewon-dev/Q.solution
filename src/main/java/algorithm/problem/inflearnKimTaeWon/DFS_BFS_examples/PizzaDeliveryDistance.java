package algorithm.problem.inflearnKimTaeWon.DFS_BFS_examples;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaDeliveryDistance {

    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int n, m;
    static int[][] nnArr;
    static int answer = Integer.MAX_VALUE;
    static ArrayList<Point> hPointAll = new ArrayList<>();
    static ArrayList<Point> pPointAll = new ArrayList<>();
    static int[] pPointindex;

    static void DFS(int L, int s) {
        if (L == m) {
            int sum=0;
            for (Point hp : hPointAll) {
                int dis = Integer.MAX_VALUE;
                for (int pIndex : pPointindex) {
                    dis = Math.min(dis, Math.abs(hp.x - pPointAll.get(pIndex).x)
                            + Math.abs(hp.y - pPointAll.get(pIndex).y));
                }
                sum += dis;
            }
            answer = Math.min(answer,sum);
        } else {
            for (int i = s; i < pPointAll.size(); i++) {
                pPointindex[L] = i;
                DFS(L+1, i+1);
            }

        }
    }

    static void solution() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        nnArr = new int[n + 1][n + 1];
        pPointindex = new int[m];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                nnArr[i][j] = sc.nextInt();
                if (nnArr[i][j] == 2) {
                    pPointAll.add(new Point(j, i));
                } else if (nnArr[i][j] == 1) {
                    hPointAll.add(new Point(j, i));
                }
            }
        }

        DFS(0,0);
        System.out.println(answer);
    }
}

