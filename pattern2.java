package Patterns;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
        for(i=0;i<=4;i++)
        {
       	 for(j=5-i;j>=1;j--)
       	 {
       		System.out.print(" ");
       	 }
       	 for(int k=0;k<i*2+1;k++)
       	 {
       		System.out.print("*");
       	 }
       	System.out.println();
        }
	}

}
