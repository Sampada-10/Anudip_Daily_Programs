/*WAP to accept choice from user and execute the process
1:Boxing
2:Unboxing
3:Garbage collection

*/

package garbagecollection;

import java.util.*;

public class Garbage {
	Scanner sc=new Scanner(System.in);
	public void boxing()
	{
		System.out.println("The automatic conversion of primitive data types into\n its equivalent Wrapper type is known as boxing ");
		float num;
		System.out.println("Enter the float no.: ");
		num=sc.nextFloat();
		Float num1=new Float(num);
		System.out.println(num1+"\npremitive datatype value "+num1+" is converted into equivalent Wrapper type");  

	}
	public void unboxing()
	{
		System.out.println("The automatic conversion of wrapper class type into \ncorresponding primitive type, is known as Unboxing.");
		System.out.println("Enter the interger no.: ");
		Integer a=sc.nextInt();  
        int b=a;  
          
        System.out.println(b+"no.is converted into premitive datatype");  

	}
	 public void finalize()
	 {
		 System.out.println("object is garbage collected");
	 }  
	public void garbageCollection()
	{
			System.out.println("garbage means unreferenced objects.\nGarbage Collection is process of reclaiming the\nruntime unused memory automatically.");
			Garbage s1=new Garbage();  
			Garbage s2=new Garbage();  
		    s1=null;  
		    s2=null;  
		    System.gc();  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int ch;
		   char yesno;
           Scanner sc=new Scanner(System.in);
           Garbage g=new Garbage();
           do
           {
        	   System.out.println("______OPerations_________");
               System.out.println("1:Boxing\r\n"
               		+ "2:Unboxing\r\n"
               		+ "3:Garbage collection\r\n"
               		+ "4:Exit");
               System.out.println("Enter your choice : ");
               ch=sc.nextInt();
               switch(ch)
               {
                  case 1: 
                	  g.boxing();
                	  break;
                  case 2:
                	  g.unboxing();
                	  break;
                  case 3:
                	  g.garbageCollection();
                	  break;
                  case 4:
                	  System.exit(0);
                	  break;
                  default:
                	  System.out.println("Enter valid choice only!!!!!!");
               }
               System.out.println("Do you want to perform more operation(y/n): ");
               yesno=sc.next().charAt(0);
           }while(yesno=='Y' || yesno=='y');      
	}

}
