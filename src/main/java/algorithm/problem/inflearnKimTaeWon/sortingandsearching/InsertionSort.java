package algorithm.problem.inflearnKimTaeWon.sortingandsearching;

import java.util.Scanner;

public class InsertionSort {
    private static int[] solution(int n, int[] nArr) {

        for (int i = 1; i < n; i++) {
            int key = nArr[i];
            for (int j = i-1; j >= 0; j--) {
                if (key < nArr[j]) {
                    nArr[j + 1] = nArr[j];
                    if (j == 0) {
                        nArr[j] = key;
                    }
                }else{
                    nArr[j+1] = key;
                    break;
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
