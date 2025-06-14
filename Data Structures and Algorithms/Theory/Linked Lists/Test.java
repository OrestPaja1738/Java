public class Test {
    public static void main(String[] args) {
        SinglyLinkedList3 list = new SinglyLinkedList3<>();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        list.rotateList(2);
        list.printList();
    }
}
