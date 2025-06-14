public class LinkedListLab<E> implements LL<E>{
    public static class Node<E>{
        private E data;
        private Node<E> next;

        public Node(E e){
            data = e;
            next = null;
        }

        public E getNodeData(){
            return data;
        }
        public Node<E> getNodeNext(){
            return next;
        }
        public void setNodeNext(Node<E> x){
            next = x;
        }
    }
    private Node<E> head;
    private Node<E> tail;
    private int size;
    /*
     * public void prepend(E value);
    public void append(E value);
    public E popEnd();
    public E popFirst();
    public E getHead();
    public E getTail();
    public void remove(Node<E> node);
     */
    public LinkedListLab(){
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    public int getSize(){
        return size;
    }
    @Override
    public void prepend(E value){
        Node<E> newNode = new Node<>(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            size++;
        }
        else{
            newNode.setNodeNext(head);
            head = newNode;
            size++;
        }
    }
    @Override
    public void append(E value){
        Node<E> newNode = new Node<E>(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            size++;
        }
        else{
            tail.setNodeNext(newNode);
            tail = tail.getNodeNext();
            size++;
        }
    }
    @Override
    public E popFirst(){
        if (isEmpty()) {
            return null;
        }
        else{
            if(size == 1){
                E fnOutput = head.getNodeData();
                head = null;
                tail = null;
                size--;
                return fnOutput;
            }
            else{
                E fnOutput = head.getNodeData();
                head = head.getNodeNext();
                size--;
                return fnOutput; 
            }
        }
    }
    @Override
    public E popEnd(){
        if (isEmpty()) {
            return null;
        }
        else{
            if (size == 1) {
                E fnOutput = head.getNodeData();
                head = null;
                tail = null;
                size--;
                return fnOutput;
            }
            else{
                Node<E> traverser = head;
                while (traverser.getNodeNext() != tail) { 
                    traverser = traverser.getNodeNext();
                }
                E fnOutput = tail.getNodeData();
                tail = traverser;
                tail.setNodeNext(null);
                size--;
                
                return fnOutput;
            }
        }
    }
    @Override
    public E getHead(){
        if (isEmpty()) {
            return null;
        }
        else{
            return head.getNodeData();
        }
    }
    @Override
    public E getTail(){
        if (isEmpty()) {
            return null;
        }
        else{
            return tail.getNodeData();
        }
    }
    @Override
    public void remove(E target){
        if (isEmpty()) {
            System.out.println("Empty linked list");
            return;
        }
        else{
            if (size == 1) {
                if (head.getNodeData() == target) {
                    System.out.println("Target found!");
                    popFirst();
                    return;
                }
                else{
                    System.out.println("Target not found");
                }
                
            }
            else{
                Node<E> currentNode = head,previousNode = null;
                while (currentNode != null && !currentNode.getNodeData().equals(target)) { 
                    previousNode = currentNode;
                    currentNode = currentNode.getNodeNext();
                }
                if (currentNode == null) {
                    System.out.println("Data not found!");
                    return;
                }
                else{
                    if (currentNode == tail) {
                        tail = previousNode;
                        tail.setNodeNext(null);
                    }
                    else{
                    previousNode.setNodeNext(currentNode.getNodeNext());}
                    System.out.println("Data found.Removing...");
                    size--;
                    return;
                }
            }
        }
    }
    public void reverseList(){
       if (isEmpty() || size == 1) {
            return;
       }
       else{
            Node<E> current = head,previous = null,tmp;
            tail = head;
            while (current != null) {
                tmp = current.getNodeNext();//save next reference
                current.setNodeNext(previous);//reverse pointing
                previous = current;//move previous reference by one node
                current = tmp;//move current reference by one node in the right
            }
            head = previous;
            return;
       }
    }
    public void shiftList(int k){
        if (k <= 0 || k >= size) {
            return;            
        }
        else{
            tail.next = head;
            Node<E> traverser = head;
            for(int i = 0;i < size - k - 1;i++){
                traverser = traverser.next;
            }
            head = traverser.next;
            traverser.next = null;
            tail = traverser;
            return;
        }
    }
    public E getHeadData(){
        return head.getNodeData();
    }
    public void printList(){
        Node<E> traverser = head;
        while (traverser != null) {
            System.out.println(traverser.getNodeData());
            traverser = traverser.next;
        }
    }
}