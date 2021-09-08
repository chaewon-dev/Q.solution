package algorithm.problem.inflearnKimTaeWon.sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class MusicVideo2 {

    private static int solution(int n, int m, int[] nArr) {
        int answer = 0;
        int lt = Arrays.stream(nArr).max().getAsInt();
        int rt = Arrays.stream(nArr).sum();

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            //count(mid) > m이면 lt = mid+1;
            if (count(nArr, mid) > m) {
                lt = mid + 1;
            } else {
                answer = mid;
                rt = mid - 1;
            }

            //count(mid) <=m 이면 answer에 mid 추가 후 rt = mid-1;
        }
        int[] mArr = new int[m];

        return answer;
    }

    static int count(int[] nArr, int cap) {
        int m = 1;
        int temp = 0;
        for(int x : nArr){
            temp += x;
            if (temp > cap) {
                m++;
                temp = x;
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
