package algorithm.problem.inflearnKimTaeWon;

import java.util.Scanner;

public class CaseConversion {
    //https://cote.inflearn.com/contest/10/problem/01-02
    public static String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if(Character.isUpperCase(x)){
                answer += Character.toLowerCase(x);
            }else{
                answer += Character.toUpperCase(x);
            }
        }

    return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(solution(str));

    }
}
