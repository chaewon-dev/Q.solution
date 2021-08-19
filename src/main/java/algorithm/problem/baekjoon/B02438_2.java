package algorithm.problem.baekjoon;

import java.util.Scanner;

public class B02438_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();

        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
