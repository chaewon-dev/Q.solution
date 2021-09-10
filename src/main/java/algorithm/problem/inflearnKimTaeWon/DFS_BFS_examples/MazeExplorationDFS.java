package algorithm.problem.inflearnKimTaeWon.DFS_BFS_examples;

import java.util.Scanner;

public class MazeExplorationDFS {

    static int[][] maze;
    static int answer = 0;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    private static void DFS(int x, int y) {
        if (x == 7 && y == 7) {
            answer++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 1 && ny >= 1 && nx <= 7 && ny <= 7 && maze[nx][ny] == 0) {
                    maze[nx][ny] = 1;
                    DFS(nx,ny);
                    maze[nx][ny] = 0;
                }
            }
        }
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
        DFS(1,1);
        System.out.println(answer);

    }


}
