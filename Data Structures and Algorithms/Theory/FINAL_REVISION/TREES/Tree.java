
import java.util.LinkedList;
import java.util.Queue;

public class Tree {
    public class Node{
        Node right;
        Node left;
        int val;

        public Node(int val) {
            this.val = val;
        }
    }   
    Node root;

    public Tree(int val) {
        root = new Node(val);
    }

    public Node insertNode(Node root,int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }
        else{
            if (val >= root.val) {
                root.right = insertNode(root.right, val);
            }
            else{
                root.left = insertNode(root.left, val);
            }
        }
        return root;
    }

    public Node fooDelete(int key){
        Node curr = root,parent = null;
        boolean isLC = false;

        while(curr != null && curr.val != key){
            parent = curr;
            if (curr.val < key) {
                isLC = false;
                curr = curr.right;
            }
            else{
                isLC = true;
                curr = curr.left;
            }
        }

        if (curr == null) {
            return null;
        }
        
        if (curr.left == null && curr.right == null) {//no children
            if (parent == null) {
                Node tmp = curr;
                curr = null;
                return tmp;
            }
            if (isLC == true) {
                Node tmp = curr;
                parent.left = null;
                return tmp;
            }
            else{
                Node tmp = curr;
                parent.right = null;
                return tmp;
            }
        }
        else if(curr.right != null){
            if (parent == null) {
                Node tmp = curr;
                root = curr.right;
                return tmp;
            }
            if (isLC == true) {
                Node tmp = curr;
                parent.left = curr.right;
                return tmp;
            }
            else{
                Node tmp = curr;
                parent.right = curr.right;
                return tmp;
            }
        }
        else if (curr.left != null) {
            if (parent == null) {
                Node tmp = curr;
                root = curr.left;
                return tmp;
            }
            if (isLC == true) {
                Node tmp = curr;
                parent.left = curr.left;
                return tmp;
            }
            else{
                Node tmp = curr;
                parent.right = curr.left;
                return tmp;
            }
        }
        else{
            Node successor = inorderSuccessor(curr);
            successor.left = curr.left;
            if (parent == null) {
                Node tmp = curr;
                root = successor;
                return tmp;
            }
            if (isLC == true) {
                Node tmp = curr;
                parent.left = successor;
                return tmp;
            }
            else{
                Node tmp = curr;
                parent.right = successor;
                return tmp;
            }
        }
    }
    public Node inorderSuccessor(Node node){
        Node curr = node.right; //node as argument is the one to be deleted
        Node succ = null,pSucc = null;

        while (curr != null) { 
            pSucc = succ;
            succ = curr;
            curr = curr.left;
        }

        if (succ != node.right) {
            pSucc.left = succ.right;
            succ.right = node.right; //make successor the head of the NODE's right subtree
        }
        return succ;
    }

    public void levelOrder(Node root){
        
        if(root == null){
            return;
        }
        
        Queue<Node> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) { 
            Node tmp = q.poll();
            System.out.println(tmp.val);
            if (tmp.left != null) {
                q.add(tmp.left);    
            }
            if (tmp.right != null) {
                q.add(tmp.right);    
            }
        }
    }
}
