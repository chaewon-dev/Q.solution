package algorithm.problem.inflearnKimTaeWon.String;

import java.util.Scanner;

public class RemoveDuplicateCharacters {
    private static String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            //i번째 문자를 검색해서 i번째이면 answer에 추가
            if (str.indexOf(str.charAt((i))) == i) {
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
