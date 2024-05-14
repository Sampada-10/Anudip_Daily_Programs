package operators;
import java.util.*;
public class logical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Enter 3 numbers: ");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		boolean and, or, not;
		and=((num1>num2)&&(num2<num3));
		System.out.println("((num1>num2)&&(num2<num3))=> "+and);
		or=((num1>num2)||(num2<num3));
		System.out.println("((num1>num2)||(num2<num3))=> "+or);		
		not=!(num1>num2);
		System.out.println("!(num1>num2)=> "+not);
		sc.close();		
	}

}
