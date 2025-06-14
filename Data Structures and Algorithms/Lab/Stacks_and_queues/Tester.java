public class Tester {
    public static void main(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        int tmp = stack.pop();
        stack.printStack();
    }
}
