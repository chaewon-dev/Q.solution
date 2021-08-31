package algorithm.problem.inflearnKimTaeWon.twopointersslidingwindow;

import java.util.Scanner;

public class ContinuousSubsequence {

    private static int solution(int n, int m, int[] nArr) {
        int answer = 0;
        int lt = 0;
        int rt = 0;
        int sum = 0;
        while (rt < n) {
            if (sum < m) {
                sum += nArr[rt];
                rt++;
            } else if (sum > m) {
                sum -= nArr[lt];
                lt++;
            }
            if(sum == m){
                answer++;
                sum -= nArr[lt];
                lt++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        int answer = solution(n, m, nArr);
        System.out.println(answer);
    }


}
