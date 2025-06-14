public class Tester {
    public static void main(String[] args) {
        ArrayQueue<Integer> data = new ArrayQueue<>();
        data.enqueue(1);
        data.enqueue(2);
        System.out.println(data.dequeue());
    }
}
