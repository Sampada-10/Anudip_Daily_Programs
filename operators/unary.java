package operators;
import java.util.Scanner;
public class unary {

	public static void main(String[] args) {
		// unary operator: Increment and Decrement Operator
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int num=sc.nextInt();
       
      /* suppose
       no=5
       no++=> 5
       ++no=> 7
       no--=> 7
       --no=> 5*/
     
       System.out.println("num++=> "+(num++));       
       System.out.println("++num=> "+(++num));
       System.out.println("num--=> "+(num--));
       System.out.println("--num=> "+(--num));
       sc.close();
	}

}
