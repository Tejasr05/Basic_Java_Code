package Example;

public class A {
	static int m = 100;// static variable

	void method() {
		int n = 90;// local variable
		System.out.println("This is local variable of the value is : " + n);
	}

	public static void main(String args[]) {
		int data = 50;// instance variable

		A a = new A();
		a.method();

	}
}// end of class
