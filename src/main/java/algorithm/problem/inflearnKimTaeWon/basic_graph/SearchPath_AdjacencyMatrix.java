package algorithm.problem.inflearnKimTaeWon.basic_graph;

import java.util.*;

public class SearchPath_AdjacencyMatrix {
    static Stack<Integer> S = new Stack<>();
    static int[] ch;
    static int[][] graph;
    static int n, m, answer = 0;

    private static void solution(int v) {
        if (v == 5) {
            answer++;
        } else {
            for (int i = 1; i < 6; i++) {
                if(ch[i] == 0 && graph[v][i] == 1){
                    ch[i] = 1;
                    solution(i);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ch = new int[n + 1];
        graph = new int[n+1][n+1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }
        ch[1] = 1;
        solution(1);
        System.out.println(answer);
    }


}
