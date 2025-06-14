public interface LL<E> {
    public void prepend(E value);
    public void append(E value);
    public E popEnd();
    public E popFirst();
    public E getHead();
    public E getTail();
    public void remove(E target);
}
