package TREE;
import java.util.*;

public class BinaryTree1 {

    public static class Node {
        int data;
        Node left;
        Node right;

        // constructor
        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static class BinaryTree {

        static int idx = -1;

        public Node bulidTree(int nodes[]) {

            idx++;

            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = bulidTree(nodes);
            newNode.right = bulidTree(nodes);

            return newNode;
        }

        public  void preOrder(Node root) {

            if (root == null) {
                return;
            }
            System.out.print(root.data + "\t");
            preOrder(root.left);
            preOrder(root.right);

        }

        public void inOrder(Node root) {

            if (root == null) {
                return;
            }
            preOrder(root.left);
            System.out.print(root.data + "\t");
            preOrder(root.right);

        }
        public  void postOrder(Node root) {

            if (root == null) {
                return;
            }
            preOrder(root.left);
            preOrder(root.right);
            System.out.print(root.data + "\t");

        }
        public void levelOrder(Node root) {
            if(root==null){
                return;
            }
            Queue<Node> q =new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {
                Node currNode = q.remove();
                if(currNode== null) {
                    System.out.println();
                    if(q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if(currNode.right != null) {
                        q.add(currNode.right);
                    }
                   
                

                }
            }




        }

    

    }

    public static void main(String[] args) {
        int Nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();

        Node root = tree.bulidTree(Nodes);
        System.out.println("\npreOrder");
        tree.preOrder(root);
        System.out.println("\ninOrder");
        tree.inOrder(root);
        System.out.println("\npostOrder");
        tree.postOrder(root);
        System.out.println("\nlevelOrder");
        tree.levelOrder(root);


    }
}
