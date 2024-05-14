package conditionalstatement;
import java.util.*;
public class IfelseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.: ");
		int no=sc.nextInt();
		if(no%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		sc.close();
	}

}
