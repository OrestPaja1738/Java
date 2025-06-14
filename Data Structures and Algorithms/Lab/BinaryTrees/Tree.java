public interface Tree<E> {
    public void  insert(E e);
    public void inorder();
    public void preorder();
    public void postorder();
    public E getMax();
    public E getMin();
}
