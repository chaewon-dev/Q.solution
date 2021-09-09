package algorithm.problem.inflearnKimTaeWon.basic_tree;


import java.util.LinkedList;
import java.util.Queue;

public class FindShortPassBFS {

    Node root;

    private static int BFS(Node root) {
        int L = 0;
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        while (!Q.isEmpty()) {
            int len = Q.size();

            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                if (cur.lt == null && cur.rt == null) {
                    return L;
                } else {
                    Q.offer(cur.lt);
                    Q.offer(cur.rt);
                }
            }
            L++;

        }
        return L;
    }

    public static void main(String[] args) {
        FindShortPassBFS tree = new FindShortPassBFS();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(BFS(tree.root));
    }


}
