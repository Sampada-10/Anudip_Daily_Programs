package StringMethods;
import java.util.*;

public class StringFunction {
	    public static void main(String[] args) {
	        Functions f=new Functions();
	        Scanner sc= new Scanner(System.in);
	        char choice;
	        do{
	            System.out.println("\n>>>Methods<<<\n1)CharAt\n2)CompareTo\n3)Concat\n4)Contains\n5)Ends With\n6)Equals\n" +
	                    "7)EqualsIgnoreCase\n8)GetBytes\n9)Format\n10)GetChars\n11)Replace\n12)IsEmpty" +
	                    "\n13)Intern\n14)LastIndexOf\n15)Length\n16)split\n17)join()");
	            System.out.println("Enter choice ");
	            int ch=sc.nextInt();
	            switch (ch){
	                case 1:
	                	f.stringCharAt();
	                	break;
	                case 2:
	                	f.stringcompareTo();
	                	break;
	                case 3:
	                	f.stringConcat();
	                	break;
	                case 4:
	                	f.stringContains();
	                	break;
	                case 5:
	                	f.stringEndswith();
	                	break;
	                case 6:
	                	f.stringEquals();
	                	break;
	                case 7:
	                	f.stringEqualsIgnorecase();
	                	break;
	                case 8:
	                	f.stringgetBytes();
	                	break;
	                case 9:
	                	f.stringFormat();
	                	break;
	                case 10:
	                	f.stringgetChar();
	                	break;
	                case 11:
	                	f.stringReplace();
	                	break;
	                case 12:
	                	f.StringIsEmpty();
	                	break;
	                case 13:
	                	f.StringIntern();
	                	break;
	                case 14:
	                	f.stringLastIndexOf();
	                	break;
	                case 15:
	                	f.stringLength();
	                	break;
	                case 16:
	                	f.Stringsplit();
	                	break;
	                case 17:
	                	f.stringReplaceAll();
	                	break;
	                case 18:
	                	f.stringJoin();
	            }
	            System.out.println("You want to repeat menu");
	            choice=sc.next().charAt(0);
	        }while(choice=='y' ||choice=='Y');
	    }
	}
