public class ArrayStack<E> implements StackInterface<E> {
    public static final int capacity = 1000;
    private int stackPointer = -1;
    private E[] dataArray;

    public ArrayStack(){
        this(capacity);//calls the other constructor
    }
    public ArrayStack(int size){
        dataArray = (E[]) new Object[size];
    }
    @Override
    public int size(){
        return (stackPointer + 1);
    }
    @Override
    public boolean isEmpty(){
        return (stackPointer == -1);
    }
    @Override //Stack pointer just to help navigating popping/pushing elements and nuthin else
    public void push(E element){
        if (size() == dataArray.length) {
            throw new IllegalArgumentException("Stack is already full");
        }
        else{
            dataArray[++stackPointer] = element;
        }
    }
    @Override
    public E pop(){
        if (isEmpty()) {
            return null;
        }
        else{
            E value = dataArray[stackPointer];
            dataArray[stackPointer] = null;
            stackPointer--;
            return value;
        }
    }
    @Override
    public E top(){
        if (isEmpty()) {
            return null;
        }
        else{
            return dataArray[stackPointer];
        }
    }
}
