public class customStack {
    static class Stack {
        int top;
        int maxSize;
        int[] arr;

        Stack(int size) {
            maxSize = size;
            arr = new int[maxSize];
            top = -1;
        }

        void push(int value) {
            if (top == maxSize - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            arr[++top] = value;


        }

        int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }

        int peek() {
            if (top == -1) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top];
        }
        
    }

    void main(String[] args) {
        Stack st = new Stack(5);
        st.push(5);
        st.push(11);
        System.out.println(st.peek());
        st.push(12);
        st.push(55);
        st.push(46);
        System.out.println(st.peek());
        st.push(71);
        st.pop();
        System.out.println(st.peek());

        for (int i = 0; i < st.maxSize; i++) {
            System.out.print(st.arr[i]+" --> ");
        }
    }


}