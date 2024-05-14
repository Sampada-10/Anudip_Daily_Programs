package Practicecode;

public class Acid {
	void process() throws Exception { throw new Exception(); }

	public static void main(String[] args) {

	new B().process();

	}

	static class B extends Acid {

	void process() { System.out.println("B"); }

	}
}
