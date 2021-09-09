package algorithm.problem.inflearnKimTaeWon.basic_tree;


public class BasicDFS {
    Node root;

    private void DFS(Node root) {
        if (root == null) {
            return;
        } else {

            DFS(root.lt);

            DFS(root.rt);
            System.out.println(root.data);
        }
    }

    public static void main(String[] args) {
        BasicDFS tree = new BasicDFS();
        tree.root = new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        tree.DFS(tree.root);

    }


}

class Node{
    int data;
    Node rt, lt;    //객체 주소를 저장하는 객체

    public Node(int data) {
        this.data = data;
        rt = lt = null;
    }
}