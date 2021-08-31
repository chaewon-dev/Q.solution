package algorithm.problem.inflearnKimTaeWon.string;

import java.util.Scanner;

public class WordsInaSentence {

    public static String solution(String str) {

        String[] strArr = str.split(" ");
        int maxLen = 0;
        int maxIndex = -1;

        for (int i = 0; i < strArr.length; i++) {
            int curLen = strArr[i].length();
            if (maxLen < curLen) {
                maxLen = curLen;
                maxIndex = i;
            }
        }
        String answer = new String(strArr[maxIndex]);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));
    }
}
