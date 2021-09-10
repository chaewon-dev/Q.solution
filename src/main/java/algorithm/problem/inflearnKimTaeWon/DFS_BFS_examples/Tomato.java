package algorithm.problem.inflearnKimTaeWon.DFS_BFS_examples;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tomato {
    class Pos{
        int x;
        int y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public int solution(int n, int m, int[][] nmArr) {
        //1찾아서 q에 넣기
        Queue<Pos> Q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (nmArr[i][j] == 1) {
                    Q.offer(new Pos(j, i));
                }
            }
        }
        if (Q.isEmpty()) {
            return 0;
        }

        int L=0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Pos cur = Q.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = cur.x + dx[j];
                    int ny = cur.y + dy[j];
                    if (nx >= 1 && ny >= 1 && nx <= m && ny <= n && nmArr[ny][nx] == 0) {
                        nmArr[ny][nx] = 1;
                        Q.offer(new Pos(nx, ny));
                    }

                }
            }
            L++;
/*            System.out.println("L = " + L);
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    System.out.print(nmArr[i][j]+" ");
                }
                System.out.println();
            }*/

        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (nmArr[i][j] == 0) {
                    return -1;
                }
            }
        }

        return L-1;
    }

    public static void main(String[] args) {
        Tomato t = new Tomato();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] nmArr = new int[n+1][m+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                nmArr[i][j] = sc.nextInt();
            }
        }
        System.out.println(t.solution(n,m,nmArr));
    }


}
