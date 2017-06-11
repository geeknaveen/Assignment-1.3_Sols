/*Write a program in java to compare the truth table of Bitwise AND and Logical AND.  
 Hint: - Take two-byte variables and take the input from the user(as 0 0, 0 1, 1 0, 1 1) and show the result 
for Bitwise AND and Logical AND.  
*/
package bitwise.example;

import java.util.Scanner;

public class BitwiseProblem {
 private static Scanner sc;
		public static void main(String[] args) {
			int a, b;
			sc = new Scanner(System.in);
			System.out.println(" Please Enter two integer Value: ");
			a = sc.nextInt();
			b = sc.nextInt();
			//System.out.format(" Bitwise AND Operator: %d & %d = %d \n", a, b, a & b);
			//System.out.format(" Logical AND Operator: %d & %d = %d \n", a, b, (a && b));
			
			System.out.println(a<b&a++<b);
			System.out.println(a<b&&a++<b);
		
					}
	}

	


