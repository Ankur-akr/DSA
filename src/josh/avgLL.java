package josh;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
}

public class avgLL {
    static double findAvg(Node head){
        double sum =0;
        int count = 0;
        Node temp = head;
        while (temp!= null){
            sum += temp.val;
            temp = temp.next;
            count++;
        }
        if (count == 0) return 0;
        double avg = sum/count;
        return avg;
    }

    static void main() {
        Node head = new Node(10);
        head.next = new Node(50);
        head.next.next = new Node(17);
        System.out.println(findAvg(head));
    }
}
