// Convert Integer into digits

package fundamentalPrograms;

import java.util.Scanner;

public class IntegerToDigit {

	public static void main(String[] args) {
		
		int count=0, digit;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num= sc.nextInt();
		
		int temp=num;
		
		while(num>0){
			num=num/10;
			count++;
		}
		
		System.out.println("Total Count is: "+count);
		
		while(temp>0) {
			
			digit=temp%10;
			System.out.println("value at "+count+" is: "+digit);
			temp=temp/10;
			count--;
		}
	}
}
