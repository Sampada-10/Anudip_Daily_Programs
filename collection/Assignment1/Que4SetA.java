/*d) Create the hash table that will maintain the mobile number and student name. Display 
the contact list.*/
package Assignment1;
import java.util.*;
public class Que4SetA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Hashtable<String,String>ht = new Hashtable<String,String>();
		System.out.println("Enter the no. of elements: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter name: ");
			String name=sc.next();
			System.out.println("Enter Mobile no.: ");
			String no=sc.next();
			ht.put(name,no);
		}
//		 Iterator itr = ht.iterator(); 
//		 // checking the next element availabilty
//		 while (itr.hasNext()) 
//		 { 
//		 // moving cursor to next element 
//		 int i = (Integer)itr.next(); 
//		 // getting even elements one by one 
//		 System.out.print(i + " "); 
		System.out.println("Student data :"+ht);
		sc.close();
	}

}
