import java.util.LinkedList;

public class LinkedListBasics {
    static void main() {
        LinkedList<String> names = new LinkedList<>();
        names.add("ankur");
        names.add("akr");
        names.addFirst("Ankur Rai");
        names.add("jiya");
        names.set(3,"jiya chand");
        System.out.println(names);
        //names.removeLast();
        System.out.println(names.size());
    }
}
