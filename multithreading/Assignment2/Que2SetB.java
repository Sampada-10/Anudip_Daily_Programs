package Assignment2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Que2SetB {
	    public String searchString;
	    public File file;

	    public Que2SetB(String searchString, File file) {
	        this.searchString = searchString;
	        this.file = file;
	    }

	    public void run() {
	        try {
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter String you want to search:");
	        String str=sc.nextLine();
	        
	        //your folder name
	        String dirname="Thread";
	        file d=new file(dirname);
	        
	    }

}
