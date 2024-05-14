package collection;

import java.util.*;
public class FavouritePlace {

	String place;
	Scanner sc=new Scanner(System.in);
	LinkedList<String> places=new LinkedList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    FavouritePlace f=new FavouritePlace();
	    f.places();
		
		
	}
	public void places() {

		char ans;
		do
		{
			System.out.println("1:Add Item\n 2:View all the items\n3:Delete Item\n 4:Sort Item\n5:Exit");
			System.out.println("Select Your Choice:  ");
			int choice=sc.nextInt();
			switch(choice)
			{
			   case 1:
				   addItem();
				   break;
			   case 2:
				   viewItem();
				   break;
			   case 3:
				   deleteItem();
				   break;
			   case 4:
				   sortItem();
				   break;
			   case 5:
				   System.exit(0);
				   break;
				default:
					System.out.println("Invalid choice!!!");
					break;
			}
			System.out.println("Do you want to do any process Y/N: ");
			ans=sc.next().charAt(0);
		}while(ans=='Y' || ans=='y');
	}
	
	public void addItem() {
				System.out.println("Enter your favourite place: ");
				place=sc.next();
				places.add(place);
	}
	public void deleteItem() {
		System.out.println("Enter your place: ");
		place=sc.next();
		places.remove(place);
	}
	public void viewItem() {
		if(places.isEmpty())
		{
			System.out.println("Kindly add items first");
		}
		else
		{
			System.out.println("My Items are: ");
		}
		Iterator it_list=places.iterator();
		while(it_list.hasNext())
		{
			System.out.println(it_list.next());
		}
	}
	public void sortItem() {
		Collections.sort(places);
		viewItem();
	}


}