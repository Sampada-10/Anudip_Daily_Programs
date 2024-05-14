package operators;
import java.util.*;
public class TernaryOperator {

	public static void main(String[] args) {
		// ternary operator:  conditional operator
		//it contains 3 operands
		//result=(expression)?value if true: value if false
		
		
		int num1,num2,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no: ");
		num1=sc.nextInt();
		System.out.println("Enter 2nd no: ");
		num2=sc.nextInt();
		result=num1<num2?num1:num2;
		System.out.println("Smallest number is: "+result);
		sc.close();
	}

}
