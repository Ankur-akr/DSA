public class DLL {
    class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }


    }
    int size = 0;
    Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev =null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void display(){
        Node node = head;
        while(node != null){
            System.out.print(node.val + " <-> ");
            node =node.next;

        }
        System.out.println("null");
        /*
        System.out.println("LinkedList in Reverse");
        while(last != null){
            System.out.print(last.val + " <-> ");
            last = last.prev;

        }
        System.out.println("Start");*/
    }

    public void insertLast(int val ){
        Node node = new Node(val);
        Node temp = head;
        if(head == null){
            head = node;
            node.prev = null;
            return;
        }
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next=node;
        node.prev=temp;
        size++;
    }
    public void displayRev(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Reverse ");
        Node node = head;
        Node last = node;
        while(last.next != null){
            last = last.next;
        }
        while(last != null){
            System.out.print(last.val + " <-> ");
            last = last.prev;
        }
        System.out.println("Start");
    }
    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        DLL.Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        DLL.Node node = new DLL.Node(val, temp.next,temp.prev);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        node.next.prev = node;
        size++;
    }


    static void main() {
        DLL a = new DLL();
        a.insertFirst(55);
        a.insertFirst(11);
        a.insertLast(59);
        a.insert(101,1);
        a.display();
        a.displayRev();
        System.out.println("Size : "+ a.size);


    }

}
