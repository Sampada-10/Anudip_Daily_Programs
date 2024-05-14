package conditionalstatement;
import java.util.*;
public class NestedIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int age , weight;
		System.out.println("Enter the age: ");
		age=sc.nextInt();
		System.out.println("Enter the age: ");
		weight=sc.nextInt();
		if(age>=18)
		{
			if(weight>50)
			{
				System.out.println(" Eligible to donate blood");
			}
			else
			{
				System.out.println(" Not Eligible to donate blood");
			}
		}
		else
		{
			System.out.println("Age must be greater than 18");
		}
		sc.close();
	}
}
