package algorithm.problem.inflearnKimTaeWon.sortingandsearching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    private static int solution(int n, int m, int[] nArr) {
        int answer=0;
        Arrays.sort(nArr);

        int lt = 0;
        int rt = nArr.length - 1;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (nArr[mid] == m) {
                answer = mid + 1;
                break;
            } else if (m > nArr[mid]) {
                lt = mid + 1;
            } else {
                rt = mid - 1;
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

        System.out.println(solution(n, m, nArr));
    }

}
