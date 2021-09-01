package algorithm.problem.inflearnKimTaeWon.sortingandsearching;

import java.util.ArrayList;
import java.util.Scanner;

public class Mischievous {

    private static int[] solution(int n, int[] nArr) {
        int[] answer = new int[2];
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (nArr[i - 1] > nArr[i]) {
                temp.add(i);
            }
        }
        if (temp.size() == 1) {
            answer[0] = temp.get(0);
            answer[1] = temp.get(0) + 1;
        } else {
            answer[0] = temp.get(0);
            answer[1] = temp.get(temp.size() - 1)+1;
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

        int[] answer = solution(n, nArr);
        System.out.print(answer[0]+" ");
        System.out.print(answer[1]);
    }


}
