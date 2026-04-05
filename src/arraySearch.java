import java.util.Scanner;

public class arraySearch {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of rows ");
        int rows = sc.nextInt();
        System.out.println("enter no. of columns ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("enter the elements of 2D Array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter element to search");
        int target = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (target == matrix[i][j]){
                    System.out.println(target+" Element found at ["+i+"] ["+j+"] index" );
                }
            }
        }
    }
}
