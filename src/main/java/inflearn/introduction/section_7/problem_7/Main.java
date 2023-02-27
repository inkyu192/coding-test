package inflearn.introduction.section_7.problem_7;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 7. 이진트리 레벨탐색(BFS)
 */
class Node {
    int data;
    Node left, right;

    public Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}

public class Main {
    
    Node root;

    public void BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();

        Q.offer(root);

        int L = 0;

        while (!Q.isEmpty()) {
            int len = Q.size();

            System.out.print(L + " : ");

            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();

                System.out.print(cur.data + " ");

                if (cur.left != null) Q.offer(cur.left);
                if (cur.right != null) Q.offer(cur.right);
            }

            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        tree.BFS(tree.root);
    }
}
