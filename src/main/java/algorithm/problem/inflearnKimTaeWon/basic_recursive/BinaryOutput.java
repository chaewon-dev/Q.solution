package algorithm.problem.inflearnKimTaeWon.basic_recursive;

public class BinaryOutput {

    private static void solution(int n) {
        if (n / 2 == 0) {
            System.out.println(n % 2);
        } else {
            solution(n/2);
            System.out.println(n % 2);
        }

    }

    public static void main(String[] args) {
        int n = 11;
        solution(n);
    }


}
