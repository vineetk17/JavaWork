package fundamentalPrograms;

import java.util.Scanner;

public class greater {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		
		
		System.out.println("Enter number A:");
		a=sc.nextInt();
		System.out.println("Enter number B:");
		b=sc.nextInt();
		System.out.println("Enter number C:");
		c=sc.nextInt();
		
		if(a>b) {
			if(a>c)
				System.out.println("A is greater than all");
			else
				System.out.println("C is greater than all");
		}
		else if(b>c)
			System.out.println("B is greater than all");
		else
			System.out.println("C is greater than all");
	}
}
