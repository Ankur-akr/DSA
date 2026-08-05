import java.util.Stack;

public class StackImplementation {

    class Stk{
        int top;
        int maxSize;
        int[] arr;
        Stk(int size){
            maxSize = size;
            arr = new int[maxSize];
            top = -1;
        }
        void push(int value){
            arr[++top]=value;
        }
    }

    static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);



    }
}
