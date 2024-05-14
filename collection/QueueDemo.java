package collection;

import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       PriorityQueue<String> queue=new PriorityQueue<>();
       System.out.println("How many elements you want: ");
       int n=sc.nextInt();
       System.out.println("Enter Student name: ");
       for(int i=0;i<n;i++)
       {
    	   String name=sc.next();
    	   queue.add(name);
       }
       
       System.out.println(queue);
       
       for(String na:queue)
       {
    	   System.out.println(na);
       }
       
       
	}

}
