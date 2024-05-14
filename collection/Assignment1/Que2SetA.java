/*b) Write a java program to read ‘n’ names of your friends, store it into linked list, also 
display contents of the same.*/

package Assignment1;
import java.util.*;
public class Que2SetA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedList<Object> l=new LinkedList<>();
		System.out.println("Enter the no. of Friends: ");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" Friend name: ");
		sc.nextLine();
		for( int i=0;i<n;i++)
		{
			String c=sc.nextLine();
			l.add(c);
		}
		System.out.println("My friends  : "+l);
		
		sc.close();
		
	}

}
