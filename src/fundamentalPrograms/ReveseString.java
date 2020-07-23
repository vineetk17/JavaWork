//Program to Reverse A String

package fundamentalPrograms;

import java.util.Scanner;

public class ReveseString {

	public static void main(String[] args) {
		
		String str,str1 = "";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the string: ");
		str = sc.next();
		
		int len= str.length();
		
		for(int i=len-1;i>=0;i--){
			
			str1= str1 + str.charAt(i);
		}
		System.out.println("reverse string is : "+str1);
	}
}
