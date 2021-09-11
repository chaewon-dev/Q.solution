package algorithm.problem.inflearnKimTaeWon.GreedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Wrestler {
    static int answer = 0;

    static class Person implements Comparable<Person>{
        int tall;
        int weight;

        public Person(int tall, int weight) {
            this.tall = tall;
            this.weight = weight;
        }

        @Override
        public int compareTo(Person o) {
            return o.tall-this.tall;
        }
    }

    public static void solution(int n, ArrayList<Person> p) {
        Collections.sort(p);
        int maxWeight = Integer.MIN_VALUE;
        for (int i = 0; i < p.size(); i++) {
            Person cur = p.get(i);
            if (cur.weight > maxWeight) {
                maxWeight = cur.weight;
                answer++;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> p = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tall = sc.nextInt();
            int weight = sc.nextInt();
            p.add(new Person(tall, weight));
        }
        solution(n,p);
        System.out.println(answer);
    }
}
