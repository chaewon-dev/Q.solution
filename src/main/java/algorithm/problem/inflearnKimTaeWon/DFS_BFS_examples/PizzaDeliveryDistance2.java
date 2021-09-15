package algorithm.problem.inflearnKimTaeWon.DFS_BFS_examples;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaDeliveryDistance2 {
    static class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

    }
    static int answer = Integer.MAX_VALUE;
    static int[] pPIndex;

    static void DFS(int L, int s, int n, int m, ArrayList<Point> hP, ArrayList<Point> pP) {

        if (L == m) {
            int tempAns = 0;
            for(int i=0; i<hP.size(); i++){
                int min = Integer.MAX_VALUE;
                for(int j=1; j<pPIndex.length; j++){
                    int temp = Math.abs(hP.get(i).x - pP.get(pPIndex[j]).x)
                            +Math.abs(hP.get(i).y - pP.get(pPIndex[j]).y);
                    min = Math.min(min,temp);
                }
                tempAns += min;
            }
            answer = Math.min(tempAns, answer);
        } else {
            for(int i=s; i<pP.size(); i++){
                pPIndex[L+1] = i;
                DFS(L+1, i+1, n, m, hP, pP);
            }
        }

    }

    static void solution() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] nnArr = new int[n][n];
        ArrayList<Point> hP = new ArrayList<>();
        ArrayList<Point> pP = new ArrayList<>();
        pPIndex = new int[m+1];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int a = sc.nextInt();
                if(a == 1){
                    hP.add(new Point(j,i));
                }else if(a == 2){
                    pP.add(new Point(j,i));
                }
            }
        }
        DFS(0,0,n,m,hP,pP);

        System.out.println(answer);

    }
}

