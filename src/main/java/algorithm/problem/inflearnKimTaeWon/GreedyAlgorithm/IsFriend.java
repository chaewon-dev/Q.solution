package algorithm.problem.inflearnKimTaeWon.GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class IsFriend {

    static String answer = "NO";
    static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    static int fEnd;

    static void solution(int f) {

        for (int x : arr.get(f)) {
            if (x == fEnd) {
                answer = "YES";
                return;
            } else {
                solution(x);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr.get(a).add(b);
            arr.get(b).add(a);
        }
        int s = sc.nextInt();
        fEnd = sc.nextInt();
        solution(s);
        System.out.println(answer);

    }
}
