/*c) Write a program that loads names and phone numbers from a text file where the data 
is organized as one line per record and each field in a record are separated by a tab 
(\t).it takes a name or phone number as input and prints the corresponding other value 
from the hash table (hint: use hash tables)*/
package Assignment1;
import java.io.*;
import java.util.*;
public class Que3SetB {

	public static void main(String[] args) {
		File f=null;
		BufferedReader br=null;
		Hashtable<String,String> ht=new Hashtable();
		String line="";
		// TODO Auto-generated method stub
		try {
			f=new File("Infp.txt");
			br=new BufferedReader(new FileReader(f));
			while((line=br.readLine())!=null){
				String [] values=line.split(":");
				String name=values[0].trim();
				String number=values[1].trim();
				if(!name.equals("") && !number.equals("")) {
					ht.put(name, number);
				}
			}
			System.out.println("Values are added\n"+ht);
		}
		catch(Exception e){
			
		}
	}

}
