package hust.soict.dsai.lab01;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

    public static void main(String[] args) {
        
        // initialize scanner for user input
        Scanner input = new Scanner(System.in);
        
        // ask user to enter array length
        System.out.print("Enter array length: ");
        int length = input.nextInt();
        
        // initialize array
        int[] array = new int[length];
        
        // ask user to enter array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < length; i++) {
            array[i] = input.nextInt();
        }
        
        // sort array in ascending order
        Arrays.sort(array);
        
        // calculate sum of array elements
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += array[i];
        }
        
        // calculate average of array elements
        double average = (double) sum / length;
        
        // print sorted array, sum, and average
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
        
        // close scanner
        input.close();
    }

}
