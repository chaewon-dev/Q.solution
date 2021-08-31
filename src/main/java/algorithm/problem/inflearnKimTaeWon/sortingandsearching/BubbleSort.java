package algorithm.problem.inflearnKimTaeWon.sortingandsearching;

import java.util.Scanner;

public class BubbleSort {
    private static int[] solution(int n, int[] nArr) {

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nArr[j] > nArr[j + 1]) {
                    int temp = nArr[j];
                    nArr[j] = nArr[j + 1];
                    nArr[j + 1] = temp;
                }
            }
        }

        return nArr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        int[] answer = solution(n, nArr);
        for (int i : answer) {
            System.out.print(i+" ");
        }
    }


}
