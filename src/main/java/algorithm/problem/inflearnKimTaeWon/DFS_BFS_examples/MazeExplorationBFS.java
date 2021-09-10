package algorithm.problem.inflearnKimTaeWon.DFS_BFS_examples;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MazeExplorationBFS {

    static int[][] maze;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};



    private static int BFS(int x, int y) {
        Queue<Pos> Q = new LinkedList<>();
        int L = 0;
        Q.offer(new Pos(1,1));
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Pos cur = Q.poll();
                for (int j = 0; j < 4; j++) {
                    int nx = cur.x + dx[j];
                    int ny = cur.y + dy[j];
                    if (nx == 7 && ny == 7) {
                        return L+1;
                    }else if (nx >= 1 && ny >= 1 && nx <= 7 && ny <= 7 && maze[nx][ny] == 0) {
                        maze[nx][ny] = 1;
                        Q.offer(new Pos(nx, ny));
                    }
                }
            }
            L++;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        maze = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        maze[1][1] = 1;

        System.out.println(BFS(1,1));

    }


}
class Pos{
    int x;
    int y;

    public Pos(int x, int y) {
        this.x = x;
        this.y = y;
    }
}