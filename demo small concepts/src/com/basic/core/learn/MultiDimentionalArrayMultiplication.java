

import java.util.Scanner;

public class MultiDimentionalArrayMultiplication {

	public static void main(String[] args) {
		int a[][] = new int[3][2];
		int b[][] = new int[2][3];
		int c[][] = new int[3][3];
		int temp= 0;
		int element =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter eleemts of first array");
		// takes first array
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		// takes second array
		System.out.println("Enter elements of second array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		// display first array
		System.out.println("Elements of first array are: ");

		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j] + " ");
			}
		}

		// display Second array
		System.out.println("");
		System.out.println("Elements of second array are: ");

		for (int i = 0; i < 2; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(b[i][j] + " ");
			}

		}
		
		
		//below will be the real logic 
		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 2; j++) {
				 element = temp + a[i][j]*b[j][i];
				 temp = a[i][j]*b[j][i];
				 System.out.println("temp" + temp);
				 System.out.println("element"+element);
				 
				 //now u need to store the element into another array
				
				
				
			}
		}
		
		
		//display the 3rd array
		System.out.println("");
		System.out.println("Elements of merged array are: ");

		for (int i = 0; i < 3; i++) {
			System.out.println();
			for (int j = 0; j < 3; j++) {
				System.out.print(c[i][j] + " ");
			}

		}
		

	}

}
