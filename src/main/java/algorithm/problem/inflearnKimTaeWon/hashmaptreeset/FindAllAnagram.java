package algorithm.problem.inflearnKimTaeWon.hashmaptreeset;

import java.util.HashMap;
import java.util.Scanner;

public class FindAllAnagram {

    private static int solution(String s, String t) {
        int answer = 0;
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (char x : t.toCharArray()) {
            tMap.put(x, tMap.getOrDefault(x, 0) + 1);
        }

        int tLen = t.length();

        char[] sArr = s.toCharArray();
        //초기 윈도우
        for (int i = 0; i < tLen-1; i++) {
            sMap.put(sArr[i], sMap.getOrDefault(sArr[i], 0) + 1);
        }
        int rt = tLen-1;
        int lt = 0;
        for (int i = rt; i < sArr.length; i++) {
            sMap.put(sArr[i], sMap.getOrDefault(sArr[i], 0) + 1);
            if (sMap.equals(tMap)) {
                answer++;
            }
            sMap.put(sArr[i-rt], sMap.get(sArr[i-rt]) - 1);
            if (sMap.get(sArr[i-rt]) == 0) {
                sMap.remove(sArr[i-rt]);
            }

            lt++;

        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        System.out.println(solution(s,t));

    }


}
