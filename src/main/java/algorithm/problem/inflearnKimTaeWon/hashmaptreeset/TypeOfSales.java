package algorithm.problem.inflearnKimTaeWon.hashmaptreeset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TypeOfSales {

    private static ArrayList<Integer> solution(int n, int k, int[] intArr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        //초기 window 세팅
        for (int i = 0; i < k; i++) {
            map.put(intArr[i], map.getOrDefault(intArr[i], 0) + 1);
        }
        answer.add(map.keySet().size());

        for (int i = k; i < n; i++) {
            //i-k 인덱스 -1
            map.put(intArr[i - k], map.get(intArr[i - k]) - 1);
            if (map.get(intArr[i - k]) == 0) {
                map.remove(intArr[i - k]);
            }

            //i번째 추가
            map.put(intArr[i], map.getOrDefault(intArr[i], 0) + 1);

            //answer에 add
            answer.add(map.size());
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] intArr= new int[n];
        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();
        }

        ArrayList<Integer> answer = solution(n, k, intArr);
        for (Integer integer : answer) {
            System.out.print(integer + " ");
        }

    }


}
