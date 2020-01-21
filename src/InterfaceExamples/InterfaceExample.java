package InterfaceExamples;
//1. abstract and public method can have body in Interface.
//2. Only static and default methods can have body.
//3. interface can't be declared as private
//4. interface cannot have private methods. (True)



interface demo1{
	public void smoke();
	
	abstract void qwerty();
	
	public static void weed() {
		System.out.println("INSIDE THE INTERFACE hello there");
	}
	
	default public void run2() {
		System.out.println("run2 method");
	}
}

interface demo3 extends demo1{
	public void run();
	public void walk();
}

class demodata implements demo1 , demo3
{

	@Override
	public void run() {
		System.out.println("run method");
	}

	@Override
	public void walk() {
		System.out.println("walk method");
		
	}

	@Override
	public void smoke() {
		System.out.println("smoke method");
	}

	@Override
	public void qwerty() {
		run2();
		System.out.println("Abstract Method");
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {
		
		demodata data = new demodata();
		demo1.weed();
		data.run();
		data.walk();
		data.smoke();
		data.qwerty();
		data.run2();
	}

}
