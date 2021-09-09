package algorithm.problem.inflearnKimTaeWon.basic_tree;


public class FindShortPassDFS {

    Node root;

    private static int DFS(int L, Node root) {
        if (root.lt == null && root.rt == null) {
            return L;
        } else {
            return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt));
        }


    }

    public static void main(String[] args) {
        FindShortPassDFS tree = new FindShortPassDFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(DFS(0,tree.root));
    }


}
