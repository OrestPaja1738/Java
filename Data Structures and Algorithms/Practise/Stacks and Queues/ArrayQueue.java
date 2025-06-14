public class ArrayQueue<E> implements Queue<E> {
    private static final int capacity = 4;
    private E[] data;
    private int size;
    private int head;
    private int tail;

    public ArrayQueue(){
        this(capacity);
    }
    public ArrayQueue(int c){
        data = (E[]) new Object[c];
        size = 0;
        head = 0;
        tail = -1;
    }
    public boolean isEmpty(){
        return (size == 0);
    }
    @Override
    public void enqueue(E e){
        if (size == data.length) {
            throw new IllegalArgumentException("Array is full");
        }
        if (isEmpty()) {
            data[head] = e;
            tail = head;
            size++;
        }
        else{
            if (tail == data.length - 1) {//end of array
                if (data[0] != null) {
                    throw new IllegalStateException("Enqueueing not possible");
                }
                else{
                    tail = 0;
                    data[tail] = e;
                    size++;
                }
            }
            else{//tail somewhere in the middle
                if (tail + 1 == head) {//gone full circle
                    throw new IllegalStateException("Cant enqueue any more values");
                }
                else{
                    data[++tail] = e;
                    size++;
                }
            }
        }
    }
    @Override
    public E dequeue(){
        if (isEmpty()) {
            System.out.println("Array is empty");
            return null;
        }
        else{
            if (head == data.length - 1) {//end of array
                if (data[0] == null) {//list becomes empty after dequeue
                    E fnOutput = data[head];
                    data[head] = null;
                    head = 0;
                    tail = -1;
                    size--;
                    return fnOutput;
                }
                else{
                    E fnOutput = data[head];
                    data[head] = null;
                    head = 0;
                    size--;
                    return  fnOutput;
                }
            }
            else{
                if (data[head + 1] == null) {//list gon be empty after dequeue
                    E fnOutput = data[head];
                    data[head] = null;
                    head = 0;
                    tail = -1;
                    size--;
                    return fnOutput;
                }
                else{
                    E fnOutput = data[head];
                    data[head++] = null;
                    size--;
                    return fnOutput;   
                }
            }
        }
    }
    @Override
    public E top(){
        return data[head];
    } 
    public void printQueue(){
        for (E e : data) {
            System.out.println(e);
        }
    }
}
/*
 * public void enqueue(E e);
    public E dequeue();
    public E top();
 */