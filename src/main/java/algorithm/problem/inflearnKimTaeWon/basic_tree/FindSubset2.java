package algorithm.problem.inflearnKimTaeWon.basic_tree;

public class FindSubset2 {
    static int n;
    static int[] ch;

    public static void DFS(int L) {
        if(L==n){
            for (int i = 1; i < ch.length; i++) {
                if(ch[i] == 1){
                    System.out.print(i);
                }
            }
            System.out.println();
        }else{
            ch[L+1] = 0;
            DFS(L+1);
            ch[L+1] = 1;
            DFS(L+1);
        }

    }

    public static void main(String[] args) {
        n = 3;
        ch = new int [n+1];
        DFS(0);

    }
}
