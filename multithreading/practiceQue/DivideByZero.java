/*Q.1 Write a Java program that divides two numbers entered by the user. Handle the ArithmeticException that may occur if the user attempts to divide by zero.
*/
package multithreading.practiceQue;
import java.util.*;
public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("Enter first no.: ");
		num1=sc.nextInt();
		System.out.println("Enter second no.: ");
		num2=sc.nextInt();
		if(num2==0)
		{
			throw new ArithmeticException("Divide by zero error....");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
