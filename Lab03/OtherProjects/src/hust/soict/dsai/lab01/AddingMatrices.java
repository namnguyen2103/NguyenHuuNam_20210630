package hust.soict.dsai.lab01;
import java.util.Scanner;
public class AddingMatrices {
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Input the size of the two matrices: ");
      System.out.print("Input the number of rows: ");
      int rows = keyboard.nextInt();
      System.out.print("Input the number of columns: ");
      int cols = keyboard.nextInt();
      
      int[][] matrix1 = new int[rows][cols];
      int[][] matrix2 = new int[rows][cols];
      int[][] matrixsum = new int[rows][cols];

      System.out.println("Input the first matrix:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            System.out.print("Input element on row " + (i + 1) + " column " + (j+1) + " of the first matrix: ");
            matrix1[i][j] = keyboard.nextInt();
         }
      }

      System.out.println("Input the second matrix:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            System.out.print("Input element on row " + (i + 1) + " column " + (j+1) + " of the second matrix: ");
            matrix2[i][j] = keyboard.nextInt();
         }
      }

      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            matrixsum[i][j] = matrix1[i][j] + matrix2[i][j];
         }
      }

      System.out.println("The sum of the two matrices is:");
      for (int i = 0; i < rows; i++) {
         for (int j = 0; j < cols; j++) {
            System.out.print(matrixsum[i][j] + " ");
         }
         System.out.println();
      }
   }
}
