//Have the function ABCheck(str) take the str parameter being passed and return the string true if the characters a and b are separated by exactly 3 places anywhere in the string at least once (ie. "lane borrowed" would result in true because there is exactly three characters between a and b). Otherwise return the string false.
package practicecode;

import java.util.*;

public class CheckCharacter {

	public boolean ABCheck(String str)
	{
	    for(int i=0;i<str.length()-4;i++)
	    {
	    	if(str.charAt(i)=='a') 
	    	{
	    		if(i+4<str.length()&&(str.charAt(i+4)=='b'))
				{
					return true;
				}
	    	}
	    }
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		CheckCharacter c=new CheckCharacter();
		System.out.println("Enter the String : ");
		String str=sc.nextLine();
		if(c.ABCheck(str))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
