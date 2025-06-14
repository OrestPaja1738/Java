public interface QueueLab<E> {
    public int size();
    public boolean isEmpty();
    public void enqueue(E e);
    public E first();
    public E dequeue();
}
