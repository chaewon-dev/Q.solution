package algorithm.problem.inflearnKimTaeWon.sortingandsearching;

import java.util.Scanner;

public class MusicVideo {

    private static int solution(int n, int m, int[] nArr) {
        int[] mArr = new int[m];
        int start = 0;
        for (int i = 0; i < n; i++) {
            start += nArr[i];
        }
        start /= m;

        while (count(nArr, start)>m) {
            start++;
        }
        return start;
    }

    static int count(int[] nArr, int cap) {
        int m = 1;
        int cur = 0;
        for (int x : nArr) {
            cur += x;
            if (cur > cap) {
                m++;
                cur = x;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, nArr));

    }
}
