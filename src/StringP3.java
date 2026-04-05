import java.util.ArrayList;
import java.util.Arrays;

public class StringP3 {
    static void main() {
        String num = "52";
        System.out.println(Arrays.toString(num.toCharArray()));

        ArrayList<String> al = new ArrayList<>();
        int c=num.length();
        al.add(Arrays.toString(num.toCharArray()));
        System.out.println(al.getFirst());

    }
}
