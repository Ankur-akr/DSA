import java.util.Iterator;
import java.util.LinkedList;

public class LLDelete {
    static void main() {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 1; i <51 ; i++) {

            numbers.add(i);
        }
        System.out.println(numbers);
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            if (it.next() > 25) {
                it.remove();
            }
        }

        //numbers.removeIf(n -> n>25);
        /*for (int i = numbers.size()-1; i>=0; i--) {
            if(numbers.get(i)>25){
                numbers.remove(i);
            }
        }*/
        System.out.println("Numbers greater than 25 are deleted");
        System.out.println(numbers);
    }
}
