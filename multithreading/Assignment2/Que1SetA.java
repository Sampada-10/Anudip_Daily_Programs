//a) Program to define a thread for printing text on output screen for ‘n’ number of times. 
//Create 3 threads and run them. Pass the text ‘n’ parameters to the thread constructor. 
//Example:   
//i.First thread prints “COVID19” 10 times.  
//ii.Second thread prints “LOCKDOWN2020” 20 times  
//iii.Third thread prints “VACCINATED2021” 30 times  


package Assignment2;

import java.util.*;
public class Que1SetA extends Thread
{
	Scanner sc=new Scanner(System.in);
	 String text;
	 int n;
	 public Que1SetA(String text, int times) {
	        this.text = text;
	        this.n = n;
	    }
	public void run()
	{
		try
		{
			for (int i = 0; i < n; i++) {
	            System.out.println(text);
	            try {
	                Thread.sleep(100); // Adjust sleep time if needed
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Que1SetA t1=new Que1SetA("COVID19",10);
		Que1SetA t2=new Que1SetA("LOCKDOWN2020",20);
		Que1SetA t3=new Que1SetA("VACCINATED2021",30);
		
		t1.start();
		
		t2.start();
		
		t3.start();
		
		
	}

}
