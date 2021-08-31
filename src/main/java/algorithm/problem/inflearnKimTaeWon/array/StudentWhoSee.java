package algorithm.problem.inflearnKimTaeWon.array;

import java.util.Scanner;

public class StudentWhoSee {

    public static int solution(int n, int[] intArr) {
        int answer = 1;
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (intArr[maxIndex] < intArr[i]) {
                maxIndex = i;
                answer++;
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

        System.out.println(solution(n,intArr));

    }
}
