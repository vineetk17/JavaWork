package fundamentalPrograms;

import java.util.Scanner;

public class ReverseNmber {

	public static void main(String[] args) {
		
		int rem=0,rev=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to reverse: ");
		int num= sc.nextInt();
		
		while(num!=0) {
			rem= num%10;
			rev= rev *10 + rem;
			num=num/10;
		}
		System.out.println("reverse number is: "+rev);
	}

}
