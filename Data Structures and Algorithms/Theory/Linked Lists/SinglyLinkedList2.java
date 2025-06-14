public class SinglyLinkedList2<E> {
    public static class Node<E>{
        E data;
        Node<E> next;

        public Node(E value){
            data = value;
            next = null;
        }
        public E getData(){
            return data;
        }
        public Node<E> getNext(){
            return next;
        }
        public void setNext(Node<E> ptr){
            next = ptr;
        }
    }

    private Node<E> head;
    private Node<E> tail;
    private int size;

    public SinglyLinkedList2(){//creating the list
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        }
        else{
            return false;
        }
    }
    public int getListSize(){
        return size;
    }
    

    public void addFirst(E value){
        Node<E> newNode = new Node<E>(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            size++;
        }
        else{
            newNode.setNext(head);
            head = newNode;
            size++;
        }
    }
    public void addLast(E value){
        Node<E> newNode = new Node<E>(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            size++;
        }
        else{
            tail.setNext(newNode);
            tail = newNode;
            size++;
        }
    }
    public void addAt(int index,E value){
        Node<E> newNode = new Node<E>(value);
        if (index > size || index < 0) {
            return;
        }
        if (index == 0) {
            addFirst(value);
        }
        if (index == size) {
            addLast(value);
        }
        else{//somewhere in between
            Node<E> curr = head,prev = null;
            int cnt = 0;
            while (cnt < index) {
                prev = curr;
                curr = curr.next;
                cnt++;
            }
            newNode.setNext(curr);
            prev.setNext(newNode);
            size++;
        }
    }
    public E removeFirst(){
        if (isEmpty()) {
            return null;
        }
        else{
            if (size == 1) {
                E returnValue = head.getData();
                head = null;
                tail = head;
                size--;
                return returnValue;
            }
            else{
                E returnValue = head.getData();
                head = head.getNext();
                size--;

                return returnValue;
            }
        }
    }
    public E removeLast(){
        if (isEmpty()) {
            return null;
        }
        else{
            if (size == 1) {
                E returnValue = head.getData();
                head = null;
                tail = head;
                size--;
                return returnValue;
            }
            else{
                E returnValue = tail.getData();
                Node<E> traverse = head;

                while (traverse.getNext() != tail) { 
                    traverse = traverse.getNext();
                }
                tail = traverse;
                traverse.setNext(null);
                size--;

                return returnValue;
            }
        }
    }
    public E removeAt(int index){
        if(index < 0 || index > size){
            return null;
        }
        else{
            if (index == 0) {
                E returnValue = head.getData();
                head = head.getNext();
                size--;

                return returnValue;
            }
            if (index == size - 1) {
                E returnValue = tail.getData();
                Node<E> traverse = head;

                while (traverse.getNext() != tail) { 
                    traverse = traverse.getNext();
                }
                tail = traverse;
                traverse.setNext(null);
                size--;

                return returnValue;
            }
            else{
                Node<E> curr = head,prev = null;
                int cnt = 0;

                while (cnt < index) {
                    prev = curr;
                    curr = curr.next;
                    cnt++;
                }
                E returnValue = curr.getData();
                curr = curr.getNext();
                prev.setNext(curr);
                size--;

                return returnValue;
            }
        }
    }
    public void printList(){
        Node<E> traverse = head;
        while (traverse != null) {
            System.out.println(traverse.getData());
            traverse = traverse.getNext();
        }
    }
}
