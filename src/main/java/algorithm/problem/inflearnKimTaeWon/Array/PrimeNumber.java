package algorithm.problem.inflearnKimTaeWon.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
/*    public static int solution(int n) {

        ArrayList<Integer> pNum = new ArrayList<>();
        int answer = 1;
        pNum.add(2);
        for (int i = 3; i <= n; i++) {
            int count = 0;
            for (int j=0; j<pNum.size(); j++) {
                count++;
                if (i % pNum.get(j) == 0) {
                    break;
                }
                if (count == pNum.size()) {
                    answer++;
                    pNum.add(i);
                }
            }
        }
        return answer;
    }*/
    public static int solution(int n) {
        int answer = 0;
        //0이면 소수 1
        int[] p = new int[n+1];
        for (int i = 2; i <= n; i++) {
            if (p[i] == 0) {
                answer++;
            }
            for (int j = 2*i; j <= n; j+=i) {
                p[j] = 1;
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(solution(n));
    }
}
