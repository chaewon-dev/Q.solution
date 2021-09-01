package algorithm.problem.inflearnKimTaeWon.sortingandsearching;

import java.util.Scanner;

public class LeastRecentlyUsed {

    private static int[] solution(int s, int n, int[] nArr) {
        int[] cache = new int[s];
        for (int x : nArr) {
            boolean isExist = false;
            //캐시에 같은 작업 존재하는지 탐색
            for (int i = 0; i < s; i++) {
                if (cache[i] == x) {
                    for (int j = i - 1; j >= 0; j--) {
                        cache[j + 1] = cache[j];
                    }
                    cache[0] = x;
                    isExist = true;
                    break;
                }
            }
            //같은 작업 존재하지 않으면 밀기
            if (!isExist) {
                for (int i = s - 2; i >= 0; i--) {
                    cache[i + 1] = cache[i];
                }
                cache[0] = x;
            }

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
