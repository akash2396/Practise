package sample;

public class Child1 implements Base1 {

	public static void main(String[] args) {
		
		Child1 c = new Child1();
		c.show();
		c.printMyName();

	}

	@Override
	public void printMyName() {
		
		System.out.println("My Name is Akash");
		
	}

	@Override
	public void show() {
		
		System.out.println("Hello World");
		
	}

}
