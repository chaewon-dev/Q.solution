package algorithm.problem.inflearnKimTaeWon.sortingandsearching;

import java.util.Scanner;

public class SelectionSort {
    private static int[] solution(int n, int[] nArr) {

        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (nArr[min] > nArr[j]) {
                    min = j;
                }
            }
            int temp = nArr[i];
            nArr[i] = nArr[min];
            nArr[min] = temp;
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
