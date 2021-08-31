package algorithm.problem.inflearnKimTaeWon.array;

import java.util.ArrayList;
import java.util.Scanner;

public class ReversePrimeNumber {
    public static ArrayList<Integer> solution(int n, String[] strArr) {
        ArrayList<Integer> answer = new ArrayList<>();
        String[] reverseStrArr = new String[n];
        for (int j = 0; j < n; j++) {
            char[] tempArr = strArr[j].toCharArray();
            int tempArrLen = tempArr.length;
            char[] tempReverseArr = new char[tempArrLen];
            //tempArr swap
            for (int i = tempArrLen - 1; i >= 0; i--) {
                tempReverseArr[tempArrLen - 1 - i] = tempArr[i];
            }
            reverseStrArr[j] = new String(tempReverseArr);
        }

        int[] intArr = new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = Integer.parseInt(reverseStrArr[i]);
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

        //답안 입력
        for (int i = 0; i < n; i++) {
            if (pNum[intArr[i]] == 0) {
                answer.add(intArr[i]);
            }
        }

        //revser출력
/*        for (int s : intArr) {
            System.out.println("s = " + s);
        }*/


        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = sc.next();
        }

        ArrayList<Integer> answer = solution(n, strArr);

        for (Integer ans : answer) {
            System.out.print(ans+" ");
        }

    }
}
