package firstprogram;
import java.util.Scanner;
public class Matrices {
	public static void main(String args[]){
		int a, b, c, d;
		Scanner in = new Scanner(System.in);
      
		
		//Input size of the matrices 
		System.out.println("Input number of rows of matrix: ");
		a = in.nextInt();
		System.out.println("Input number of columns of matrix: ");
		b  = in.nextInt();
 
		int array1[][] = new int[a][b];
		int array2[][] = new int[a][b];
		int sum[][] = new int[a][b];
 
		
		//Input elements of matrices
		System.out.println("Input elements of first matrix: ");
		for (  c = 0 ; c < a ; c++ ) {
			for ( d = 0 ; d < b ; d++ )
				array1[c][d] = in.nextInt();
		}
		
		System.out.println("Input the elements of second matrix: ");
		for ( c = 0 ; c < a ; c++ ) {
			for ( d = 0 ; d < b ; d++ )
				array2[c][d] = in.nextInt();
		}
		
		
		//Add two matrices
		for ( c = 0 ; c < a ; c++ ) {
			for ( d = 0 ; d < b ; d++ )
				sum[c][d] = array1[c][d] + array2[c][d];
		}
		System.out.println("Sum of the matrices: ");
 
		for ( c = 0 ; c < a ; c++ ){
			for ( d = 0 ; d < b ; d++ )
				System.out.print(sum[c][d]+"\t");
			System.out.println();
		}
   }
}