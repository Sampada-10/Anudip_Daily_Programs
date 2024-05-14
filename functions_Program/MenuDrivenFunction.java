/*Write a program to perform the choice
1:Sum of digit
2:Prime No
3:Fibonacci series
Using Function*/
package functions_Program;
import java.util.*;
public class MenuDrivenFunction { 
	public int sumOfDigit(int num)
	{
		//find out sum of digits of numbers
		int sum=0;
        while(num!=0){
            sum+=num%10;//get a last digit of number and add in sum
            num/=10;
        }
        return sum;
	}
	public void primeNo(int num)
	{
		//To check no. is prime or not
		if(num<2 && num>=0){
            System.out.println(num+" number is NOT prime");
            return;
		}
		else {
	        int f=0;
	        for (int i=0;i<=num/2;i++){
	            if(num%i==0){
	                f++;
	                break;
	            }
	        }
        if(f==2){
            System.out.println(num+" is prime number");
        }
        else {
            System.out.println(num+" is NOT prime number");
        }
	 }
	}
	public void fibonacciSeries(int num)
	{
		System.out.print(0+" "+1);
        int num1=0,num2=1,num3;
        for(int i=2;i<num;i++){
            num3=num1+num2;     //store the addition of num1 and num2 in num3
            num1=num2;      //swapping the values
            num2=num3;      //swapping the values
            System.out.print(" "+num3);
        }
	}
	
	public static void main(String[] args) {
		MenuDrivenFunction mn=new MenuDrivenFunction();
		mn.menu();
	}

	public void menu()
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ch,n;
		do{
		System.out.println("\n_____MENU=>>>>>\n1:Sum of digit\r\n"
				+ "2:Prime No\n"
				+ "3:Fibonacci series\n");
		System.out.println("Select your choice: ");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Enter number: ");
				n=sc.nextInt();
				System.out.println("Sum of digits of number: "+sumOfDigit(n));
				break;
			case 2:
				System.out.print("Enter number ");
		        int num=sc.nextInt();
				primeNo(num);
				break;
			case 3:
				System.out.print("Enter number ");
		        int num1=sc.nextInt();
				fibonacciSeries(num1);
				break;
			default:
				System.out.println("Enter valid choice only!! ");
		}
	 }while(true);
	}
}


/*
 * //Write a program to perform the choice
//        1:Sum of digit
//        2:Prime No
//        3:Fibonacci series
//        Using Function
package com.AngularJava.DailyPrograms;

import java.util.Scanner;

public class Dec2MenuDriven {
    public  void menu(){
        do {
            System.out.println("-->-->-->--> MENU <--<--<--<--\n" +
                    "1:Sum of digit\n" +
                    "2:Prime No\n" +
                    "3:Fibonacci series\n" +
                    "4:Exit");
            System.out.print("Enter Choice: ");
            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();
            switch (ch){
                case 1->System.out.println("The sum of digit is: "+sumOfDighit(accept()));
                case 2->checkPrime(accept());
                case 3->fibonacciSeries(accept());
                case 4->System.exit(0);
                default->System.out.println("Enter valid case ");
            }
        }while(true);
    }
    public void fibonacciSeries(int num){
        System.out.print(0+" "+1);
        int num1=0,num2=1,num3;
        for(int i=2;i<=num;i++){
            num3=num1+num2;//store the addition of num1 and num2 in num3
            num1=num2;//swapping the values
            num2=num3;//swapping the values
            System.out.print(" "+num3);
        }
    }
    public void checkPrime(int num){
        if(num<=2 && num>=0){
            System.out.println(num+" number is NOT prime");
            return;
        }
        boolean f=true;
        for (int i=2;i<=num/2;i++){
            if(num%i==0){
                f=false;
                break;
            }
        }
        if(f){
            System.out.println(num+" is prime number");
        }
        else {
            System.out.println(num+" is NOT prime number");
        }

    }
    public int accept(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number ");
        int num=sc.nextInt();
        return num;
    }
    public int sumOfDighit(int num){
        int sum=0;
        while(num!=0){
            sum+=num%10;//get a last digit of number and add in sum
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        new Dec2MenuDriven().menu();
    }
}*/
