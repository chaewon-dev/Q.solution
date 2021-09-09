package algorithm.problem.inflearnKimTaeWon.basic_graph;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchPath_AdjacencyList {
    static int[] ch;
    static ArrayList<ArrayList<Integer>> graph;
    static int n, m, answer = 0;

    private static void solution(int v) {
        if (v == 5) {
            answer++;
        } else {
            for (int x : graph.get(v)) {
                if (ch[x] == 0) {
                    ch[x] = 1;
                    solution(x);
                    ch[x] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[n + 1];
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        ch[1] = 1;
        solution(1);
        System.out.println(answer);
    }


}
