package algorithm.problem.inflearnKimTaeWon.basic_recursive;

public class Fibonacci {
    static int[] fibo;
    private static int solution(int n) {

        if (n == 1 || n == 2) {
            return fibo[n] = fibo[n] == 0 ? 1 : fibo[n];
        } else {
            return fibo[n] = fibo[n] == 0 ? solution(n-1)+solution(n-2) : fibo[n];
        }
    }

    public static void main(String[] args) {
        int n = 45;
        fibo = new int[n+1];
        solution(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i]+" ");
        }
    }
}
