//b) Write a program to sort HashMap by keys and display the details before sorting and 
//after sorting
package Assignment1;
import java.util.TreeSet;
import java.util.*;

public class Que2SetB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> hm= new HashMap<>();
		System.out.println("how many elements you wants: ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name and phone_no: ");
			String name=sc.next();
			int phone_no=sc.nextInt();
			hm.put(name, phone_no);
		}
		System.out.println("Data before sorting:  \n"+hm);
		sc.close();
		
		TreeMap tm= new TreeMap(hm);
		System.out.println("Data After sorting:  \n"+tm);
	}

}
