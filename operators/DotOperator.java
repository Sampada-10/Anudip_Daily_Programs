package operators;

public class DotOperator {

	String name;
	int age;
	void display()
	{
		System.out.println("Name= "+name);
		System.out.println("Age= "+age);
	}
	public static void main(String[] args) {
		// dot operator is use to access members of class
		DotOperator d=new DotOperator();
		d.name="abc";
		d.age=10;
		d.display();
		
	}

}
