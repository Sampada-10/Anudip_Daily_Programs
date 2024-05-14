//a) Accept ‘n’ integers from the user. Store and display integers in sorted order having 
//proper collection class. The collection should not accept duplicate elements.
//
package Assignment1;
import java.util.*;
public class Que1SetB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		TreeSet<Object> t=new TreeSet<>();
		System.out.println("Enter no.: ");
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			t.add(num);
		}
		System.out.println("Numbers in sorted order without duplicate elements: "+t);
	}

}
