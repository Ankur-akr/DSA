import java.util.Arrays;

public class StringOps {
    static void main() {
        String a = "Ankur";
        String b = "Ankur";
        System.out.println(a==b);
        String c = new String("Ankur");
        System.out.println(a==c);
        System.out.println(Arrays.toString(new int[]{1,2,3,4,5}));
        System.out.println("a"+1);
        System.out.println('d'+1);
        System.out.println((char)('d'+1));
    }
}
