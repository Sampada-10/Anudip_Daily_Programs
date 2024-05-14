package operators;
import java.util.*;
public class arithmetic {
     public static void main(String[] args)
     {
    	 //arithmetic operators(+,-,*,/,%)
    	 Scanner sc=new Scanner(System.in);
    	 int num1, num2;
    	 System.out.println("Enter 1st no.: ");
    	 num1=sc.nextInt();
    	 System.out.println("Enter 2nd no.: ");
    	 num2=sc.nextInt();
    	 //addition operator
    	 int addition=num1+num2;
    	 System.out.println("Additon of two no.: "+addition);
    	 //subtraction operator
    	 int subtraction=num1-num2;
    	 System.out.println("Subtraction of two no.: "+subtraction);
    	 //multiplication operator
    	 int multiplication=num1*num2;
    	 System.out.println("multiplication of two no.: "+multiplication);
    	 //division operator
    	 int division=num1/num2;
    	 System.out.println("Division of two no.: "+division);
    	 //Modulus operator
    	 int modulus=num1%num2;
    	 System.out.println("Modulus of two no.: "+modulus);
    	 sc.close();
     }
     
}
