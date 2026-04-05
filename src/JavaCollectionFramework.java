import java.util.ArrayList;
import java.util.List;

public class JavaCollectionFramework {
    static void main() {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(5);
        al.add(11);
        for(int x : al){
            System.out.println(x);
        }
    }
}
