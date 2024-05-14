package operators;

import java.util.*;

public class assignment {

	public static void main(String[] args)
	{
	 //assignment operators{ =,+=,-=,/=,*=,%=,<<=,>>=,&=,^=,|=}
		 Scanner sc=new Scanner(System.in);
	   	 System.out.println("Enter the number: ");
	   	 int num=sc.nextInt();
	   	 System.out.println("Initially no: "+num);
	   	 num+=5;
	   	 System.out.println("after adding 5 in no: "+num);
	   	 num-=10;
	   	 System.out.println("after multiplying no by 2: "+num);
	   	 num*=2;
	   	 System.out.println("after multiplying no by 2: "+num);
	  	 num/=2;
	  	 System.out.println("after divide no by 2:"+num);
	  	 System.out.println("add 10 in no: "+num);
	  	 num+=10;
	  	 num%=2;
	  	 System.out.println("no mod by 2: "+num);
	  	 sc.close();
	}

}
