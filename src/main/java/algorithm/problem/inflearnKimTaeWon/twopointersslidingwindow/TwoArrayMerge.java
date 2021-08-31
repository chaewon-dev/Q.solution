package algorithm.problem.inflearnKimTaeWon.twopointersslidingwindow;


import java.util.Scanner;

public class TwoArrayMerge {
    private static int[] solution(int n, int[] nArr, int m, int[] mArr) {
        int[] answer = new int[n + m];
        int nLen = nArr.length;
        int mLen = mArr.length;
        int nt = 0;
        int mt = 0;
        for (int i = 0; i < m + n; i++) {
            if (nt < nLen && mt < mLen) {
                if (nArr[nt] <= mArr[mt]) {
                    answer[i] = nArr[nt];
                    nt++;
                }else{
                    answer[i] = mArr[mt];
                    mt++;
                }
            } else if (nt >= nLen) {
                answer[i] = mArr[mt];
                mt++;
            } else {
                answer[i] = nArr[nt];
                nt++;
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

        int[] answer = solution(n, nArr, m, mArr);
        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
