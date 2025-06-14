public class LinkedListStack<E> implements StackLab<E> {
    private LinkedListLab<E> list;
    public LinkedListStack(){
        list = new LinkedListLab<>();
    }
    @Override
    public int size(){
        return list.getSize();
    }
    @Override
    public boolean isEmpty(){
        return list.isEmpty();
    }
    @Override
    public void push(E e){
        list.prepend(e);
    }
    @Override
    public E top(){
        return list.getHeadData();
    }
    @Override
    public E pop(){
        return list.popFirst();
    }
    public void printStack(){
        list.printList();
    }
}
