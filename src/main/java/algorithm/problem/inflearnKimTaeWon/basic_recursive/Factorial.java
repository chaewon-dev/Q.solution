package algorithm.problem.inflearnKimTaeWon.basic_recursive;

public class Factorial {
    public static int solution(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * solution(n-1);
        }
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(solution(n));
    }
}
