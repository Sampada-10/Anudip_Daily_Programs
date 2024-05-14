package multithreading;

public class Mobile extends Thread
{
public static void main(String [] arg)
{
	System.out.println(Thread.currentThread().getName());
	
	Mobile m= new Mobile();
	m.start();
	Mobile m1= new Mobile();
	m1.start();
}
@Override
	public void run(){
	System.out.println(Thread.currentThread().getName());
}
}