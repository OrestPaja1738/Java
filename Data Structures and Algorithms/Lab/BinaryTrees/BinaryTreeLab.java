public class BinaryTreeLab<E extends Comparable<E>> implements Tree<E> {
    private static class Node<E>{
        private E data;
        private Node<E> left;
        private Node<E> right;

        public Node(E e){
            this.data = e;
        }
        public E getElement(){
            return data;
        }
        public void setElement(E element){
            this.data = element;
        }
        public Node<E> getLeft(){
            return left;
        }
        public void setLeft(Node<E> newLeft){
            this.left = newLeft;
        }
        public Node<E> getRight(){
            return right;
        }
        public void setRight(Node<E> newRight){
            this.right = newRight;
        }
    }
    Node<E> root = null; 
    @Override
    public void insert(E data){//something needs to be checked here
         root = insert(root,data);
    }
    public Node<E> insert(Node<E> root,E data) throws Exception{
        if (root == null) {
            return new Node<E>(data);
        }
        int comparingResult = data.compareTo(root.data);
        if (comparingResult < 0) {
            root.left = insert(root.left,data);
        }
        else if(comparingResult > 0){
            root.right = insert(root.right,data);
        }
        else{
            throw new Exception("The value already exists in tree");
        }
        return root;
    }
    @Override
    public void inorder(){
        System.out.println("Inorder traversal");
        inorder(root);
        System.out.println("");
    }
    public void inorder(Node<E> root){
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(" " + root.data);
        inorder(root.right);
    }

    @Override
    public void preorder(Node<E> root){
        if (root == null) {
            return;
        }
        System.out.println(" " + root.data);
        preorder(root.left);
        preorder(root.right);
    }
    //vazhdo somewhere
}
