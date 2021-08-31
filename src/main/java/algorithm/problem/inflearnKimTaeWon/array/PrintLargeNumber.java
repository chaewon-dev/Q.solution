package algorithm.problem.inflearnKimTaeWon.array;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintLargeNumber {
    public static ArrayList<Integer> solution(int n, int[] intArr) {
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(intArr[0]);
        for (int i = 1; i < n; i++) {
            if (intArr[i] > intArr[i - 1]) {
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
        for (Integer integer : answer) {
            System.out.print(integer+" ");

        }
    }
}
