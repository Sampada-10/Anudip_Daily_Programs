package multithreading;

public class RunnableInterface implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunnableInterface rn= new RunnableInterface();
		Thread tr= new Thread(rn);
		tr.start();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
	}

}
