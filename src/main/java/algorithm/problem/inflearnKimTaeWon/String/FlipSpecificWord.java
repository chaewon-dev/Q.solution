package algorithm.problem.inflearnKimTaeWon.String;

import java.util.Scanner;

public class FlipSpecificWord {
    //https://cote.inflearn.com/contest/10/problem/01-05

    public static String solution(String str) {
        char[] cArray = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;
        while (lt < rt) {
            if (Character.isAlphabetic(cArray[lt]) && Character.isAlphabetic(cArray[rt])) {
                char temp = cArray[lt];
                cArray[lt] = cArray[rt];
                cArray[rt] = temp;
                lt++;
                rt--;
            } else if (!Character.isAlphabetic(cArray[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(cArray[rt])) {
                rt--;
            }
        }

        return String.valueOf(cArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(solution(str));

    }
}
