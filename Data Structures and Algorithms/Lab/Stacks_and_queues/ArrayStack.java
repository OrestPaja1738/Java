public class ArrayStack<E> implements  StackLab<E> {
    private static final int capacity = 1000;
    private int stackPointer = -1;
    private E data[];
    private int size = 0;

    public ArrayStack(){
        this(capacity);
    }
    public ArrayStack(int s){
        data = (E[])new Object[s];
    }
    @Override
    public boolean isEmpty(){
        return (size == 0);
    }
    @Override
    public int size(){
        return size;
    }
    @Override
    public void push(E e){
        if (size == data.length) {//full case
            throw new IllegalArgumentException("Stack is already full");
        }
        else{
            data[++stackPointer] = e;
            size += 1;
        }
    }
    @Override
    public E top(){
        if (isEmpty()) {
            return null;
        }
        return data[stackPointer];
    }
    @Override
    public E pop(){
        if (isEmpty()) {
            return null;
        }
        else{
            E fnOutput = data[stackPointer];
            data[stackPointer--] = null;
            size -= 1;
            return fnOutput;
        }
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("(");
        for(int i = stackPointer; i>=0; i--){
            sb.append(data[i]);
            if (i>0) {
                sb.append(" , ");
            }
        }

        sb.append(")");
        return sb.toString();
    }
}
