
import java.util.Stack;

public class demo {
    static void main() {
        Stack<String> stk = new Stack<>();
        stk.push("a");
        stk.push("b");
        String top = stk.pop();
        System.out.println(top);
        System.out.println(stk.size());
        stk.peek();


    }
}
