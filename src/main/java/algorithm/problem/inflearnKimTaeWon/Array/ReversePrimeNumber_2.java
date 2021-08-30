package algorithm.problem.inflearnKimTaeWon.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversePrimeNumber_2 {
    public static ArrayList<Integer> solution(int n, int[] intArr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int reverse = 0;
            int temp = intArr[i];
            while (temp > 0) {
                reverse = reverse * 10 + (temp % 10);
                temp = temp/10;
            }
            intArr[i] = reverse;
        }


        int max = intArr[0];
        for (int i = 1; i < n; i++) {
            if (max < intArr[i]) {
                max = intArr[i];
            }
        }

        int[] pNum = new int[max+1];
        pNum[0] = 1;
        pNum[1] = 1;
        //소수면 0로 설정
        for (int i = 2; i <= max; i++) {
            //pNum[i] = 0;
            if (pNum[i] == 0) {
                for (int j = i * 2; j <= max; j = j + i) {
                    pNum[j] = 1;
                }
            }

        }

        for (int i = 0; i < n; i++) {
            if (pNum[intArr[i]] == 0) {
                answer.add(intArr[i]);
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }

        ArrayList<Integer> answer = solution(n, intArr);

        for (Integer ans : answer) {
            System.out.print(ans+" ");
        }

    }
}
