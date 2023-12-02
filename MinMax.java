package Practicecode;
import java.util.*;
public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c
		System.out.println("enter min no.: ");
		int min=sc.nextInt();
		System.out.println("enter max no.: ");
		int max=sc.nextInt();
		System.out.println(" Greatest no.: "+max);
		System.out.println(" Smallest no.: "+min);
		System.out.println(" All Even no.: ");
		for(int i=min;i<max;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println("All Odd no.:");
		for(int i=min;i<max;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
		sc.close();
	}

}
