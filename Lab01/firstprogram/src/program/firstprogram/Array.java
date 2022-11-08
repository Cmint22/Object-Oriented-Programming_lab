package firstprogram;

import java.util.Arrays; 
public class Array {
public static void main(String[] args){   
    
	int Sum = 0;
    int[] array1 = {
            1789, 2035, 1899, 1456, 2013};  
    
    
    //Sort a numeric array   
    System.out.println("Original numeric array : " + Arrays.toString(array1));
    Arrays.sort(array1);
    System.out.println("Sorted numeric array : " + Arrays.toString(array1));
    
    
    //Calculate the sum and average
    for (int i = 0; i < array1.length; ++i) {
    	Sum += array1[i];
    }
    System.out.println("The sum of all the elements in the array1 is " + Sum);
    System.out.println("The average of all the elements in the array1 is " + (Sum/array1.length));
   }
}