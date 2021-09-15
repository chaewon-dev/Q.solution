package algorithm.problem.inflearnKimTaeWon.string;

import java.util.Scanner;

public class RemoveDuplicateCharacters2 {
    private static String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i))==i){
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
