package algorithm.problem.inflearnKimTaeWon.sortingandsearching;

import java.util.HashMap;
import java.util.Scanner;

public class ConfirmRepetition {

    private static char solution(int n, int[] nArr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nArr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            if (map.get(x) >= 2) {
                return 'D';
            }
        }

        return 'U';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        System.out.println(solution(n,nArr));

    }


}
