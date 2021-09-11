package algorithm.problem.inflearnKimTaeWon.GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Wedding {
    static class Time implements Comparable<Time>{
        int time;
        char status;

        public Time(int time, char status) {
            this.time = time;
            this.status = status;
        }

        @Override
        public int compareTo(Time o) {
            if (this.time == o.time) {
                return this.status - o.status;
            } else {
                return this.time - o.time;
            }

        }

    }
    static int answer = 0;
    private static void solution(int n, ArrayList<Time> nArr) {
        Collections.sort(nArr);
        int sum = 0;
        for (int i = 0; i <2*n; i++) {
            if (nArr.get(i).status == 's') {
                sum++;
                answer = Math.max(sum,answer);
            } else {
                sum--;
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> nArr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            nArr.add(new Time(t,'s'));
            t = sc.nextInt();
            nArr.add(new Time(t,'e'));
        }
        solution(n, nArr);
        System.out.println(answer);
    }
}
