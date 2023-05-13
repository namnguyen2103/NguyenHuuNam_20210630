package hust.soict.dsai.lab01;
import java.util.Scanner;
import java.util.Arrays;
public class NumericArray {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
		System.out.print("Input length of array: ");
		int n = keyboard.nextInt();
		int[] array = new int[n];
        int sum = 0;
		for (int i = 0; i < n; i++) {
			System.out.print("Input element " + (i + 1) + " of the array: ");	
			array[i] = keyboard.nextInt();	
            sum += array[i];	
		}
        
        //Sort the array in ascending order
        Arrays.sort(array);

        //Print out the results
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value of array elements: " + (sum / n));
    }
}
