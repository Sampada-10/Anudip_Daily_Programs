package Practicecode;

public class Acid1 {
	void process() throws Exception { throw new Exception(); }

	public static void main(String[] args) {

	new B().process();

	}

	static class B extends Acid1 {

	void process() { System.out.println("B"); }

	}
}
