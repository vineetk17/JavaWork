package Constructor;

class newclass1 {   
	    
	public newclass1() {
	        System.out.println("Parent Constructor");
	    }    
	    
	    static {
	        System.out.println("Parent static block");    
	    }
	    
	    {
	        System.out.println("Parent initialisation  block");
	    }
	}

class newclass extends newclass1 {    
	    {
	        System.out.println("Child initialisation block");
	    }
	    
	    static {
	        System.out.println("Child static block");
	    }

	    public newclass() {
	        System.out.println("Child Constructor");
	    }
	    
	    public static void main(String[] args) {
	        new newclass();    
	    }
}
