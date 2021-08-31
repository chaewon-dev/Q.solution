package algorithm.problem.inflearnKimTaeWon.hashmaptreeset;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {
    private static String solution(String str1, String str2) {
        String answer = "";
        Map<Character, Integer> map1 = new HashMap<>();

        for (char x : str1.toCharArray()) {
            map1.put(x, map1.getOrDefault(x, 0) + 1);
        }
        for (char x : str2.toCharArray()) {
            if (! map1.containsKey(x) || map1.get(x) == 0) {
                return "NO";
            }
            map1.put(x, map1.get(x) - 1);
        }
        return answer = "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        String answer = solution(str1, str2);
        System.out.println(answer);
    }

}
