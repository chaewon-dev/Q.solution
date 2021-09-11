package algorithm.problem.inflearnKimTaeWon.GreedyAlgorithm;

import java.util.*;

public class DijkstraAlgorithm {
    static class Node{
        int e;
        int v;

        public Node(int e, int v) {
            this.e = e;
            this.v = v;
        }
    }

    static int[] dis;
    static int[] ch;

    private static void solution(int num, ArrayList<ArrayList<Node>> arr) {
        for (int j = 0; j < num - 1; j++) {
            int disMin = Integer.MAX_VALUE;
            int disIndex = -1;
            for (int i = 1; i < dis.length; i++) {
                if (dis[i] < disMin && ch[i] == 0) {
                    ch[i] = 1;
                    disMin = dis[i];
                    disIndex = i;
                }
            }
            if (disMin == Integer.MAX_VALUE) {
                continue;
            }

/*            for (int i = 1; i < dis.length; i++) {
                System.out.print(dis[i] + " ");
            }*/
            for (Node n : arr.get(disIndex)) {
                if (dis[n.e] > dis[disIndex] + n.v) {
                    dis[n.e] = dis[disIndex]+n.v;
                }

            }
        }
        for (int i = 1; i < dis.length; i++) {
            System.out.print(dis[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Node>> arr = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<Node>());
        }
        dis = new int[n+1];
        ch = new int[n+1];
        for (int i = 0; i < dis.length; i++) {
            dis[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            int v = sc.nextInt();
            arr.get(s).add(new Node(e, v));
        }

        dis[1] = 0;
        solution(n, arr);


    }



}
