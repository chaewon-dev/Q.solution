package algorithm.problem.inflearnKimTaeWon.Array;

import java.util.Scanner;

public class RockPaperScissors {
    //1가위, 2바위, 3보
    public static char[] solution(int n, int[] aArr, int[] bArr) {
        char[] answer = new char[n];
        for (int i = 0; i < n; i++) {
            if(aArr[i] == bArr[i]){
                answer[i] = 'D';
            }else if (Math.abs(aArr[i] - bArr[i]) == 1) {
                answer[i] = aArr[i] > bArr[i] ? 'A' : 'B';
            }else {
                answer[i] = aArr[i] > bArr[i] ? 'B' : 'A';
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aArr = new int[n];
        int[] bArr = new int[n];
        for (int i = 0; i < n; i++) {
            aArr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bArr[i] = sc.nextInt();
        }

        char[] answer = solution(n, aArr, bArr);
        for (char c : answer) {
            System.out.println(c);
        }
    }
}
