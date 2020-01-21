package InterfaceExamples;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

abstract class demo{
	
	private void sleep() {
		System.out.println("Inside Abstract Class Method");
	}
	abstract void run();
	abstract void walk();	
}

class demo2 extends demo{

	@Override
	void run() {
		System.out.println("inside the run method");
	}

	@Override
	void walk() {	
		System.out.println("inside the walk method");
	}
}

public class AbstractExmple {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException{
		demo2 obj = new demo2();
		obj.run();
		obj.walk();
		
		/*Class<?> c = Class.forName("demo");
		demo t = (demo)c.newInstance();
		
		Method m = c.getDeclaredMethod("sleep", null);
		m.setAccessible(true);
		m.invoke(t,null);
		*/
	}
}
