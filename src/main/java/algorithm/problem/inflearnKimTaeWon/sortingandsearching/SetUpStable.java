package algorithm.problem.inflearnKimTaeWon.sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class SetUpStable {

    private static int solution(int n, int c, int[] nArr) {
        Arrays.sort(nArr);
        int nArrMin = Arrays.stream(nArr).min().getAsInt();
        int nArrMax = Arrays.stream(nArr).max().getAsInt();
        int d = (nArrMax - nArrMin) / (c - 1); //가능한 답의 최대값
        nArr[1] = 1;

        while (d >= 1) {
            if (count(n, c, d, nArr)) {
                return d;
            } else {
                d--;
            }
        }

        return d;

    }

    static boolean count(int n, int c, int d, int[] nArr) {
        int temp = 1;
        int index = 0;
        for (int i = 1; i < n; i++) {
            if (nArr[i] - nArr[index] >= d) {
                temp++;
                index = i;
            }
        }
        return temp >= c;
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

