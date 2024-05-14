package assignmentproblems;
import java.util.Scanner;
public class HotelMenuCard1 {
	    public static void main(String[] args) {
	        String bill="";
	        char inneryesno,outeryesno;
	        int innerchoice,quantity,total=0;
	        Scanner sc= new Scanner(System.in);
	        System.out.println("----- Welcome to Gurudev Pure Veg Restaurant -----");
	        do{
	            System.out.println(">>>>>--Menu---<<<<\n" +
	                    "1)Starter\n" +
	                    "2)Dishes\n" +
	                    "3)Cold Drinks & Ice-Creams\n" +
	                    "4)Generate Bill");
	            System.out.print("Enter choice: ");
	            int ch=sc.nextInt();
	            switch (ch){
	                case 1:
	                    do {
	                        System.out.println("\n=>   Starter Menu <<<\n" +
	                                "1)Masala papad \t\t\t 50 Rs.\n" +
	                                "2)Fry Papad    \t\t\t 50 Rs.\n" +
	                                "3)Panner Chilli\t\t\t140 Rs.");
	                        System.out.println("Enter choice: ");
	                        innerchoice=sc.nextInt();
	                        switch (innerchoice){
	                            case 1:
	                                System.out.print("How many Masala Papad you want: ");
	                                quantity=sc.nextInt();
	                                total+=50*quantity;
	                                bill+="Masala papad \t\t\t 50 Rs."+"\t\t"+quantity+"\n";
	                                break;
	                            case 2:
	                                System.out.print("How many Fry Papad you want: ");
	                                quantity=sc.nextInt();
	                                total+=50*quantity;
	                                bill+="Fry Papad    \t\t\t 50 Rs."+"\t\t"+quantity+"\n";
	                                break;
	                            case 3:
	                                System.out.print("How many Panner Chilli you want: ");
	                                quantity=sc.nextInt();
	                                total+=140*quantity;
	                                bill+="Panner Chilli\t\t\t140 Rs."+"\t\t"+quantity+"\n";
	                                break;
	                        }
	                        System.out.println("Sure Sir..Do you have more starter y/n");
	                        inneryesno=sc.next().charAt(0);
	                    }while (inneryesno=='Y' || inneryesno=='y');

	                    break;
	                case 2:
	                    do {
	                        System.out.println("\n=>   Dishes Menu <<<\n" +
	                                "1)Mix Veg      \t\t\t130 Rs.\n" +
	                                "2)Veg Maratha  \t\t\t140 Rs.\n" +
	                                "3)Panner Masala\t\t\t150 Rs.\n" +
	                                "4)Veg Kolhapuri\t\t\t160 Rs.\n" +
	                                "5)Kaju curry \t\t\t130 Rs.");
	                        System.out.println("Enter choice: ");
	                        innerchoice=sc.nextInt();
	                        switch (innerchoice){
	                            case 1:
	                                System.out.print("How many Mix Veg you want: ");
	                                quantity=sc.nextInt();
	                                total+=130*quantity;
	                                bill+="Mix Veg \t\t\t130 Rs."+"\t\t"+quantity+"\n";
	                                break;
	                            case 2:
	                                System.out.print("How many Veg Maratha you want: ");
	                                quantity=sc.nextInt();
	                                total+=140*quantity;
	                                bill+="Veg Maratha  \t\t\t140 Rs."+"\t\t"+quantity+"\n";
	                                break;
	                            case 3:
	                                System.out.print("How many Panner Masala you want: ");
	                                quantity=sc.nextInt();
	                                total+=150*quantity;
	                                bill+="Panner Masala\t\t\t150 Rs."+"\t\t"+quantity+"\n";
	                                break;
	                            case 4:
	                                System.out.print("How many Veg Kolhapuri you want: ");
	                                quantity=sc.nextInt();
	                                total+=150*quantity;
	                                bill+="Veg Kolhapuri\t\t\t160 Rs."+"\t\t"+quantity+"\n";
	                                break;
	                            case 5:
	                                System.out.print("How many Kaju curry you want: ");
	                                quantity=sc.nextInt();
	                                total+=130*quantity;
	                                bill+="Kaju curry \t\t\t130 Rs."+"\t\t"+quantity+"\n";
	                                break;
	                        }
	                        System.out.println("Sure Sir..Do you have more dishes y/n");
	                        inneryesno=sc.next().charAt(0);
	                    }while (inneryesno=='Y' || inneryesno=='y');

	                	break;
	                case 3:
	                	System.out.println("1).cold Drinks \n2).Ice-Creams Menu\\n");
	                	System.out.println("Select menu which you want?");
	                	int m=sc.nextInt();
	                	if(m==1)
	                	{
		                    do {
		                        System.out.println("\n=>   Cold Drinks Menu <<<\n" +
		                                "1)Orange_juice     \t\t\t 10 Rs.\n" +
		                                "2)Sprite      \t\t\t 20 Rs.\n" +
		                                "3)Pepsi   \t\t\t 10 Rs." +
		                                "4)Fruity      \t\t\t 20 Rs.\n" );
		                        System.out.println("Enter choice: ");
		                        innerchoice=sc.nextInt();
		                        switch (innerchoice){
		                            case 1:
		                                System.out.print("How many glass Orange juice you want: ");
		                                quantity=sc.nextInt();
		                                total+=10*quantity;
		                                bill+="Orange_juice\t\t\t 10 Rs."+"\t\t"+quantity+"\n";
		                                break;
		                            case 2:
		                                System.out.print("How many Sprite you want: ");
		                                quantity=sc.nextInt();
		                                total+=20*quantity;
		                                bill+="Sprite\t\t\t 20 Rs."+"\t\t"+quantity+"\n";
		                                break;
		                            case 3:
		                                System.out.print("How many Pepsi you want: ");
		                                quantity=sc.nextInt();
		                                total+=10*quantity;
		                                bill+="Pepsi\t\t\t 10 Rs."+"\t\t"+quantity+"\n";
		                                break;
		                            case 4:
		                                System.out.print("How many Fruity you want: ");
		                                quantity=sc.nextInt();
		                                total+=10*quantity;
		                                bill+="Fruity\t\t\t 10 Rs."+"\t\t"+quantity+"\n";
		                                break;
		                        }
		                        System.out.println("Sure Sir..Do you have more Cold drinks y/n");
		                        inneryesno=sc.next().charAt(0);
		                    }while (inneryesno=='Y' || inneryesno=='y');
		                    break;
	                	}
	                	else if(m==2) 
	                	{
	                		do {
		                        System.out.println("\n=>   Ice-cream Menu <<<\n" +
		                                "1)Butter Scotch \t\t\t 50 Rs.\n" +
		                                "2)Strawberry Icecream\t\t\t 30 Rs.\n" +
		                                "3)Chocolate Icecream\t\t\t 25 Rs.\n" +
		                                "4)Pista Icecream \t\t\t 20 Rs.\n" );
		                        System.out.println("Enter choice: ");
		                        innerchoice=sc.nextInt();
		                        switch (innerchoice){
		                            case 1:
		                                System.out.print("How many Butter Scotch you want? ");
		                                quantity=sc.nextInt();
		                                total+=10*quantity;
		                                bill+="Butter Scotch\t\t\t 10 Rs."+"\t\t"+quantity+"\n";
		                                break;
		                            case 2:
		                                System.out.print("How many Strawberry Icecream you want? ");
		                                quantity=sc.nextInt();
		                                total+=20*quantity;
		                                bill+="Strawberry Icecream\t\t\t 20 Rs."+"\t\t"+quantity+"\n";
		                                break;
		                            case 3:
		                                System.out.print("How many Chocolate Icecream you want? ");
		                                quantity=sc.nextInt();
		                                total+=10*quantity;
		                                bill+="Chocolate Icecream\t\t\t 10 Rs."+"\t\t"+quantity+"\n";
		                                break;
		                            case 4:
		                                System.out.print("How many Pista Icecream you want? ");
		                                quantity=sc.nextInt();
		                                total+=10*quantity;
		                                bill+="Pista Icecream\t\t\t 10 Rs."+"\t\t"+quantity+"\n";
		                                break;
		                        }
		                        System.out.println("Sure Sir..Do you have more Ice-Creams y/n");
		                        inneryesno=sc.next().charAt(0);
		                    }while (inneryesno=='Y' || inneryesno=='y');
		                    break;
	                	}
	                case 4:
	                	System.exit(0);
	                	break;
	            }
	            System.out.println("Do you have items y/n");
	            outeryesno=sc.next().charAt(0);
	        }while(outeryesno=='Y' || outeryesno=='y');
	        System.out.println("--------------> Your Bill <----------------\n" +
	                "-------------------------------------------");
	        System.out.println("Item Name \t\t\t     Price\t   Quantity\n" +
	                "------------------------------------------\n"+bill);
	        System.out.println("------------------------------------------\n" +
	                "Total      \t\t\t\t" + total+"Rs.");
	        System.out.println("Thank you.....Visit again!!!!!!");
	    }

}
