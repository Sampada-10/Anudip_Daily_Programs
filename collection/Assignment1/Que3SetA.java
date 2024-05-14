/*c) Write a program to create a new tree set, add some colors (string) and print out the 
tree set.*/
package Assignment1;
import java.util.*;
public class Que3SetA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		TreeSet<Object> t=new TreeSet<>();
		
		System.out.println("How many colors you want : ");
		int n=sc.nextInt();
		System.out.println("Enter colours name: ");
		for(int i=0;i<n;i++)
		{
			String color=sc.next();
			t.add(color);
		}
		System.out.println("My favourite colours:  "+t);
		sc.close();
	}

}
