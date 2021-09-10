package algorithm.problem.inflearnKimTaeWon.DFS_BFS_examples;

import java.util.*;
import java.util.Scanner;

public class Island_BFS {
    static int n;
    static int answer = 0;
    static int[][] nArr;

    static int[] dx = {-1, 0, 1, 0, 1, 1, -1, -1};
    static int[] dy = {0, -1, 0, 1, 1, -1, 1, -1};

    public static void BFS(Position2 p) {
        Queue<Position2> Q = new LinkedList<>();
        Q.offer(p);
        while (!Q.isEmpty()) {
            int len = Q.size();
            Position2 cur = Q.poll();
            for (int j = 0; j < len; j++) {
                for (int i = 0; i < 8; i++) {
                    int nx = cur.x+dx[i];
                    int ny = cur.y+dy[i];
                    if (nx >= 1 && ny >= 1 && nx <= n && ny <= n && nArr[ny][nx] == 1) {
                        nArr[ny][nx] = 0;
                        Q.offer(new Position2(nx, ny));
                    }
                }
            }
        }
    }

    public static void solution(){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (nArr[i][j] == 1) {
                    nArr[i][j] = 0;
                    answer++;
                    BFS(new Position2(j,i));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        nArr = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                nArr[i][j] = sc.nextInt();
            }
        }
        solution();
        System.out.println(answer);

    }
}

class Position2{
    int x;
    int y;

    public Position2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}