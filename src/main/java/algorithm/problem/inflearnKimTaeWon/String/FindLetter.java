package algorithm.problem.inflearnKimTaeWon.String;

import java.util.Locale;
import java.util.Scanner;

public class FindLetter {
/*
1. 문자 찾기(https://cote.inflearn.com/contest/10/problem/01-01)
*/
/*    public static int solution(String str, char c){
        int answer = 0;
        //둘 다 대문자or소문자로 통일한다.
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == c)
                answer++;
        }
        return answer;
    }*/

    //toCharArray 적용해서 for-each문 이용
    public static int solution(String str, char c){
        int answer = 0;
        //둘 다 대문자or소문자로 통일한다.
        str = str.toUpperCase();
        c = Character.toUpperCase(c);
        for(char x : str.toCharArray()){
            if(x == c)
                answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);   //kb.next()로 입력받은 후 charAt을 통해 문자를 입력받는다.
        System.out.println(solution(str, c));

    }
}
