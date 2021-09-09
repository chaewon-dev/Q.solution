package algorithm.problem.inflearnKimTaeWon.basic_tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindCalf {
    static int[] ch;
    static int[] dis = {1, -1, 5};

    private static int solution(int s, int e) {
        ch = new int[10001];
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(s);
        int L = 0;
        while (!Q.isEmpty()) {

            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int cur = Q.poll();

                for (int j = 0; j < dis.length; j++) {
                    int nx = cur + dis[j];
                    if (nx == e) {
                        return L+1;
                    }
                    if (nx >= 1 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(solution(s, e));
    }


}
