package assignmentproblems;
import java.util.*;
public class HotelMenuCard {
	static int stotal,dtotal,drinktotal,souptotal,nudalstotal;
    static Scanner sc = new Scanner(System.in);
    static int starterSelect(){
        char schoice;
        int starterquantity,sprice;
        do {
            System.out.println(">>>>>>Starter Menu<<<<<\n" +
                    "1)Fry Papad    \t\t\t  50 RS\n" +
                    "2)Masala Papad \t\t\t  50 RS\n" +
                    "3)Panner Chilli\t\t\t 140 Rs\n" +
                    "4)Lasun Fry    \t\t\t  60 RS\n");
            System.out.println("Enter Choice");
            int starterselect=sc.nextInt();
            switch (starterselect) {
                case 1, 2 -> {
                    System.out.println("How many quantity you want: ");
                    starterquantity = sc.nextInt();
                    sprice = 50;
                    stotal += sprice *= starterquantity;
                }
                case 3 -> {
                    System.out.println("How many quantity you want: ");
                    starterquantity = sc.nextInt();
                    sprice = 140;
                    stotal += sprice *= starterquantity;
                }

                case 4 -> {
                    System.out.println("How many quantity you want: ");
                    starterquantity = sc.nextInt();
                    sprice = 60;
                    stotal += sprice *= starterquantity;
                }
            }
            System.out.println("Do have more starter ? Y/N");
            schoice=sc.next().charAt(0);
        }while(schoice=='Y' || schoice=='y');
        return stotal;
    }
    static int soupSelect(){
        char schoice;
        int soupquantity,sprice;
        do {
            System.out.println(">>>>>>Soup Menu<<<<<\n" +
                    "1)Corn Soup     \t\t\t  50 RS\n" +
                    "2)Tomato        \t\t\t  50 RS\n" +
                    "3)Knorr Soup    \t\t\t  50 Rs\n" +
                    "4)Vegetable Soup\t\t\t  50 RS\n");
            System.out.println("Enter Choice");
            int soupselect=sc.nextInt();
            switch (soupselect) {
                case 1, 2,3,4 -> {
                    System.out.println("How many quantity you want: ");
                    soupquantity = sc.nextInt();
                    sprice = 50;
                    stotal += sprice *= soupquantity;
                }
            }
            System.out.println("Do have more Soup ? Y/N");
            schoice=sc.next().charAt(0);
        }while(schoice=='Y' || schoice=='y');
        return souptotal;
    }
    static int dishSelect(){
        char dchoice;
        int dquantity,dprice;
        do {
            System.out.println(">>>>>>Dishes Menu<<<<<\n" +
                    "1)Veg Maratha  \t\t\t  130 RS\n" +
                    "2)Veg Kolhapuri\t\t\t  140 RS\n" +
                    "3)Mix Veg      \t\t\t  120 Rs\n" +
                    "4)Veg Patiyala \t\t\t  110 RS\n" +
                    "5)Panner Masala\t\t\t  160 RS");
            System.out.println("Enter Choice");
            int dselect=sc.nextInt();
            switch (dselect) {
                case 1 -> {
                    System.out.println("How many quantity you want: ");
                    dquantity = sc.nextInt();
                    dprice = 130;
                    dtotal += dprice *= dquantity;
                }
                case 2 -> {
                    System.out.println("How many quantity you want: ");
                    dquantity = sc.nextInt();
                    dprice = 140;
                    dtotal += dprice *= dquantity;
                }
                case 3 -> {
                    System.out.println("How many quantity you want: ");
                    dquantity = sc.nextInt();
                    dprice = 110;
                    dtotal += dprice *= dquantity;
                }
                case 4 -> {
                    System.out.println("How many quantity you want: ");
                    dquantity = sc.nextInt();
                    dprice = 160;
                    dtotal += dprice *= dquantity;
                }
            }
            System.out.println("Do have more Dishes ? Y/N");
            dchoice=sc.next().charAt(0);
        }while(dchoice=='Y' || dchoice=='y');
        return souptotal;
    }
    static int nudalSelect(){
        char nchoice;
        int noddelquantity,nprice;
        do {
            System.out.println(">>>>>>Noddels Menu<<<<<\n" +
                    "1)Hakka Noddels  \t\t\t  70 RS\n" +
                    "2)Veg Sejavan    \t\t\t  80 RS\n" +
                    "3)Chinese Noddels\t\t\t  90 Rs\n" );
            System.out.println("Enter Choice");
            int soupselect=sc.nextInt();
            switch (soupselect) {
                case 1 -> {
                    System.out.println("How many quantity you want: ");
                    noddelquantity = sc.nextInt();
                    nprice = 70;
                    stotal += nprice *= noddelquantity;
                }
                case 2 -> {
                    System.out.println("How many quantity you want: ");
                    noddelquantity = sc.nextInt();
                    nprice = 80;
                    stotal += nprice *= noddelquantity;
                }
                case 3 -> {
                    System.out.println("How many quantity you want: ");
                    noddelquantity = sc.nextInt();
                    nprice = 90;
                    stotal += nprice *= noddelquantity;
                }
            }
            System.out.println("Do have more Noddels ? Y/N");
            nchoice=sc.next().charAt(0);
        }while(nchoice=='Y' || nchoice=='y');
        return nudalstotal;
    }
    static int drinkSelect(){
        char drinkchoice;
        int drinkquantity,drinkprice;
        do {
            System.out.println(">>>>>>Drink Menu<<<<<\n" +
                    "1)Pepsi    \t\t\t  30 RS\n" +
                    "2)Coco-kola\t\t\t  30 RS\n" +
                    "3)Sprite   \t\t\t  30 Rs\n" );
            System.out.println("Enter Choice: ");
            int drinkselect=sc.nextInt();
            switch (drinkselect) {
                case 1,2,3 -> {
                    System.out.println("How many quantity you want: ");
                    drinkquantity = sc.nextInt();
                    drinkprice = 70;
                    dtotal += drinkprice *= drinkquantity;
                }
            }
            System.out.println("Do have more Drinks ? Y/N");
            drinkchoice=sc.next().charAt(0);
        }while(drinkchoice=='Y' || drinkchoice=='y');
        return drinktotal;
    }
    static void generateBill(){
        System.out.println("Your Bill is "+(stotal+dtotal+drinktotal+souptotal+nudalstotal)+"\n" +
                "Thank you!!!! Visit again... ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(">>>>>>Menu Card<<<<<\n1)Starter\n2)Soup\n3)Nudals\n4)Dishes\n5)Cold Drinks\n6)Bill");
            System.out.println("Enter Choice: ");
            int choice=sc.nextInt();
            switch (choice){
                case 1->starterSelect();
                case 2->soupSelect();
                case 3->nudalSelect();
                case 4->dishSelect();
                case 5->drinkSelect();
                case 6-> {
                    generateBill();
                    System.exit(0);
                }
                default -> System.out.println("Enter valid case");
            }

        }while (true);
    }
}
