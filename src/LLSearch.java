import java.util.LinkedList;

public class LLSearch {
    static void main() {
        LinkedList<Integer> number = new LinkedList<>();
        number.add(1);
        number.add(3);
        number.add(4);
        number.add(6);
        number.add(5);
        number.add(7);
        number.add(9);
        System.out.println(number.get(5));
        for (int i = 0; i < number.size(); i++) {
            if(number.get(i)==7){
                System.out.println(i);
            }
        }
    }

}
