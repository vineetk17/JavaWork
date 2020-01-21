class newclass1
{  
	{
		System.out.println("Parent initialisation  block");
	}
}

public class newclass extends newclass1 
{    
		    {
		        System.out.println("Child initialisation block");
		    }
		    
		    {
		        System.out.println("Child static block");
		    }

		    public newclass() {
		        System.out.println("Child Constructor");
		    }   
		    
		    public static void main(String[] args) {
		        new newclass();    
		    }
}
