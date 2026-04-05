public class stringBasics {
    static void main(String[] args) {
        String eg = "This is example string";
        //Length of string
        System.out.println("length of string "+eg.length());
        String name1 = "akr";
        String name2 = "akr1";
        if(name1.compareTo(name2)==0){
            System.out.println("equal");
        }
        System.out.println(eg.charAt(3));
    }
}
