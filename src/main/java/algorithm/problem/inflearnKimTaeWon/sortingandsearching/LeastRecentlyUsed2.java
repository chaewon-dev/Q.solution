package algorithm.problem.inflearnKimTaeWon.sortingandsearching;

import java.util.Scanner;

public class LeastRecentlyUsed2 {

    private static int[] solution(int s, int n, int[] nArr) {
        int[] cache = new int[s];
        for (int x : nArr) {
            int pos = s-1;
            //탐색
            for (int i = 0; i < s; i++) {
                if (x == cache[i]) {
                    pos = i;
                }
            }
            //밀기
            for (int j = pos; j > 0; j--) {
                cache[j] = cache[j - 1];
            }
            //삽입
            cache[0] = x;
        }


        return cache;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        int[] answer = solution(s, n, nArr);
        for (int i : answer) {
            System.out.print(i+" ");
        }
    }


}
