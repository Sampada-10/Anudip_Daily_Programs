/*a) Write a java program to accept names of ‘n’ cities, insert same into array list 
collection and display the contents of same array list, also remove all these elements.*/

package Assignment1;
import java.util.*;
public class Que1SetA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		ArrayList<Object> al=new ArrayList<>();
		System.out.println("Enter the no. of cities: ");
		n=sc.nextInt();
		System.out.println("Enter "+n+" cities name: ");
		sc.nextLine();
		for( int i=0;i<n;i++)
		{
			String c=sc.nextLine();
			al.add(c);
		}
		System.out.println("cities : "+al);
		al.clear();
		System.out.println("All elements removed succesfully...");
		sc.close();
	}

}
