public class SinglyLL {
    private Node head;
    private Node tail;
    private int size;

    SinglyLL(){
        this.size=0;
    }
    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value ,Node next){
            this.value=value;
            this.next=next;
        }
    }


    public void insertFirst(int val){
        Node node = new Node(val);
        node.next =head;
        head = node;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        node.next = null;
        tail = node;
        size++;
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
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }
    public void deleteLast(){
        Node temp = head;
        for (int i = 0; i < size-2; i++) {
            temp= temp.next;
        }
        temp.next =null;
        tail=temp;
        size--;
    }
    public void deleteFirst(){
        head = head.next;
        size--;
    }

    public void delete(int index){
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            deleteLast();
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp= temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
    public void find(int val) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.value == val) {
                System.out.println(val + " found at index : " + i);
            }
            temp = temp.next;
        }
    }

    public void display(){
        Node currNode = head;
        while (currNode !=null){
            System.out.print(currNode.value + " -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    static void main() {
        SinglyLL a = new SinglyLL();
        a.insertFirst(1);
        a.insertFirst(3);
        a.insertFirst(5);
        a.insertFirst(15);
        //a.display();
        a.insertLast(55);
        a.insert(51,2);
        a.display();
        //a.deleteFirst();
        //a.display();
        //a.deleteLast();
        //a.display();
        //a.delete(2);
        //a.display();
        a.find(51);
        System.out.println(a.size);
    }
}
