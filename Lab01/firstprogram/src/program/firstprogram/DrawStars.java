package firstprogram;
import java.util.Scanner;
public class DrawStars {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		int height, k = 0;
		System.out.println("What is the height of the stars? ");
		height = keyboard.nextInt();
		//input the height of the triangle stars
		
		for (int i = 1; i <= height; ++i, k = 0) {
			for (int space = 1; space <= (height - i); ++space) {
				System.out.print("  ");
			}
			while (k != (2*i - 1)) {
				System.out.print("* ");
				++k;
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------------------- ");
	}
}
