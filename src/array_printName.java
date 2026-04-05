import java.util.Scanner;

public class array_printName {
    static void main() {
        System.out.println("enter size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] name= new String[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter "+(i+1)+ " name");
            name[i] = sc.next();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(name[i]);
        }

    }
}
