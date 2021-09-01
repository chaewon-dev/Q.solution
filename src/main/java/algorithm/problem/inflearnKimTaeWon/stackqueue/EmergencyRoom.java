package algorithm.problem.inflearnKimTaeWon.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class EmergencyRoom {
    static class Person{
        int id;
        int danger;

        public Person(int id, int danger) {
            this.id = id;
            this.danger = danger;
        }
    }
    //접수 순서대로 환자 목록을 꺼내고 나머지 목록 중 꺼낸 환자보다 위험도가 높으면 대기목록 제일 뒤로 삽입
    private static int solution(int n, int m, int[] nArr) {
        Queue<Person> sp = new LinkedList<>();
        Person p = new Person(1, 5);
        for (int i = 0; i < n; i++) {
            sp.offer(new Person(i, nArr[i]));
        }
        while (!sp.isEmpty()) {
            Person temp = sp.poll();
            boolean isPoll = true;
            for (Person x : sp) {
                if (temp.danger < x.danger) {
                    sp.offer(temp);
                    isPoll = false;
                    break;
                }
            }
            if (isPoll && temp.id == m) {
                break;
            }
        }

        int answer = n - sp.size();

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            nArr[i] = sc.nextInt();
        }

        System.out.println(solution(n, m, nArr));
    }
}
