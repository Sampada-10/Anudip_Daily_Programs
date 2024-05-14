package Assignment2;

class Shop
{
	int material;
	boolean flag=false;
	
	public synchronized int get()
	{
		while(flag==false)
		{
			try {
				wait();
			}
			catch(Exception e)
			{
				e.getStackTrace();
			}
		}
		flag=false;
		notify();
		return material;
	}
	
	public synchronized void put(int value)
	{
		while(flag==true)
		{
			try {
				wait();
			}
			catch(Exception e)
			{
				e.getStackTrace();
			}
		}
		material=value;
		flag=true;
		notify();
	}
}
class Consumer extends Thread
{

	Shop sh;
	int no;
	public Consumer (Shop s,int no)
	{
		sh=s;
		this.no=no;
	}
	public void run()
	{
		
		int i,value=0;
		for(i=0;i<10;i++)
		{
			value=sh.get();
			System.out.println("Consumer #"+this.no+" got "+value);
		}
	}
	
}

class Producer extends Thread
{
	Shop sh;
	int no;
	public Producer (Shop s,int no)
	{
		sh=s;
		this.no=no;
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			sh.put(i);
			System.out.println("Producer #"+ this.no+" put: "+i);
			try
			{
				sleep((int)(Math.random()*1000));
			}
			catch(Exception e)
			{
				e.getStackTrace();
			}
		}
	}
	
}
public class Que3SetA {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop s=new Shop();
		Producer p=new Producer(s,1);
		Consumer c=new Consumer(s,1);
		
		p.start();
		c.start();
	}

}
