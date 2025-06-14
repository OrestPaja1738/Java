public class IdenticalLists {
    public class LinkedList{
        public class Node{
            int val;
            Node next;

            public Node(int x){
                val = x;
            }
        }

        Node head;
        int size;

        public LinkedList(){
            head = null;
            size = 0;
        }

        public Node getHead(){
            return head;
        }
        public int getSize(){
            return size;
        }

        public void insertNode(int x){
            if (head == null) {
                head = new Node(x);
                size += 1;
            }
            else{
                Node tmp = new Node(x);
                tmp.next = head;
                head = tmp;
                size += 1;
            }
        }
    }

    public boolean foo(LinkedList list1,LinkedList list2){
        if (list1.getSize() != list2.getSize()) {
            return false;
        }
        else{
            boolean isVisited[] = new boolean[list2.getSize()];

            IdenticalLists.LinkedList.Node curr1 = list1.getHead();

            for(int i = 0 ; i < list1.getSize();i++){
                IdenticalLists.LinkedList.Node curr2 = list2.getHead();

                for(int j = 0; j < list2.getSize();j++){
                    if (curr1.val == curr2.val && isVisited[j] == false) {
                        isVisited[j] = true;
                        break;
                    }
                    curr2 = curr2.next;
                }

                curr1 = curr1.next;
            }

            for(Boolean x : isVisited){
                if (x == false) {
                    return false;
                }
            }
            return true;
        }
    }
}
