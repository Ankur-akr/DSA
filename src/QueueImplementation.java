public class QueueImplementation{
    static class Queue {
        int front, rear, maxSize;
        int[] arr;

        Queue(int size) {
            maxSize = size;
            arr = new int[maxSize];
            front = 0;
            rear = -1;
        }

        void enqueue(int value) {
            if (rear == maxSize - 1) {
                System.out.println("Queue Overflow");
                return;
            }
            arr[++rear] = value;
        }

        int dequeue() {
            if (front > rear) {
                System.out.println("Queue Underflow");
                return -1;
            }
            return arr[front++];
        }

        int peek() {
            if (front > rear) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
    }

    static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(7);
        queue.enqueue(12);
        System.out.println(queue.rear);
        queue.enqueue(11);
        queue.enqueue(9);
        System.out.println(queue.rear);
        queue.dequeue();
        System.out.println(queue.front);
    }
}