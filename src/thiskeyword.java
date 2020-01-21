
public class thiskeyword {
	int a=909; 
	int b=070; 
		      
		    // Parameterized constructor 
		    thiskeyword(int a, int b) 
		    { 
		        this.a = a; 
		        this.b = b; 
		    } 
		  
		    void display() 
		    { 
		    	//a=80; 
		    	//b=80; 
		        //Displaying value of variables a and b 
		        System.out.println("a = " + a + "  b = " + b); 
		        System.out.println("a = " + this.a + "  b = " + this.b);
		        
		        
		        int ab=024;
		        
		        System.out.println(ab);
		    } 
		  
		    public static void main(String[] args) 
		    { 
		    	thiskeyword object = new thiskeyword(10, 20); 
		        object.display(); 
		    }
}
