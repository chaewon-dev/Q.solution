package algorithm.problem.inflearnKimTaeWon.sortingandsearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Mischievous_sort {

    private static ArrayList<Integer> solution(int n, int[] nArr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] temp = nArr.clone();
        Arrays.sort(temp);

        for (int i = 0; i < n; i++) {
            if (temp[i] != nArr[i]) {
                answer.add(i + 1);
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

        ArrayList<Integer> answer = solution(n, nArr);
        System.out.print(answer.get(0)+" ");
        System.out.print(answer.get(1));

    }


}
