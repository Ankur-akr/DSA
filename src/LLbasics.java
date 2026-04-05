public class LLbasics {
    Node head;
    private int size;
    LLbasics(){
        size =0;
    }
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //Add First
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next=head;
        head = newNode;
    }
    //Add Last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next !=null){
            lastNode = lastNode.next;
        }
        lastNode.next=newNode;
    }
    //Print
    public  void printList(){
        Node currNode = head;
        while (currNode !=null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    //Delete First
    public void removeFirst(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        head = this.head.next;
        size--;
    }
    //Delete Last
    public void removeLast() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }


        size--;
        if(head.next == null) {
            head = null;
            return;
        }


        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }


        currNode.next = null;
    }


    public int getSize() {
        return size;
    }


    static void main() {
            LLbasics list = new LLbasics();
            list.addLast("akr");
            list.printList();
            list.getSize();
        }
}
