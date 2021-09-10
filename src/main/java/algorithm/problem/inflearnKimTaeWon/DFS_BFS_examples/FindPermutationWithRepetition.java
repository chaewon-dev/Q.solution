package algorithm.problem.inflearnKimTaeWon.DFS_BFS_examples;


import java.util.ArrayList;
import java.util.Scanner;

public class FindPermutationWithRepetition {
    static int n, m;
    static ArrayList<Integer> mem;

    private static void DFS(int L) {
        if (L == m) {
            int len = mem.size();
            for (int i = 0; i < len; i++) {
                System.out.print(mem.get(i) + " ");
            }
            System.out.println();
        } else {
            for (int i = 1; i <= n; i++) {
                mem.add(i);
                DFS(L+1);
                int len = mem.size();
                mem.remove(len-1);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        mem = new ArrayList<>();
        DFS(0);
    }


}
