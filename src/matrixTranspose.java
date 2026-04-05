import java.util.Scanner;

public class matrixTranspose {
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
        //To Print Transpose Of Matrix
        for (int j = 0; j < columns; j++) {
            for (int i = 0; i < rows; i++) {
                System.out.print(matrix[i][j] +" ");
            }
        }
        System.out.println();
        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
    }
}
