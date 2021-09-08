package algorithm.problem.inflearnKimTaeWon.sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class SetUpStable2 {

    private static int solution(int n, int c, int[] nArr) {
        Arrays.sort(nArr);
        int lt = 1; //가능한 답의 최대값
        int rt = (Arrays.stream(nArr).max().getAsInt() - Arrays.stream(nArr).min().getAsInt()) / (c-1);
        int mid = (lt+rt)/2;
        int answer = 0;
        while (lt <= rt) {
            mid = (lt+rt)/2;
            int temp = count(n, c, mid, nArr);
            if (temp >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }

        }
        return answer;
    }

    static int count(int n, int c, int d, int[] nArr) {
        int temp = 1;
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (nArr[i] - nArr[index] >= d) {
                temp++;
                index = i;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }
        System.out.println(solution(n, c, nArr));

    }
}

