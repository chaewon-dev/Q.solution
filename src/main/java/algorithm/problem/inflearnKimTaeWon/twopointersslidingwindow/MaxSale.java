package algorithm.problem.inflearnKimTaeWon.twopointersslidingwindow;

import java.util.Scanner;

public class MaxSale {
    private static int solution(int n, int k, int[] nArr) {

        //초기합
        int sum=0;
        for (int i = 0; i < k; i++) {
            sum += nArr[i];
        }
        int answer = sum;

        for (int i = k; i < n; i++) {
            sum += nArr[i];
            sum -= nArr[i - k];
            if (answer < sum) {
                answer = sum;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        int answer = solution(n, k, nArr);
        System.out.println(answer);
    }


}
