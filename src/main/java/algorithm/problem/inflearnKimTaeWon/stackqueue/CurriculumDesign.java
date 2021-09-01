package algorithm.problem.inflearnKimTaeWon.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class CurriculumDesign {

    private static String solution(String str1, String str2) {
        Queue<Character> q = new LinkedList<>();
        for (char x : str1.toCharArray()) {
            q.offer(x);
        }

        for (char x : str2.toCharArray()) {
            if (q.contains(x)) {
                if (q.poll() != x) {
                    return "NO";
                }
            }
        }

        if (q.size() != 0) {
            return "NO";
        }

        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(solution(str1, str2));

    }


}
