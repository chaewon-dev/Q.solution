package algorithm.problem.inflearnKimTaeWon.twopointersslidingwindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class FindCommonElement {
    private static ArrayList<Integer> solution(int n, int[] nArr, int m, int[] mArr) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(nArr);
        Arrays.sort(mArr);

        int nt = 0;
        int nLen = nArr.length;
        int mt = 0;
        int mLen = mArr.length;

        while (nt < nLen && mt < mLen) {
            if (nArr[nt] < mArr[mt]) {
                nt++;
            } else if (nArr[nt] > mArr[mt]) {
                mt++;
            } else {
                answer.add(nArr[nt]);
                nt++; mt++;
            }
        }


        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int i = 0; i < m; i++) {
            mArr[i] = sc.nextInt();
        }

        ArrayList<Integer> answer = solution(n, nArr, m, mArr);
        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }
    }


}
