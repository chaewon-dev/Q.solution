package algorithm.problem.inflearnKimTaeWon.basic_tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindCalf2 {
    static int[] ch = new int[10001];
    static int[] dis = {-1, 1, 5};


    private static int solution(int s, int e) {
        Queue<Integer> Q = new LinkedList<>();
        Q.offer(s);
        int L=0;
        while(!Q.isEmpty()){
            int QLen = Q.size();
            for(int i=0; i<QLen; i++){
                int curPos = Q.poll();

                for(int j=0; j<3; j++){
                    int nP = curPos + dis[j];
                    if(nP == e){
                        return L+1;
                    }
                    if(ch[nP] == 0 && nP>=1 && nP<=10000){
                        ch[nP] = 1;
                        Q.offer(nP);
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
