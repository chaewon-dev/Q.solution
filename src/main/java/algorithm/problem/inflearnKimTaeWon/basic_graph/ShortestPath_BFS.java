package algorithm.problem.inflearnKimTaeWon.basic_graph;

import java.util.*;

public class ShortestPath_BFS {
    static int[] ch, answer;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();


    private static void solution(int v) {
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(v);

        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int cur = Q.poll();
                for (int x : graph.get(cur)) {
                    if (answer[x] == 0) {
                        answer[x] = L+1;
                        Q.offer(x);
                    }

                }
            }
            L++;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        ch = new int[n + 1];
        answer = new int[n+1];
        ch[1] = 1;
        solution(1);
        for (int i = 2; i <= 6; i++) {
            System.out.println(answer[i]+" ");
        }
    }



}
