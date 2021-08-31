package algorithm.problem.inflearnKimTaeWon.hashmaptreeset;

import java.util.HashMap;
import java.util.Scanner;

public class ClassPresident {

    private static char solution(int n, String str) {

        char answer=' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
/*        System.out.println(map.containsKey('A'));
        System.out.println(map.size());
        System.out.println(map.remove('A'));*/


        int max = 0;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        char answer = solution(n, str);
        System.out.println(answer);

    }


}
