package algorithm.problem.inflearnKimTaeWon.string;

import java.util.ArrayList;
import java.util.Scanner;

public class WordFlip {
    public static ArrayList<String> solution(int n, String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();

        /*
        n개 문자열 배열이 들어옴.
        for문 돌려서 각각을 char[]로 만든 후 거꾸로
        answer.add
         */

        //for문을 cLen/2 까지 돌리면서 swap
/*        for (String x : strArr) {
            char[] cArray = x.toCharArray();
            int cLen = cArray.length;
            for (int i = 0; i < cLen / 2; i++) {
                char temp = cArray[i];
                cArray[i] = cArray[cLen - 1 - i];
                cArray[cLen - 1 - i] = temp;
            }
            answer.add(String.valueOf(cArray));
        }*/
        //while문과 lt++, rt-- 이용해서 swap
        for (String x : strArr) {
            char[] cArray = x.toCharArray();
            int cLen = cArray.length;
            int lt = 0;
            int rt = cLen - 1;
            while (lt < rt) {
                char temp = cArray[lt];
                cArray[lt] = cArray[rt];
                cArray[rt] = temp;
                lt++;
                rt--;
            }
            answer.add(String.valueOf(cArray));
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArr = new String[n];
        for(int i=0; i<n; i++){
            strArr[i] = sc.next();
        }

        for (String x : solution(n, strArr)) {
            System.out.println(x);
        }

    }
}
