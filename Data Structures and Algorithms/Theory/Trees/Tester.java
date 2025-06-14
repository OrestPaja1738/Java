public class Tester {
    
    public class BinaryTreeTheory<E>{
        
        private class TreeNode<E>{
            E data;
            TreeNode<E> left;
            TreeNode<E> right;
            
            public TreeNode(E data){
                this.data = null;
            }
        }
        private TreeNode<E> root;

        public BinaryTreeTheory(){
            root = null;
        }
        /*
         * Less headache inducing approach is to have just one Node<E> insert method
         * Fix the shit below and above by removing above and modifying below to TreeNode<E> TYPE
         */
        private TreeNode<E> insert(TreeNode<E> root,E data){
            if(root == null){//empty tree case
                root = new TreeNode<E>(data);
                return root;
            }
            else{//non empty list
                if (((Comparable<E>)data).compareTo(root.data) > 0) {//go right
                        root.right = insert(root.right, data);
                }
                if (((Comparable<E>)data).compareTo(root.data) < 0) {//go left
                        root.left = insert(root.left, data);
                }
            }
            return root;
        }
        /*
         * Logical error,remove the other base cases because they skip over potential subtrees entirely
         * keep only one base for root == null
         */
        public void inorder(TreeNode<E> root){
            if (root == null) {
                return;
            }
            else{
                //inOrder - Left ROOT Right
                inorder(root.left);
                System.out.println(root.data);
                inorder(root.right);
            }
            return;
        }
        public void preorder(TreeNode<E> root){
            if (root == null) {
                return;
            }
            else{
                //preorder - ROOT Left Right
                System.out.println(root.data);
                inorder(root.left);
                inorder(root.right);
            }
            return;
        }
        public void postorder(TreeNode<E> root){
            if (root == null) {
                return;
            }
            else{
                //preorder - Left Right ROOT
                inorder(root.left);
                inorder(root.right);
                System.out.println(root.data);
            }
            return;
        }
        /*
         * unfuck this below
         */
        public boolean findNode(TreeNode<E>root,E key){
            if (root == null) return false;

            int cmp = ((Comparable<E>)key).compareTo(root.data);
            if (cmp < 0) return findNode(root.left, key);
            else if (cmp > 0) return findNode(root.right, key);
            else return true;
        }
    }

    public static void main(String[] args) {
        
    }
}
