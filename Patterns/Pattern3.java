package Patterns;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=5;i++){
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int k=5;k>=i;k--) {
                if ((k+i)%2==0)
                    System.out.print("1");
                else System.out.print("0");
            }
            System.out.println();
        }
	}

}
