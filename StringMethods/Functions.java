package StringMethods;
import java.util.*;
public class Functions {

	String str1,str2;
	
	Scanner sc=new Scanner(System.in);
	void stringCharAt()
	{
		//CharAt() it returns the Particular character 
		int pos;
		System.out.println("Enter the String: ");
		str1=new String(sc.nextLine());
		System.out.println("Enter the position of character which you want: ");
		pos=sc.nextInt();
		System.out.println("Character at "+pos+" position is "+str1.charAt(pos));
	}
	void stringcompareTo()
	{
		//CompareTo() used for compare two String
		System.out.println("Enter the String: ");
		str1=new String(sc.nextLine());
		System.out.println("Enter the String: ");
		str2=new String(sc.nextLine());
		if(str1.compareTo(str2)==0)
		{
			System.out.println(str1+"is equal to "+str2);
		}
		else if(str1.compareTo(str2)<0)
			System.out.println(str1+"is greater to "+str2);
		else
			System.out.println(str1+"is less to "+str2);
	}
	void stringConcat()
	{
		//Concat() used to String concatination
		System.out.println("Enter the String: ");
		str1=new String(sc.nextLine());
		System.out.println("Enter the String: ");
		str2=new String(sc.nextLine());
		System.out.println("Concatenated is : "+str1.concat(str2));
	}
	void stringContains()
	{
		//searches the sequence of characters in this string.
		System.out.println("Enter the String: ");
		str1=new String(sc.nextLine());
		System.out.println("Enter the String which you want to search: ");
		str2=new String(sc.next());
		if(str1.contains(str2)) {
			System.out.println(str2+" is found");
		}
		else
		   System.out.println(str2+" is not found");
	}
	void stringEndswith()
	{
		//endsWith() method checks if this string ends with a given suffix returns True
		System.out.println("Enter the String: ");
		str1=new String(sc.nextLine());
		System.out.println("Enter the Suffix String: ");
		str2=new String(sc.next());
		if(str1.endsWith(str2))
		{
			 System.out.println("String ends with "+str2);  
		}
		else
			 System.out.println("String ends with "+str2);  
	}
	void stringEquals() 
	{
		//compares the two given strings based on the content of the String
		System.out.println("Enter the First String: ");
		str1=new String(sc.nextLine());
		System.out.println("Enter the second String: ");
		str2=new String(sc.next());
		if(str1.equals(str2))
		{
			System.out.println(str1+"is equal to "+str2);
		}
		else
			System.out.println(str1+"is not equal to "+str2);
	}
	void stringEqualsIgnorecase() 
	{
		//compare two Strings doesn't check the case sensitivity
		System.out.println("Enter the First String: ");
		str1=new String(sc.nextLine());
		System.out.println("Enter the second String: ");
		str2=new String(sc.next());
		System.out.println(str1.equalsIgnoreCase(str2));
	}
    void  stringFormat()
    {
    	//??
    	System.out.println("Enter the String: ");
    	String sf1=new String(sc.nextLine());  
    	String sf2=String.format("value is %f",32.33434);  
    	String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  
    	  
    	System.out.println(sf1);  
    	System.out.println(sf2);  
    	System.out.println(sf3);  
    }
    void stringgetBytes()
    {
    	//getBytes() method does the encoding of string into the sequence of bytes and keeps it in an array of bytes.
    	System.out.println("Enter the String: ");
    	String str=new String(sc.nextLine()); 
    	byte []temp=str.getBytes();
    	for(int i=0;i<temp.length;i++)
    	{
    		System.out.println(temp[i]);
    	}
    }
    void stringgetChar()
    {
    	// getChars() method copies the content of this string into a specified char array. 
    	System.out.println("Enter the String: ");
    	String str=new String(sc.nextLine()); 
    	char []temp=new char[10];
    	try {
    		str.getChars(0, 4, temp, 0);
    		System.out.println(temp);
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
    }
    void stringIndexOf()
    {
    	// indexOf() method returns the position of the first occurrence of the specified character or String
    	int index ;
    	System.out.println("Enter the String: ");
		str1=new String(sc.nextLine());
		System.out.println("Enter the SubString: ");
		str2=new String(sc.nextLine());
		index = str1.indexOf("str2"); //Returns the index of this substring  
	    System.out.println("index of substring "+index);   
    }
    public void StringIntern()
    {
    	//intern() method returns the interned string. It returns the canonical representation of string.
    	//It can be used to return string from memory if it is created by a new keyword. It creates an exact 
    	//copy of the heap string object in the String Constant Pool.
        System.out.println("Enter 1 String");
        str1=new String(sc.nextLine());
        System.out.println("Enter 1 String");
        str2=sc.nextLine();
        String str3=str1.intern();//returns string from pool, now it will be same as s2
        System.out.println("false because reference variables are pointing to different instance "+str1==str2);//false because reference variables are pointing to different instance
        System.out.println("true because reference variables "+str2==str3);//
    }
    public void StringIsEmpty()
    {
    	//isEmpty() is used to check string is empty or not.
        System.out.println("Enter the String");
        String str=new String(sc.nextLine());
        if (str1.isEmpty()){
            System.out.println("String is empty");
        }
        else {
            System.out.println("String is Not empty");
        }
    }
    public void stringJoin()
    {
    	// class join() method returns a string joined with a given delimiter.
    		String str = null;  
    	  
    	// one of the element is null however it will be treated as normal string  
    		str = String.join("-", null, " wake up ", " eat ", " write content for JTP ", " eat ", " sleep ");  
    		System.out.println(str);  
    }
    public void stringLastIndexOf()
    {
    	// returns the last index of the given character subString
        System.out.println("Enter the String");
        str1=new String(sc.nextLine());
        System.out.println("Enter substring");
        String temp=sc.next();
        int index1=str1.lastIndexOf(temp);//returns the index of is substring
        System.out.println(index1);
    }

    public void stringReplace()
    {
        System.out.println("Enter the String");
        str1=new String(sc.nextLine());
        System.out.println("Enter target string  ");
        String target=sc.next();
        System.out.println("Enter string do you want to replace  ");
        String temp=sc.next();
        System.out.println(str1.replace(target,temp));
    }
    public void stringReplaceAll()
    {
    	//eplaceAll() method returns a string replacing all the sequence of characters 
    	//matching regex and replacement string.
        System.out.println("Enter the String");
        str1=new String(sc.nextLine());
        System.out.println("Enter target string  ");
        String str2=sc.next();
        System.out.println("Enter string do you want to replace  ");
        String str3=sc.next();
        System.out.println(str1.replaceAll(str2,str3));
    }
    public void stringLength()
    {
    	//finds the length of a string.
        System.out.println("Enter the String");
        str1=new String(sc.nextLine());
        System.out.println("Length of String is: "+str1.length());
    }
    public void Stringsplit()
    {
    	//splits the string based on whitespace  
    	//using java foreach loop to print elements of string array  
    	System.out.println("Enter the String");
        str1=new String(sc.nextLine());
        String [] words=str1.split(" ");
        for(String w:words){
        	System.out.println("Split String are "+w);
        }
    }
    
}
