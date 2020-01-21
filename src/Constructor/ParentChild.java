package Constructor;

class parent{
	
	String name;
	int roll;
	
	parent(String name,int roll){
		this.name=name;
		this.roll=roll;
	}
}

class child extends parent{
	
	String sub;
	int marks;
	
	child(String name,int roll, String sub, int marks){
		super(name,roll);
		this.sub=sub;
		this.marks=marks;
	}
	
	void print()
	{
		System.out.println("name is: "+name+",\nroll no. is: "+roll+",\nsub is: "+sub+",\nmarks are: "+marks);
	}
}

public class ParentChild {

	public static void main(String[] args) {
		
		child c = new child("vin",21,"maths",80);
		c.print();
	}

}
