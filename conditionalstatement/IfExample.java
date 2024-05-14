package conditionalstatement;

import java.util.*;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.: ");
		int no=sc.nextInt();
		if(no>0)
		{
			System.out.println("Number is positive");
		}
		sc.close();
	}

}
