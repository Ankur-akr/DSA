/*import java.util.Scanner;

public class dsa_basics {
    public static void main(String[] args) {
        System.out.println("Enter Marks");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("Grade A");
        }
        else if(marks>=70 && marks<90){
            System.out.println("Grade B");
        }
        else if(marks>=50 && marks<70){
            System.out.println("Grade C");
        }
        else if(marks>=35 && marks<50){
            System.out.println("Grade D");
        }
        else if (marks>=100){
            System.out.println("Invalid input please enter values ranging from 0 to 100");
        }
        else{
            System.out.println("Invalid input please enter values ranging from 0 to 100");
        }
    }
}*/


import java.util.Scanner;

public class dsa_basics {
    public static void main(String[] args) {
        int day;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1-7): ");
        day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }

        scanner.close();
    }
}
