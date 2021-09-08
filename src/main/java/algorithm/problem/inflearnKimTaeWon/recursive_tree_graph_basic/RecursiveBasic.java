package algorithm.problem.inflearnKimTaeWon.recursive_tree_graph_basic;

public class RecursiveBasic {
    // 3,2,1 순으로 출력된다.
    static void print(int n) {

        if (n <= 0) {
            return;
        } else {
            System.out.println("n = " + n);
            print(n-1);
        }
    }

    // 1,2,3 순으로 출력된다.
    static void print2(int n) {

        if (n <= 0) {
            return;
        } else {

            print2(n-1);
            System.out.println("n = " + n);
        }
    }

    public static void main(String[] args) {
        print(3);
        print2(3);
    }

}
