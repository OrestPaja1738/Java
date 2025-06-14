public class SinglyLinkedList<E> { 
    
    public static class Node<E>{
        private E element;
        private Node<E> next; //make sure to include E as node as of now is collector helper class that can hold generics

        public Node(E e,Node<E> n){
            element = e;
            next = n;
        }

        public E getElement(){
            return element;
        }
        public Node<E> getNext(){
            return next;
        }
        public void setNext(Node<E> n){
            next = n;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList(){} //constructor

    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        if (size == 0) {
            return  true;
        }
        else{
            return false;
        }
    }
    public E getFirstElement(){
        if (isEmpty()) {
            return null;
        }
        else{
            return head.getElement();
        }
    }
    public E getLastElement(){
        if (isEmpty()) {//empty list case
            return null;
        }
        else{
            return tail.getElement();
        }
    }
    public void addFirst(Node<E> node){
        if (isEmpty()) {
            head = node;
            tail = node;
        }
        else{
            node.setNext(head);
            head = node;
        }
        size++;
    }
    public void addLast(Node<E> node){
        if (isEmpty()) {
            head = node;
            tail = node;
        }
        else{
            tail.setNext(node);
            tail = node; //tail at last item in LL
        }
        size++;
    }
    public E removeFirst(){
        if (isEmpty()) {
            return null;
        }
        else{
            E returnValue = head.getElement();
            head = head.getNext();
            size--;

            if (head == null) {
                tail = null;
            }

            return returnValue;
        }
    }
    public E removeLast(){
        if (isEmpty()) {
            return null;
        }
        else{

            if (head == tail) {  // Special case: Only one element in the list
                E returnValue = head.getElement();
                head = null;
                tail = null;
                size--;
                return returnValue;
            }

            Node<E> traverseNode = head;
            while (traverseNode.getNext() != tail) {
                traverseNode = traverseNode.getNext();
            }

            E returnValue = tail.getElement();
            tail = traverseNode;
            tail.setNext(null);
            size--;

            return returnValue;
        }
    }
    // and some other methods relating to adding and deleting at certain pos.
}
