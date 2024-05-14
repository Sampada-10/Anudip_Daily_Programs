package operators;

import java.util.Scanner;

public class Bitwise {

	public static void main(String[] args) {
		// Bitwise operator
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter 1st no.: ");
		num1=sc.nextInt();
		System.out.println("Enter 2nd no.: ");
		num2=sc.nextInt();
		System.out.println("num1 & num2: "+(num1&num2));   // binary and
		System.out.println("num1 | num2: "+(num1|num2));    // binary or 
		System.out.println("num1 ^ num2: "+(num1^num2));		//binary Xor
		System.out.println("num1 = ~ num2: "+(num1=~num2));		//binary 1's complement
		System.out.println("num1 << num2: "+(num1<<num2));		//left shift
		System.out.println("num1 >> num2: "+(num1>>num2));		//right shift
		sc.close();
	}

}
