package operators;

import java.util.*;

public class comparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		boolean result;
		System.out.println("Enter 1st no.: ");
		num1=sc.nextInt();
		System.out.println("Enter 2nd no.: ");
		num2=sc.nextInt();
		
		//== operator
		result=(num1==num2);
		System.out.println("(num1==num2): "+result);
		
		//not equal to operator
		result=(num1!=num2);
		System.out.println("(num1!=num2): "+result);
		
		//greater than operator
		result=(num1>num2);
		System.out.println("(num1>num2): "+result);
		
		//less than operator
		result=(num1<num2);
		System.out.println("(num1<num2): "+result);
		
		//greater than or equal to operator
		result=(num1>=num2);
		System.out.println("(num1>=num2): "+result);
		
		//greater than or equal to operator
		result=(num1<=num2);
		System.out.println("(num1<=num2): "+result);
		sc.close();
	}

}
