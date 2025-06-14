public class ArrayQueue<E> implements QueueLab<E> {
    private int front;
    private int rear;
    private E[] arr;
    private int size;

    public ArrayQueue(int size){
        front = -1;
        rear = front;
        size = 0;
        arr = (E[])new Object[size];
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public boolean isEmpty(){
        return (front == -1);
    }
    @Override
    public void enqueue(E e){
        if (size() == arr.length) {
            throw new IllegalStateException("Queue has reached its maximum size"); 
        }
        if (isEmpty()) {
            arr[++front] = e;
            rear = front;
        }
        else{
            rear = (rear + 1) % arr.length;
            arr[rear] = e;
            size += 1;
        }
    }
    @Override
    public E first(){
        if (isEmpty()) {
            return null;
        }
        return arr[front];
    }
    @Override
    public E dequeue(){
        if (isEmpty()) {
            return null;
        }
        E tmp = arr[front];
        arr[front] = null;
        size -= 1;
        if (size() == 1) {
            front = -1;
            rear = front;
            return tmp;
        }
        else{
            front = (front + 1) % arr.length;
            return tmp;
        }
    }
}
