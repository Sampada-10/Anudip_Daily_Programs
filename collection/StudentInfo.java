package collection;


import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class StudentInfo {

    public static void main(String[] args) {
        ArrayDeque<String> std=new ArrayDeque<>();
        Scanner sc= new Scanner(System.in);
       do{
           System.out.println(">>>>> MENU <<<<<\n" +
                   "1)Add First" +
                   "\n2)Add Last" +
                   "\n3)Remove Element" +
                   "\n4)Check is Empty" +
                   "\n5)Peek Element" +
                   "\n6)Poll Element" +
                   "\n7)Display Details" +
                   "\n8)Exit");
           System.out.println("Enter choice");
           switch (sc.nextInt()){
               case 1->{
                   System.out.println("Enter Student name at First");

                   std.addFirst(sc.next());
               }
               case 2->{
                   System.out.println("Enter Student name at Last");
                   std.addLast(sc.next());
               }
               case 3->{
                   System.out.println("Enter Student name do you want to remove");
                   if(std.remove(sc.next())) {
                       System.out.println("Student is remove ");
                   }
                   else{
                       System.out.println("Student name Not found ");
                   }
               }
               case 4->{
                   if(std.isEmpty()){
                       System.out.println("Student Queue is empty");
                   }
                   else {
                       System.out.println("Queue is not empty");
                   }
               }
               case 5-> System.out.println("The last student name in queue is "+ std.peek());

               case 6-> System.out.println("The First name in Queue is "+std.poll());

               case 7-> System.out.println("The students in the Queue are \n"+std);
               case 8-> System.exit(0);
           }
       }while (true);
    }
}