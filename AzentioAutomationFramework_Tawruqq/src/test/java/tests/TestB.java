package tests;

public class TestB {

	public static void main(String args[]) {
		int a = 10;
		TestB test = new TestB();
		System.out.println("a " + a);
		TestA testA = new TestA(15);
		a = testA.a;
		System.out.println("a " + a);
	}

}
