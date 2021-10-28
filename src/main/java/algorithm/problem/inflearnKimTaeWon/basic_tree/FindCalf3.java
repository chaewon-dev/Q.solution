package algorithm.problem.inflearnKimTaeWon.basic_tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FindCalf3 {
    static int[] ch = new int[10001];
    static int[] dis = {-1, 1, 5};


    private static int solution(int s, int e) {

        Queue<Integer> q = new LinkedList<>();
        int startPos = s;
        int calfPos = e;
        int L = 0;
        if(s == e){
            return 0;
        }
        q.offer(s);
        while(!q.isEmpty()){
            int qLen = q.size();
            for(int i=0; i<qLen; i++){
                int cPos = q.poll();
                for(int x : dis){
                    int nPos = x+cPos;
                    if(nPos == calfPos){
                        return L+1;
                    }else{
                        if(nPos >= 1 && nPos <= 10000 && ch[nPos] == 0){
                            ch[nPos] = 1;
                            q.offer(nPos);
                        }

                    }
                }
            }

            L++;
        }

        return L+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(solution(s, e));
    }


}
