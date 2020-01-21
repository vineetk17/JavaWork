//when we create the object of the child class, Parent class contractor will get called automatically with child class constructor.
//Hashcode method is used to fetch the Hashcode value of the entity.

package Constructor;


class abc{
	abc(){
		System.out.println("parent class constructor: "+this.hashCode());
	}
}

class qwe extends abc{
	qwe(){
		System.out.println("Child class constructor: "+this.hashCode());
	}
	
	void run()
	{
		String run = "vin";
		System.out.println("*******run class object**********: "+run.hashCode());
	}
}

public class consturct {

	public static void main(String[] args) {
		
		qwe obj= new qwe();
		obj.run();
		System.out.println("Child class object: "+obj.hashCode());
		abc obj1= new abc();
		System.out.println("Parent class object: "+obj1.hashCode());
	}

}
