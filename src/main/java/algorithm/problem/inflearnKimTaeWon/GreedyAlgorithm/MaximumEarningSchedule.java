package algorithm.problem.inflearnKimTaeWon.GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MaximumEarningSchedule {
    static class Lecture implements Comparable<Lecture>{
        int money;
        int time;

        public Lecture(int money, int time) {
            this.money = money;
            this.time = time;
        }

        @Override
        public int compareTo(Lecture o) {
            return o.time - this.time;//내림차순
        }
    }
        static int solution(int max, ArrayList<Lecture> arr) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            Collections.sort(arr);
            int m = max;
            int answer = 0;
            int j=0;
            for (int i = max; i > 0; i--) {
                for (; j < arr.size(); j++) {
                    if (arr.get(j).time == i) {

                        pq.offer(arr.get(j).money);
                    } else {
                        break;
                    }
                }
                if (!pq.isEmpty()) {
                    answer += pq.poll();
                }

            }
            return answer;
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            ArrayList<Lecture> arr = new ArrayList<>();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                max = Math.max(max, b);
                arr.add(new Lecture(a, b));
            }

            System.out.println(solution(max, arr));

        }


}
